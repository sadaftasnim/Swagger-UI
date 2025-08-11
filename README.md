# Microservices API Documentation with Swagger UI

This project contains 4 microservices and an API Gateway, all integrated with **Swagger UI** for interactive API documentation.

## Services

| Service           | Swagger UI URL                                                                              |
|-------------------|---------------------------------------------------------------------------------------------|
| API Gateway       | [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)  |
| User Service      | [http://localhost:8081/swagger-ui/index.html](http://localhost:8081/swagger-ui/index.html)  |
| Product Service   | [http://localhost:8082/swagger-ui/index.html](http://localhost:8082/swagger-ui/index.html)  |
| Order Service     | [http://localhost:8083/swagger-ui/index.html](http://localhost:8083/swagger-ui/index.html)  |
| Inventory Service | [http://localhost:8084/swagger-ui/index.html](http://localhost:8084/swagger-ui/index.html)  |

## Overview

- The project implements 4 individual microservices:
  - **User Service**: Handles user-related operations.
  - **Product Service**: Manages product data and actions.
  - **Inventory Service**: Keeps track of stock and availability.
  - **Order Service**: Processes customer orders.

- An **API Gateway** acts as a single entry point for all services and routes requests accordingly.

- Each service is documented with Swagger UI, providing interactive API documentation accessible via the URLs above.

## Features

- **Centralized API gateway** for routing and security.
- **Swagger UI** integrated on each service and gateway to visualize API endpoints.
- Easy to test and explore APIs through web-based Swagger interface.
- Clear separation of concerns using microservices architecture.

## How to run

1. Start each microservice on its respective port (8081 - 8084).
2. Start the API Gateway on port 8080.
3. Access Swagger UI for each service using the URLs above.
4. Use the API Gateway Swagger UI to explore all APIs in a single place.

## End Result
  - **User Service**: Handles user-related operations.
    <img width="874" height="469" alt="image" src="https://github.com/user-attachments/assets/9efbb625-bcce-4dac-9eec-3801c553b94c" />

  - **Product Service**: Manages product data and actions.
    <img width="875" height="439" alt="image" src="https://github.com/user-attachments/assets/a0d1ba85-89dc-419f-a771-ddd82d8abe07" />

  - **Inventory Service**: Keeps track of stock and availability.
    <img width="883" height="355" alt="image" src="https://github.com/user-attachments/assets/77708937-9989-4c8f-a8f8-91c198e14ed0" />

  - **Order Service**: Processes customer orders.
    <img width="875" height="461" alt="image" src="https://github.com/user-attachments/assets/6cc576ce-037f-477c-a5ef-84bae335bda3" />
    
  - **API Gateway**: Acts as a single entry point for all services and routes requests accordingly.
    <img width="1806" height="721" alt="image" src="https://github.com/user-attachments/assets/39af23d6-b078-43a6-a1a4-2f7b8059ca99" />

