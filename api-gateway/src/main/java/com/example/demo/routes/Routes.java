package com.example.demo.routes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RequestPredicates;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;
import org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions;
import org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions;

import static org.springframework.cloud.gateway.server.mvc.filter.FilterFunctions.setPath;

@Configuration
public class Routes {

    @Value("${product.service.url}")
    private String productServiceUrl;

    @Value("${order.service.url}")
    private String orderServiceUrl;

    @Value("${inventory.service.url}")
    private String inventoryServiceUrl;

    @Value("${user.service.url}")
    private String userServiceUrl;

    // Product Service Route
    @Bean
    public RouterFunction<ServerResponse> productServiceRoute() {
        return GatewayRouterFunctions.route("product_service")
                .route(RequestPredicates.path("/api/product/**"), HandlerFunctions.http(productServiceUrl))
                .build();
    }

    // Product Swagger Route
    @Bean
    public RouterFunction<ServerResponse> productServiceSwaggerRoute() {
        return GatewayRouterFunctions.route("product_service_swagger")
                .route(RequestPredicates.path("/product-service/v3/api-docs"), HandlerFunctions.http(productServiceUrl))
                .filter(setPath("/v3/api-docs"))
                .build();
    }

    // Order Service Route
    @Bean
    public RouterFunction<ServerResponse> orderServiceRoute() {
        return GatewayRouterFunctions.route("order_service")
                .route(RequestPredicates.path("/api/order/**"), HandlerFunctions.http(orderServiceUrl))
                .build();
    }

    // Order Swagger Route
    @Bean
    public RouterFunction<ServerResponse> orderServiceSwaggerRoute() {
        return GatewayRouterFunctions.route("order_service_swagger")
                .route(RequestPredicates.path("/order-service/v3/api-docs"), HandlerFunctions.http(orderServiceUrl))
                .filter(setPath("/v3/api-docs"))
                .build();
    }

    // Inventory Service Route
    @Bean
    public RouterFunction<ServerResponse> inventoryServiceRoute() {
        return GatewayRouterFunctions.route("inventory_service")
                .route(RequestPredicates.path("/api/inventory/**"), HandlerFunctions.http(inventoryServiceUrl))
                .build();
    }

    // Inventory Swagger Route
    @Bean
    public RouterFunction<ServerResponse> inventoryServiceSwaggerRoute() {
        return GatewayRouterFunctions.route("inventory_service_swagger")
                .route(RequestPredicates.path("/inventory-service/v3/api-docs"), HandlerFunctions.http(inventoryServiceUrl))
                .filter(setPath("/v3/api-docs"))
                .build();
    }

    // User Service Route
    @Bean
    public RouterFunction<ServerResponse> userServiceRoute() {
        return GatewayRouterFunctions.route("user_service")
                .route(RequestPredicates.path("/api/user/**"), HandlerFunctions.http(userServiceUrl))
                .build();
    }

    // User Swagger Route
    @Bean
    public RouterFunction<ServerResponse> userServiceSwaggerRoute() {
        return GatewayRouterFunctions.route("user_service_swagger")
                .route(RequestPredicates.path("/user-service/v3/api-docs"), HandlerFunctions.http(userServiceUrl))
                .filter(setPath("/v3/api-docs"))
                .build();
    }
}
