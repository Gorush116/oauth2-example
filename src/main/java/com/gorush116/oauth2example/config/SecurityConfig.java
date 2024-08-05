package com.gorush116.oauth2example.config;

import com.gorush116.oauth2example.userinfo.service.KakaoOAuth2UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@RequiredArgsConstructor
@EnableWebSecurity
public class SecurityConfig {
    private final KakaoOAuth2UserService kakaoOAuth2UserService;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf(withDefaults())
                .cors(withDefaults())
                .authorizeHttpRequests(request -> request
                        .requestMatchers("/index.html",
                                "/images/**",
                                "/permitAllConents.html")
                        .permitAll()
                        .requestMatchers("/user").hasRole("USER")
                        .anyRequest().authenticated())
                .oauth2Login(oauth2 -> oauth2.userInfoEndpoint(userInfo -> userInfo
                        .userService(kakaoOAuth2UserService)))
                .logout(withDefaults());
        return http.build();
    }
}