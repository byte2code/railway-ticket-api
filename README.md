# Railway Ticket API

Spring Boot REST API for saving railway tickets in memory and retrieving them by PNR or as a full ticket list.

## Overview

This project demonstrates a compact Spring Boot API for basic railway ticket management. It focuses on request handling, simple in-memory data storage, and layered service design in a beginner-friendly format that is easy to review and extend.

## Concepts and Features Covered

- Spring Boot REST API setup
- `POST` endpoint for saving ticket data
- `GET` endpoint for listing all saved tickets
- `GET` endpoint for retrieving a ticket by PNR
- Service-layer separation from controller logic
- In-memory storage using `List` and `Map`
- JSON request and response handling

## Tech Stack

- Java 17
- Spring Boot 3
- Spring Web
- Maven
- JUnit 5

## How to Run

1. Open a terminal in the project root.
2. Run `mvn test` to verify the application context.
3. Run `mvn spring-boot:run`.
4. Use the API under `http://localhost:8080/railway`.

Useful endpoints:

- `POST /railway/ticket`
- `GET /railway/tickets`
- `GET /railway/ticket/{pnr}`

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

- Shows how to build a simple REST controller around a service layer
- Demonstrates path variables and request-body binding in Spring Boot
- Uses in-memory collections to model basic data persistence without a database
- Works well as a starter project for API design and endpoint testing
