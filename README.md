# 🎓 Exam Seating Application

A full-stack **Spring Boot Exam Seating Management System** that automatically allocates seat numbers to students hall-wise and provides a clean web UI for CRUD operations.

---

## 🚀 Features
- Add student with automatic seat allocation
- Bulk student upload
- Update & delete student records
- Hall-wise seating arrangement
- RESTful APIs
- Clean and responsive UI

---

## 🛠 Tech Stack
- **Backend:** Java, Spring Boot, Spring Data JPA
- **Frontend:** HTML, CSS, JavaScript
- **Database:** MySQL
- **Build Tool:** Maven
- **Version Control:** Git & GitHub

---

## 📂 Project Structure
exam-seating/
├── controller
├── service
├── repository
├── entity
├── exception
├── resources
│ └── static/index.html

---

## 🔗 API Endpoints

| Method | Endpoint | Description |
|------|--------|-------------|
| POST | /students | Add student |
| POST | /students/bulk | Bulk add |
| GET | /students | Get all students |
| PUT | /students/{id} | Update student |
| DELETE | /students/{id} | Delete student |
| GET | /students/seating-arrangement | Hall-wise seating |

---

## ▶️ How to Run
```bash
mvn spring-boot:run
