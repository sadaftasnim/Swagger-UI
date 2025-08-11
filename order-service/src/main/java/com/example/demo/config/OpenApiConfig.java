package com.example.demo.config;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Order Service API")
                        .version("1.0.0")
                        .description("API documentation for Order Service in the E-Commerce Microservices project")
                        .contact(new Contact()
                                .name("Sadaf Tasnim")
                                .email("sadaf@example.com")
                                .url("https://yourwebsite.com")
                        )
                );
    }
}

