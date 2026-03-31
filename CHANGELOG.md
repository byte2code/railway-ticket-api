# Changelog

All notable changes to this project are documented in this file.

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
