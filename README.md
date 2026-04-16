# ✈️ Flight Reservation System 

## 📌 Overview
The **Flight Reservation System** is a Spring Boot-based backend application for managing flight bookings and reservations.

It is designed following microservice principles, where services communicate via REST APIs. This service collaborates with the Flight Check-In Service to handle the complete booking and check-in workflow.

The project demonstrates key backend engineering concepts including layered architecture, RESTful API design, and inter-service communication in a distributed system.

---

## 🧩 Microservice Architecture

This system consists of two independent services:

### ✈️ Flight Reservation Service (This Project)
- Handles flight search and booking
- Manages reservations and passenger data
- Exposes REST APIs for external services

### 🧾 Flight Check-In Service
- Consumes reservation APIs
- Handles passenger check-in process
- Updates reservation status (checked-in, baggage info)

---

### 🔗 Communication Flow

- Services communicate using **REST APIs (HTTP)**
- Example:

GET /reservations/{id}
POST /reservations
- Check-in service uses `RestTemplate` to consume reservation APIs

---

## 🧱 Tech Stack

### Backend
- Java
- Spring Boot
- Spring MVC
- Spring Data JPA (Hibernate)

### Frontend
- JSP
- JSTL

### Database
- MySQL

---

## 🚀 Features

### 👤 User Management
- User registration
- User login (basic authentication)

### 🔍 Flight Search
- Search flights by:
- Departure city
- Arrival city
- Departure date

### 🛫 Reservation Management
- Select available flights
- Enter passenger details
- Create flight reservation
- View booking confirmation

### 📦 REST API Support
- Get reservation by ID
- Update reservation (check-in status, baggage count)

---

## 📂 Project Structure

```
src/main/java/com/yourpackage/
│
├── controller/
│ ├── FlightController.java
│ ├── ReservationController.java
│ ├── ReservationRestController.java
│ └── UserController.java
│
├── service/
│ ├── ReservationService.java
│ └── ReservationServiceImpl.java
│
├── repository/
│ ├── FlightRepository.java
│ ├── PassengerRepository.java
│ ├── ReservationRepository.java
│ └── UserRepository.java
│
├── entity/
│ ├── Flight.java
│ ├── Passenger.java
│ ├── Reservation.java
│ └── User.java
│
└── dto/
├── ReservationRequestDto.java
└── ReservationUpdateRequestDto.java
```
---

## 🔄 Application Flow

1. User registers or logs in
2. User searches for flights
3. System displays available flights
4. User selects a flight
5. Passenger details are entered
6. Reservation is created and stored
7. Check-in service consumes reservation API for further processing

---

## 📡 API Endpoints

### 🔹 Web Endpoints

| Endpoint | Method | Description |
|----------|--------|-------------|
| `/findFlights` | POST | Search flights |
| `/showCompleteReservation` | GET | Show reservation form |
| `/completeReservation` | POST | Complete booking |
| `/showReg` | GET | Registration page |
| `/registerUser` | POST | Register user |
| `/login` | POST | Login user |

---

### 🔹 REST APIs

| Endpoint | Method | Description |
|----------|--------|-------------|
| `/reservations/{id}` | GET | Get reservation details |
| `/reservations` | POST | Update reservation |

---

## 🧠 Key Concepts Implemented

- Layered Architecture (Controller → Service → Repository)
- DTO Pattern
- JPA & Hibernate ORM
- RESTful API Design
- Service-to-Service Communication
- MVC Architecture with JSP

---

## 🗄️ Database Design (Schema)

### ✈️ Flight Table
```sql
CREATE TABLE flight (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    flight_number INT,
    operating_airlines VARCHAR(255),
    departure_city VARCHAR(255),
    arrival_city VARCHAR(255),
    date_of_departure DATE,
    estimated_departure_time TIMESTAMP
);
Passenger Table
CREATE TABLE passenger (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(255),
    middle_name VARCHAR(255),
    last_name VARCHAR(255),
    email VARCHAR(255),
    phone VARCHAR(50)
);
🎫 Reservation Table
CREATE TABLE reservation (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    checked_in BOOLEAN,
    number_of_bags INT,
    passenger_id BIGINT,
    flight_id BIGINT,
    FOREIGN KEY (passenger_id) REFERENCES passenger(id),
    FOREIGN KEY (flight_id) REFERENCES flight(id)
);
👨‍💻 User Table
CREATE TABLE user (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    email VARCHAR(255),
    password VARCHAR(255)
);
⚠️ Limitations
1. Password stored in plain text (not secure)
2. No Spring Security implementation
3. No input validation or exception handling
4. Hardcoded service URLs in check-in service
5. JSP frontend tightly coupled with backend
🛠️ Future Improvements
1. Implement Spring Security (JWT authentication)
2. Encrypt passwords using BCrypt
3. Add global exception handling
4. Replace RestTemplate with Feign Client
5. Introduce Eureka Service Discovery
6. Add API Gateway (Spring Cloud Gateway)
7. Externalize configuration using Spring Cloud Config
8. Migrate frontend to Angular or React
▶️ How to Run

1. Clone repository
git clone https://github.com/your-username/flight-reservation-system.git

2. Configure database in application.properties

## Database Setup

- Create database:
   CREATE DATABASE reservation;

- Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/reservation
spring.datasource.username=root
spring.datasource.password=root

3. Run the application
mvn spring-boot:run

4. Open browser:
http://localhost:8080/showLogin

👨‍💻 Author
Lokman Hossain
Java Backend Developer
