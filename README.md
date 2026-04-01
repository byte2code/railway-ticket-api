# Railway Ticket API

Spring Boot REST API for managing railway tickets with in-memory storage, CRUD operations, and pantry-service integration through `RestTemplate` GET and POST calls.

## Overview

This project demonstrates a compact Spring Boot API for railway ticket management with a simple inter-service communication pattern. It builds on the earlier CRUD-style ticket workflow by both fetching meal details from a pantry service during ticket lookup and posting meal details to that service when a ticket is created.

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
- `getForObject()` usage for external reads
- `postForEntity()` usage for external writes
- Default meal creation when meal details are not provided

## Tech Stack

- Java 17
- Spring Boot 3
- Spring Web
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
    ├── main/
    │   ├── java/railway/com/example/RailwayAndMeal/
    │   │   ├── communicator/
    │   │   ├── controller/
    │   │   ├── customException/
    │   │   ├── Entity/
    │   │   ├── service/
    │   │   └── RailwayAndMealApplication.java
    │   └── resources/
    │       └── application.properties
    └── test/
        └── java/railway/com/example/RailwayAndMeal/
```

## How to Run

1. Open a terminal in the project root.
2. Run `mvn test`.
3. Run `mvn spring-boot:run`.
4. Ensure the pantry or meal service is available on `http://localhost:8081`.
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
  "birth": "LOWER",
  "meal": {
    "pnr": 1234567890,
    "mealType": "North Indian",
    "premium": false,
    "mealTime": "Lunch"
  }
}
```

## Learning Highlights

- Shows how a basic railway ticket API can evolve into a two-service integration example
- Demonstrates outbound REST reads and writes using `RestTemplate`
- Adds default meal assignment to keep ticket creation resilient when meal data is omitted
- Keeps persistence intentionally simple so the service-to-service flow stays easy to follow

## GitHub Metadata

- Suggested repository description: `Java 17 Spring Boot REST API for railway ticket management with CRUD operations and pantry-service integration using RestTemplate GET and POST calls.`
- Suggested topics: `java`, `java-17`, `spring-boot`, `rest-api`, `resttemplate`, `microservices`, `railway-ticket`, `service-integration`, `maven`, `learning-project`, `portfolio-project`
