package com.gentech.springboot_securitydemo1.config;

import com.gentech.springboot_securitydemo1.serviceimpl.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
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

    @Autowired
    private MyUserDetailsService userDetailsService;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .csrf(AbstractHttpConfigurer -> AbstractHttpConfigurer.disable())
                .authorizeHttpRequests(request ->{
                    request.requestMatchers("/home","register/user").permitAll();
                    request.requestMatchers("/user/home").hasRole("USER");
                    request.requestMatchers("/admin/home").hasRole("ADMIN");
                    request.anyRequest().authenticated();
                })
            //    .formLogin(formLogin -> formLogin.permitAll())
                .httpBasic(Customizer.withDefaults())
                .build();
    }

//    @Bean
//    public UserDetailsService userDetailsService()
//    {
//        UserDetails normalUser= User.builder()
//                .username("john")
//                .password("$2a$12$VV7cOI0u7Jrk1tS9inChie/mGdIuEzFX56EZBpVKBgsJcMmAoqWhm")
//                .roles("USER")
//                .build();
//
//        UserDetails adminUser=User.builder()
//                .username("adams")
//                .password("$2a$12$ZE1bPqTPf5fGXcunBVvmOeYunPVYBSatmK1VuHudz1HkrFga9kLyi")
//                .roles("ADMIN","USER")
//                .build();
//        return new InMemoryUserDetailsManager(normalUser, adminUser);
//    }

    @Bean
    public MyUserDetailsService userDetailsService()
    {
        return userDetailsService;
    }

    @Bean
    public AuthenticationProvider authenticationProvider()
    {
        DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailsService);
        provider.setPasswordEncoder(passwordEncoder());
        return provider;
    }

    @Bean
    public PasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder();
    }
}
