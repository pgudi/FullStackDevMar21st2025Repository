package com.gentech.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .csrf(AbstractHttpConfigurer -> AbstractHttpConfigurer.disable())
                .authorizeHttpRequests(request ->{
                    request.requestMatchers("/home","api/v1/home").permitAll();
                    request.requestMatchers("/api/v1/user/home").hasRole("USER");
                    request.requestMatchers("/api/v1/admin/home").hasRole("ADMIN");
                    request.anyRequest().authenticated();
                })
                .formLogin(formLogin -> formLogin.permitAll())
                .build();
    }

    @Bean
    public UserDetailsService userDetailsService()
    {
        UserDetails normalUser= User.builder()
                .username("scott")
             //   .password("$2a$12$Vq/mygRQ8BlhFusziozPFekfa26Ug3fRwz/CwvXqe9SJy060BnC5y")
                .password(passwordEncoder().encode("welcome123"))
                .roles("USER")
                .build();

        UserDetails adminUser=User.builder()
                .username("adams")
              //  .password("$2a$12$Vq/mygRQ8BlhFusziozPFekfa26Ug3fRwz/CwvXqe9SJy060BnC5y")
                .password(passwordEncoder().encode("welcome123"))
                .roles("ADMIN","USER")
                .build();
        return new InMemoryUserDetailsManager(normalUser, adminUser);
    }

    @Bean
    public PasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder();
    }
}
