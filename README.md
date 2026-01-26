# 🎓 Exam Seating Management System

A Spring Boot–based backend application for managing exam seating with **Admin authentication, JWT security, hall capacity management, and Swagger API documentation**.

---

## 🚀 Features

### 🔐 Security
- Spring Security integration
- JWT-based authentication
- Admin login API
- Secured endpoints

### 👨‍💼 Admin
- Admin login using username & password
- JWT token generation
- Token-based authorization

### 🧑‍🎓 Students
- Add students
- View all students
- Auto seat allocation
- Reset seating

### 🏫 Hall Management
- Add halls
- Set hall capacity
- Allocate students based on capacity

### 📄 API Documentation
- Swagger UI
- OpenAPI JSON

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot 3.2.5
- Spring Security
- JWT (io.jsonwebtoken)
- Spring Data JPA
- H2 Database (dev)
- Swagger / OpenAPI
- Maven

---

## 📂 Project Structure

# 🎓 Exam Seating Management System

A Spring Boot–based backend application for managing exam seating with **Admin authentication, JWT security, hall capacity management, and Swagger API documentation**.

---

## 🚀 Features

### 🔐 Security
- Spring Security integration
- JWT-based authentication
- Admin login API
- Secured endpoints

### 👨‍💼 Admin
- Admin login using username & password
- JWT token generation
- Token-based authorization

### 🧑‍🎓 Students
- Add students
- View all students
- Auto seat allocation
- Reset seating

### 🏫 Hall Management
- Add halls
- Set hall capacity
- Allocate students based on capacity

### 📄 API Documentation
- Swagger UI
- OpenAPI JSON

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot 3.2.5
- Spring Security
- JWT (io.jsonwebtoken)
- Spring Data JPA
- H2 Database (dev)
- Swagger / OpenAPI
- Maven

---

## 📂 Project Structure
exam-seating
├── src/main/java/com/example/exam_seating
│ ├── controller
│ │ ├── AuthController.java
│ │ └── StudentController.java
│ ├── entity
│ │ ├── Admin.java
│ │ ├── Hall.java
│ │ └── Student.java
│ ├── repository
│ │ ├── AdminRepository.java
│ │ ├── HallRepository.java
│ │ └── StudentRepository.java
│ ├── security
│ │ ├── JwtUtil.java
│ │ ├── JwtFilter.java
│ │ └── SecurityConfig.java
│ ├── service
│ │ ├── AdminService.java
│ │ ├── HallService.java
│ │ └── StudentService.java
│ ├── exception
│ │ └── GlobalExceptionHandler.java
│ └── ExamSeatingApplication.java
│
├── src/main/resources
│ ├── application.properties
│ └── static/index.html
│
├── pom.xml
└── README.md



---

## ⚙️ Configuration

### application.properties
```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

mvn clean spring-boot:run
Application runs on:

arduino
Copy code
http://localhost:8080
🔑 Authentication Flow
Admin Login
http
Copy code
POST /auth/login
Content-Type: application/json

{
  "username": "admin",
  "password": "admin123"
}
Response
json
Copy code
{
  "token": "JWT_TOKEN"
}
Use Token in APIs
makefile
Copy code
Authorization: Bearer JWT_TOKEN
📘 Swagger Documentation
Swagger UI
👉 http://localhost:8080/swagger-ui/index.html

OpenAPI JSON
👉 http://localhost:8080/v3/api-docs

🧪 H2 Database Console
bash
Copy code
http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:testdb

Username: sa

Password: (empty)

📌 Future Enhancements
MySQL integration for production

Role-based access (Admin / Student)

Frontend UI (React / Angular)

Deployment on Render / AWS

👩‍💻 Author
Bhoovika
Final Year CSE
Spring Boot | Backend Development

⭐ GitHub
If you like this project, give it a ⭐

yaml
Copy code

---

# 🧠 After updating README → push it

```bash
git add README.md
git commit -m "Update README with project documentation"
git push origin main
