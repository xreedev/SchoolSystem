

# SchoolSystem API

 
*A simplified and scalable school management system built using Java Spring Boot.*

## Table of Contents
- [Introduction](#introduction)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [API Endpoints](#api-endpoints)
- [How to Run](#how-to-run)

## Introduction
`SchoolSystem` is a RESTful API designed for managing student information. It allows users to add, update, retrieve, and delete student records. The system follows a layered architecture (Controller, Service, Repository, and Model) to separate concerns and facilitate maintenance.

## Technologies Used
### Core Stack:
- **Java 11**: The programming language used for this project.
- **Spring Boot**: For building the RESTful API with the following modules:
  - Spring MVC
  - Spring Data JPA
  - Spring Web
- **Maven**: For dependency management and project building.
- **MySQL**: For database storage.
- **Lombok**: To reduce boilerplate code for Java objects.

![Technology Stack](https://img.shields.io/badge/Java-11-brightgreen.svg)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-2.x-brightgreen.svg)
![Maven](https://img.shields.io/badge/Maven-3.6.3-brightgreen.svg)


### Project Architecture:
- **Controller**: Handles HTTP requests.
- **Service**: Contains business logic.
- **Repository**: Manages database operations.
- **Model**: Defines the data structure.

---

## Project Structure
```
SchoolSystem
├───.idea                # IntelliJ configuration files
├───SchoolSystem         # Root directory of the project
│   └───src
│       └───main
│           └───java
│               └───com
│                   └───simplogics
│                       └───SchoolSystem
│                           ├───Configs         # Configuration files
│                           ├───Control         # REST controllers
│                           ├───Model           # Domain models (entities)
│                           ├───Repository      # Data access layer
│                           └───Service         # Business logic layer
└───pom.xml              # Maven configuration file
```

## API Endpoints
- **POST /students** - Add a new student
- **PUT /students** - Update an existing student
- **GET /students/{id}** - Retrieve a student by ID
- **GET /students** - Retrieve all students
- **DELETE /students/{id}** - Delete a student by ID

### Example Request and Response:
#### POST /students
```json
{
  "name": "John Doe",
  "age": 16,
  "grade": "10th"
}
```
**Response**:
```json
{
  "id": 1,
  "name": "John Doe",
  "age": 16,
  "grade": "10th"
}
```

## How to Run
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/xreedev/SchoolSystem.git
   ```
2. **Navigate to the Project Directory**:
   ```bash
   cd SchoolSystem
   ```
3. **Build the Project**:
   ```bash
   mvn clean install
   ```
4. **Run the Application**:
   ```bash
   mvn spring-boot:run
   ```

5. **Access the API**:
   Open Postman or your browser and interact with the API at `http://localhost:8080/students`.

---
