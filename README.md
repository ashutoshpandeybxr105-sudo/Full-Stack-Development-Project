# Full-Stack-Development-Project
# 🛒 Full Stack E-Commerce Project

A simple full-stack e-commerce application built using **Spring Boot (Backend)** and **HTML/CSS/JavaScript (Frontend)**.  
This project demonstrates basic product management, cart system, and order/payment flow.

---

## 🚀 Features

### 🖥️ Frontend
- Add products dynamically
- View product list
- Add to cart functionality
- Remove items from cart
- Checkout page
- View order history

### ⚙️ Backend (Spring Boot)
- REST APIs for products
- Order management system
- Payment simulation (without real gateway)
- MySQL database integration
- CRUD operations for products

---

## 🧰 Tech Stack

### Frontend:
- HTML
- CSS
- JavaScript

### Backend:
- Java
- Spring Boot
- Spring Data JPA
- Hibernate

### Database:
- MySQL

---

## 📁 Project Structure

```
Full Stack Development Project/
├── backend/
│   ├── pom.xml
│   └── src/
│       └── main/
│           ├── java/com/example/e/commerce/
│           │   ├── ECommerceApplication.java
│           │   ├── Product.java
│           │   ├── ProductController.java
│           │   ├── ProductRepository.java
│           │   ├── Order.java
│           │   ├── OrderRepository.java
│           │   ├── PaymentController.java
│           │   └── PaymentRequest.java
│           └── resources/
│               └── application.properties
├── frontend/
│   ├── index.html
│   ├── checkout.html
│   ├── login.html
│   ├── payment.html
│   └── success.html
```

## ⚙️ How to Run the Project

### 🖥️ Backend (Spring Boot)

1. Open project in **Eclipse / IntelliJ**
2. Configure MySQL database in:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
spring.datasource.username=root
spring.datasource.password=your_password
Run the application:
ECommerceApplication.java
Backend will start at:
http://localhost:8081
🌐 Frontend
Open frontend/index.html
Use Live Server (VS Code) OR open directly in browser
Make sure backend is running
🔗 API Endpoints
Products
GET /products → Get all products
POST /products → Add product
DELETE /products/{id} → Delete product
Orders / Payment
POST /payment → Save order (payment simulation)
GET /payment/orders → Get all orders
🧠 Learning Outcome
Full Stack integration
REST API development
Database CRUD operations
Frontend-backend communication
Basic e-commerce workflow
👨‍💻 Author
Developed by: Ashutosh Pandey
Project Type: Learning / Academic Full Stack Project
