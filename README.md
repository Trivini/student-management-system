# student-management-system
# Student Management System (Spring Boot + MySQL)

REST API for managing students with CRUD operations.
Bulk API testing performed using Postman Collection Runner with CSV dataset.

## Tech Stack
Java 17, Spring Boot, Spring Data JPA, MySQL, Maven, Postman

## Run
- Create DB: student_db
- Update application.properties
- mvn spring-boot:run

## API
POST /api/students
GET /api/students
GET /api/students/{id}
PUT /api/students/{id}
DELETE /api/students/{id}
