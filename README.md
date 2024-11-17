# 🛠️ Activité Pratique N°2: Développement d'une Architecture Micro-Service

This project involves creating a micro-service-based application to manage invoices (`factures`), which contain products (`produits`) and are linked to customers (`clients`).

---

## 📚 Objectives

1. 🧑‍💼 **Customer Service**: Manage customers.
2. 📦 **Inventory Service**: Manage products.
3. 🌐 **Spring Cloud Gateway**: Gateway configuration with static and dynamic routing.
4. 🗺️ **Eureka Discovery Service**: Service registry and discovery.
5. 📜 **Billing Service**: Manage invoices using Open Feign for inter-service communication.
6. ⚙️ **Configuration Service**: Centralized configuration management.
7. 🖥️ **Angular Client**: Frontend interface for interacting with the services.

---

## 🎥 Resources

- **Part 1**: [Introduction to the Project](https://www.youtube.com/watch?v=fvEg8bOhpo8)
- **Part 2**: [Implementation Details](https://www.youtube.com/watch?v=yCFSatdQUmE)
- **Part 3**: [Configuration Service Setup](https://www.youtube.com/watch?v=-G2rcLMO1gQ)
- **GitHub Repository**: [Micro-Services App](https://github.com/mohamedYoussfi/micro-services-app)

---

## 📂 Services Overview

### 1️⃣ **Customer-Service**
- Manage customer data.
- Endpoints for CRUD operations.

### 2️⃣ **Inventory-Service**
- Manage product data.
- Endpoints for CRUD operations.

### 3️⃣ **Billing-Service**
- Generate and manage invoices.
- Utilize Open Feign for communication between services.

### 4️⃣ **Gateway**
- Acts as a single entry point for accessing all micro-services.
- Implements static and dynamic routing configurations.

### 5️⃣ **Eureka Discovery Service**
- Service registry for discovering other micro-services dynamically.

### 6️⃣ **Configuration Service**
- Centralized management of configurations for all services.

### 7️⃣ **Angular Client**
- User-friendly interface for managing customers, products, and invoices.

---
