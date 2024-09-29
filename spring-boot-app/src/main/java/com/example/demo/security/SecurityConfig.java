// package com.example.demo.security;


// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import static org.springframework.security.config.Customizer.withDefaults;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;

// @Configuration
// @EnableWebSecurity
// public class SecurityConfig extends WebSecurityConfigurerAdapter {

//     @Override
//     protected void configure(HttpSecurity http) throws Exception {
//         http.cors() 
//                 .csrf(csrf -> csrf.disable())
//                 .authorizeRequests(requests -> requests
//                         .requestMatchers("/hello").authenticated()
//                         .and()
//                         .httpBasic(withDefaults())));
//     }

//     @Bean
//     public PasswordEncoder passwordEncoder() {
//         return new BCryptPasswordEncoder();
//     }
// }


