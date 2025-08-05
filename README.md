# Category–Product CRUD REST API (Spring Boot + JPA/Hibernate)

A Spring Boot based RESTful API performing full CRUD operations on **Categories** and **Products** with a **One-to-Many** relationship, **server-side pagination**, and clean annotation-based configuration (no XML). This project is commonly used in machine tests and interviews to demonstrate backend development skills using modern Java technologies.

---

## 🚀 Features

- RESTful API using **Spring Boot**
- Server-side **pagination** for efficient data handling
- **Category ↔ Product** (One-to-Many) relationship
- Fully implemented **CRUD operations**
- Database configuration using any **Relational DB (MySQL/PostgreSQL etc.)**
- **JPA & Hibernate** integration
- Layered architecture (Controller → Service → Repository)
- Clean, readable, and scalable codebase

---

## 🛠️ Tech Stack

| Technology       | Version    |
|------------------|-----------|
| Java             | 17 (or 8+) |
| Spring Boot      | 3.x        |
| Spring Web       |            |
| Spring Data JPA  |            |
| Hibernate ORM    |            |
| MySQL/PostgreSQL |            |
| Maven/Gradle     |            |

---

## 📁 Project Structure

src
└── main
├── java
│ └── com.example.demo
│ ├── controller
│ ├── service
│ ├── repository
│ ├── model
│ └── dto
└── resources
├── application.properties
└── data.sql


---

## 📡 API Endpoints

### 🗂️ Category

| Method | Endpoint                            | Description              |
|--------|-------------------------------------|--------------------------|
| GET    | `/api/categories?page={page}`       | Get all categories       |
| GET    | `/api/categories/{id}`              | Get category by id       |
| POST   | `/api/categories`                   | Create new category      |
| PUT    | `/api/categories/{id}`              | Update category          |
| DELETE | `/api/categories/{id}`              | Delete category          |

### 📦 Product

| Method | Endpoint                            | Description                            |
|--------|-------------------------------------|----------------------------------------|
| GET    | `/api/products?page={page}`         | Get all products                       |
| GET    | `/api/products/{id}`                | Get product (with category details)    |
| POST   | `/api/products`                     | Create new product                     |
| PUT    | `/api/products/{id}`                | Update product                         |
| DELETE | `/api/products/{id}`                | Delete product                         |

---

## 🔧 How to Run Locally

```bash
# 1. Clone the repo
git clone <your-repo-url>

# 2. Navigate 
cd <project-folder>

# 3. Build
mvn clean install

# 4. Run the application
mvn spring-boot:run

# App will be running at:
http://localhost:8080

✍️ Author
Developed with ❤️ by <Om Patil>

Connect with me on https://www.linkedin.com/in/om-patil-2003-/ • Follow me on GitHub ⭐
