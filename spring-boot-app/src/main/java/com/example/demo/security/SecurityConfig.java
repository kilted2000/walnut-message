 package com.example.demo.security;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.Customizer;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.core.userdetails.User;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.security.provisioning.InMemoryUserDetailsManager;
// import org.springframework.security.web.SecurityFilterChain;
// @Configuration
// @EnableWebSecurity
// public class SecurityConfig{

//     @Bean
//     public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//         http
//                 .csrf(csrf -> csrf.disable())
//                 .authorizeHttpRequests((auth) -> auth
//                                 .requestMatchers("/hello").hasRole("USER").anyRequest().authenticated()
//                 )
//                 .httpBasic(Customizer.withDefaults());
                

//         return http.build();
//     }



//     @Bean
//     public PasswordEncoder passwordEncoder() {
//         return new BCryptPasswordEncoder();
//     }
//        @Bean
//     public InMemoryUserDetailsManager userDetailsService() {
        	
//             UserDetails user = User.builder()
//                 .username("user")
//                 .password(passwordEncoder().encode("password")) 
//                 .roles("USER")
//                 .build();
              
//         return new InMemoryUserDetailsManager(user);
           
//     }
//}

// package com.example.demo.security;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.Customizer;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.core.userdetails.User;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.provisioning.InMemoryUserDetailsManager;
// import org.springframework.security.web.SecurityFilterChain;

// // @Configuration
// // @EnableWebSecurity
// // public class SecurityConfig {

// // @Bean
// // 	public UserDetailsService userDetailsService() {
// // 		UserDetails user = User.withDefaultPasswordEncoder()
// // 				.username("user")
// // 				.password("password")
// // 				.roles("USER")
// // 				.build();
// // 		return new InMemoryUserDetailsManager(user);
// // 	}
// // @Bean
// // public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
// // 	http
// // 		.authorizeHttpRequests(authorize -> authorize
// // 			.anyRequest().authenticated()
// // 		)
// // 		.formLogin(withDefaults())
// // 		.httpBasic(withDefaults());
// // 	return http.build();
// // }
// //     @Bean
// //     public PasswordEncoder passwordEncoder() {
// //         return new BCryptPasswordEncoder();
// //     }
// // }
// @Configuration
// @EnableWebSecurity
// public class SecurityConfig {

// 	@Bean
// 	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
// 		http
// 			.authorizeHttpRequests((authorize) -> authorize
// 				.anyRequest().authenticated()
// 			)
// 			.httpBasic(Customizer.withDefaults())
// 			.formLogin(Customizer.withDefaults());

// 		return http.build();
// 	}

// 	@Bean
// 	public UserDetailsService userDetailsService() {
// 		@SuppressWarnings("deprecation")
//         UserDetails userDetails = User.withDefaultPasswordEncoder()
// 			.username("user")
// 			.password("password")
// 			.roles("USER")
// 			.build();

// 		return new InMemoryUserDetailsManager(userDetails);
// 	}

// }

//package com.example.demo.config;




import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @SuppressWarnings({ "removal", "deprecation" })
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .cors() 
            .and()
            .csrf().disable() 
            .authorizeRequests()
            .anyRequest().permitAll(); 

        return http.build();
    }
}
