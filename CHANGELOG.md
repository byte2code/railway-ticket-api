# Changelog

All notable changes to this project are documented in this file.

## [v7.0.0] - 2026-04-01

### Summary
Seventh version of the Railway Ticket API that completes pantry-service synchronization for ticket update and delete operations and adds a premium-meal update endpoint.

### Highlights

- Added pantry-service delete integration using `RestTemplate#exchange()` with `DELETE`.
- Added pantry-service update integration using `RestTemplate#exchange()` with `PUT`.
- Added `PUT /railway/ticket/{pnr}/premium/{isPremium}` for updating meal premium status by PNR.
- Updated the service layer to synchronize meal updates and deletes alongside ticket changes.
- Refreshed the README to present the project as a fuller cross-service CRUD integration example.

### Notes

This version expands the railway project from create/read pantry coordination into a more complete two-service lifecycle workflow.

## [v6.0.0] - 2026-04-01

### Summary
Sixth version of the Railway Ticket API that extends the pantry-service integration by posting meal details during ticket creation.

### Highlights

- Added pantry-service write integration using `RestTemplate#postForEntity()`.
- Updated ticket creation to save associated meal details in the external pantry service.
- Added default meal values when ticket creation does not include a meal payload.
- Restored a basic Spring Boot application test in the project source.
- Refreshed the README to present both the read and write integration flow clearly.

### Notes

This version evolves the project from read-only external integration into two-way service communication while keeping the core in-memory ticket workflow unchanged.

## [v5.0.0] - 2026-04-01

### Summary
Fifth version of the Railway Ticket API that adds meal-service integration using `RestTemplate#getForEntity()` when fetching ticket details.

### Highlights

- Added a `Meal` entity to model pantry-service meal details.
- Added `MealServiceCommunicator` to call the external meal service.
- Updated ticket retrieval to enrich responses with meal information by PNR.
- Added a `RestTemplate` bean to the application configuration.
- Refreshed the README to position the project as an inter-service communication learning showcase.

### Notes

This version extends the project from standalone CRUD into a simple service-composition example while preserving the existing in-memory ticket workflow.

## [v4.0.0] - 2026-03-31

### Summary
Fourth version of the Railway Ticket API that adds request-body validation so invalid ticket payloads fail fast with clear `400 BAD REQUEST` responses.

### Highlights

- Added Bean Validation support through `spring-boot-starter-validation`.
- Added validation constraints to the `Ticket` model.
- Added `TicketBodyInvalidException` mapped to HTTP `400 BAD REQUEST`.
- Updated create and update endpoints to validate incoming payloads before service execution.
- Added controller tests for invalid request-body scenarios.

### Notes

This version improves API reliability by enforcing basic input quality at the controller boundary, making the project stronger as a REST validation showcase.

## [v3.0.0] - 2026-03-31

### Summary
Third version of the Railway Ticket API that strengthens the CRUD workflow with custom exception handling for missing tickets and duplicate PNR submissions.

### Highlights

- Added `TicketAlreadyExistsException` mapped to HTTP `409 CONFLICT`.
- Added `TicketNotFoundException` mapped to HTTP `404 NOT FOUND`.
- Updated the service layer to validate duplicate ticket creation.
- Updated the service layer to fail clearly when a requested PNR is missing.
- Expanded tests to cover duplicate and not-found cases.

### Notes

This version makes the API more realistic as a learning project by improving error handling and response behavior around common edge cases.

## [v2.0.0] - 2026-03-31

### Summary
Second version of the Railway Ticket API that expands the project from basic create/read operations into a fuller CRUD-style REST service.

### Highlights

- Added `PUT /railway/ticket` for updating ticket data.
- Added `DELETE /railway/ticket/{pnr}` for deleting tickets by PNR.
- Extended the service layer with update and delete logic.
- Refreshed the README to reflect the expanded API surface.
- Added service-level tests for the new ticket lifecycle behavior.

### Notes

This version improves the project’s usefulness as a REST API learning showcase by covering more of the typical ticket-management workflow.

## [v1.0.0] - 2026-03-31

### Summary
Initial publication of the Railway Ticket API as a portfolio-ready Spring Boot REST project.

### Highlights

- Added a recruiter-friendly README with API overview, features, and run steps.
- Added a changelog for future version tracking.
- Cleaned project junk files and prepared the repository for GitHub publishing.
- Preserved the original ticket API logic and structure.

### Notes

This version establishes the project as a compact REST API learning showcase for railway ticket management.
