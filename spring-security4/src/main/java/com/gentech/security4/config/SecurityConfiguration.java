package com.gentech.security4.config;

import static org.springframework.security.config.Customizer.withDefaults;

import com.gentech.security4.service.MyUserDetailsService;
import com.gentech.security4.webtoken.JwtAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractAuthenticationFilterConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
	
	@Autowired
	private MyUserDetailsService userDetailsService;
	
	@Autowired
	private JwtAuthenticationFilter jwtAuthenticationFilter;
	@Bean
	public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((requests) -> 
		requests.requestMatchers("/home/**","/register/**","/authenticate").permitAll()
		.requestMatchers("/user/**").hasRole("USER")
		.requestMatchers("/admin/**").hasRole("ADMIN")
		.anyRequest().authenticated());
		
		http.csrf(csrf -> csrf.disable());
		http.formLogin(AbstractAuthenticationFilterConfigurer::permitAll);
		http.addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
		http.httpBasic(withDefaults());
		return http.build();
	}

/*	
	@Bean
	public UserDetailsService userDetailsService()
	{
		UserDetails normalUser=User.builder()
				.username("user1")
				.password(passwordEncoder().encode("welcome1"))
				.roles("USER")
				.build();
		UserDetails adminUser=User.builder()
				.username("admin")
				.password(passwordEncoder().encode("welcome1"))
				.roles("ADMIN")
				.build();
		return new InMemoryUserDetailsManager(normalUser, adminUser);
	}
*/	
	@Bean
	public PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public UserDetailsService userDetailsService()
	{
		return userDetailsService;
	}
	
	@Bean 
	public AuthenticationManager authenticationManager()
	{
		return new ProviderManager(authenticationProvider());
	}
	@Bean
	public AuthenticationProvider authenticationProvider()
	{
		DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(passwordEncoder());
		return provider;
	}
}
