package com.example.demo.config;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI inventoryServiceOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Inventory Service API")
                        .version("1.0.0")
                        .description("API documentation for Inventory Service in the E-Commerce Microservices project")
                        .contact(new Contact()
                                .name("Sadaf Tasnim")
                                .email("sadaf@example.com")
                                .url("https://your-portfolio.com")
                        )
                );
    }
}
