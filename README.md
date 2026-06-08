# Payment Gateway Service

A backend payment gateway built to explore production payment concepts:
idempotent payment creation, a payment state machine, and async webhook handling.

## Tech Stack
- Java 21, Spring Boot
- PostgreSQL (persistence)
- Redis (idempotency keys, caching)
- Docker / Docker Compose

## Status
🚧 In active development.

- [x] Project skeleton + `/health` endpoint
- [ ] Postgres + create payment endpoint
- [ ] Idempotency layer
- [ ] Payment state machine
- [ ] Mock PSP + webhooks

## Running locally
```bash
./mvnw spring-boot:run
# health check
curl http://localhost:8080/health
```