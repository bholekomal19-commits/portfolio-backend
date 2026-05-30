package com.tka.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import org.springframework.security.web.SecurityFilterChain;

@Configuration

public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(
            HttpSecurity http) throws Exception {

        http

            // Disable CSRF
            .csrf(csrf -> csrf.disable())

            // Disable Login Form
            .formLogin(form -> form.disable())

            // Disable HTTP Basic
            .httpBasic(httpBasic -> httpBasic.disable())

            // Allow All Requests
            .authorizeHttpRequests(auth -> auth

                    .anyRequest().permitAll()
            );

        return http.build();
    }
}