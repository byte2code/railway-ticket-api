# Railway Ticket API

Spring Boot REST API for managing railway tickets with in-memory storage, CRUD operations, validation, and external meal-service integration through `RestTemplate#getForEntity`.

## Overview

This project demonstrates a compact Spring Boot API for railway ticket management with a simple inter-service communication pattern. It builds on the earlier CRUD-style ticket workflow by fetching meal details from a separate pantry service when a ticket is retrieved, making the project a stronger microservice-learning showcase.

## Concepts and Features Covered

- Spring Boot REST API setup
- `POST` endpoint for saving ticket data
- `GET` endpoint for listing all saved tickets
- `GET` endpoint for retrieving a ticket by PNR
- `PUT` endpoint for updating an existing ticket
- `DELETE` endpoint for deleting a ticket by PNR
- In-memory storage using `List` and `Map`
- Request-body validation support
- Custom exception handling for invalid or missing tickets
- Service-to-service communication with `RestTemplate`
- `getForEntity()` usage for external API consumption

## Tech Stack

- Java 17
- Spring Boot 3
- Spring Web
- Spring Validation
- Maven
- JUnit 5

## Project Structure

```text
railway-ticket-api/
├── CHANGELOG.md
├── README.md
├── pom.xml
├── mvnw
├── mvnw.cmd
└── src/
    └── main/
        ├── java/railway/com/example/RailwayAndMeal/
        │   ├── communicator/
        │   ├── controller/
        │   ├── customException/
        │   ├── Entity/
        │   ├── service/
        │   └── RailwayAndMealApplication.java
        └── resources/
            └── application.properties
```

## How to Run

1. Open a terminal in the project root.
2. Run `mvn test`.
3. Run `mvn spring-boot:run`.
4. Ensure the meal service is available on `http://localhost:8081`.
5. Use the API under `http://localhost:8080/railway`.

Useful endpoints:

- `POST /railway/ticket`
- `GET /railway/tickets`
- `GET /railway/ticket/{pnr}`
- `PUT /railway/ticket`
- `DELETE /railway/ticket/{pnr}`

Example request body:

```json
{
  "pnr": 1234567890,
  "name": "Aarav",
  "age": 28,
  "birth": "LOWER"
}
```

## Learning Highlights

- Shows how a basic railway ticket API can evolve into an inter-service learning project
- Demonstrates `RestTemplate#getForEntity()` for consuming data from another service
- Keeps persistence intentionally simple so the service-to-service flow stays easy to follow
- Extends the project beyond CRUD into API composition using external meal details

## GitHub Metadata

- Suggested repository description: `Java 17 Spring Boot REST API for railway ticket management with CRUD operations, validation, and meal-service integration via RestTemplate.`
- Suggested topics: `java`, `java-17`, `spring-boot`, `rest-api`, `resttemplate`, `microservices`, `railway-ticket`, `inter-service-communication`, `maven`, `learning-project`, `portfolio-project`
