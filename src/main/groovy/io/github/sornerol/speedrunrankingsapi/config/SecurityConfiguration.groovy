package io.github.sornerol.speedrunrankingsapi.config

import groovy.transform.CompileStatic
import io.github.sornerol.speedrunrankingsapi.util.JwtFilter
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.web.AuthenticationEntryPoint
import org.springframework.security.web.SecurityFilterChain
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter


@CompileStatic
@Configuration
class SecurityConfiguration {

    private UserDetailsService userDetailsService
    private JwtFilter jwtFilter
    private AuthenticationEntryPoint authenticationEntryPoint

    @Autowired
    SecurityConfiguration(UserDetailsService userDetailsService, JwtFilter jwtFilter, AuthenticationEntryPoint authenticationEntryPoint) {
        this.userDetailsService = userDetailsService
        this.jwtFilter = jwtFilter
        this.authenticationEntryPoint = authenticationEntryPoint
    }

    @Bean
    BCryptPasswordEncoder passwordEncoder() {
        new BCryptPasswordEncoder()
    }

    @Bean
    AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) {
        authConfig.authenticationManager
    }

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) {
        http.csrf().disable()
                .authorizeHttpRequests()
                .antMatchers('/api/auth/login')
                .permitAll()
        http
                .authorizeHttpRequests()
                .anyRequest()
                .authenticated()
        http.exceptionHandling().authenticationEntryPoint(authenticationEntryPoint)
                .and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter)
        http.build()
    }
}
