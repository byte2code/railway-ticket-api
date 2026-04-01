# Railway Ticket API

Spring Boot REST API for managing railway tickets with in-memory storage, CRUD operations, and pantry-service integration through `RestTemplate` GET, POST, PUT, and DELETE calls.

## Overview

This project demonstrates a compact Spring Boot API for railway ticket management with a simple inter-service communication pattern. It builds on the earlier railway workflow by fetching meal details from a pantry service, creating default meal records during ticket creation, synchronizing meal updates and deletes, and exposing a dedicated endpoint for premium-meal updates.

## Concepts and Features Covered

- Spring Boot REST API setup
- `POST` endpoint for saving ticket data
- `GET` endpoint for listing all saved tickets
- `GET` endpoint for retrieving a ticket by PNR
- `PUT` endpoint for updating an existing ticket
- `DELETE` endpoint for deleting a ticket by PNR
- Dedicated `PUT` endpoint for updating meal premium status
- In-memory storage using `List` and `Map`
- Custom exception handling for invalid or missing tickets
- Service-to-service communication with `RestTemplate`
- `getForObject()` usage for external reads
- `postForEntity()` usage for external creates
- `exchange()` usage for external updates and deletes

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
4. Ensure the pantry or meal service is available on `http://localhost:8081`.
5. Use the API under `http://localhost:8080/railway`.

Useful endpoints:

- `POST /railway/ticket`
- `GET /railway/tickets`
- `GET /railway/ticket/{pnr}`
- `PUT /railway/ticket`
- `PUT /railway/ticket/{pnr}/premium/{isPremium}`
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

- Shows how a basic railway ticket API can coordinate full CRUD synchronization with another service
- Demonstrates `RestTemplate` patterns for read, create, update, and delete operations
- Adds a focused premium-update endpoint to illustrate targeted cross-service updates
- Keeps persistence intentionally simple so the service integration flow stays easy to follow

## GitHub Metadata

- Suggested repository description: `Java 17 Spring Boot REST API for railway ticket management with CRUD operations and pantry-service synchronization using RestTemplate.`
- Suggested topics: `java`, `java-17`, `spring-boot`, `rest-api`, `resttemplate`, `microservices`, `railway-ticket`, `service-integration`, `maven`, `learning-project`, `portfolio-project`
