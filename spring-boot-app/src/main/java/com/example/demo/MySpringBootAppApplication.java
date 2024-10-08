
package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class MySpringBootAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(MySpringBootAppApplication.class, args);
    }
    @Bean
        public WebMvcConfigurer corsConfigurer() {
            return new WebMvcConfigurer() {
                
                @Override
                public void addCorsMappings( @SuppressWarnings("null") CorsRegistry registry) {
                    registry.addMapping("/**") 
                            .allowedOrigins("http://localhost:5173") 
                            .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") 
                            .allowedHeaders("*") 
                            .allowCredentials(true);
                            
                }
            };
}
}