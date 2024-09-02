

# SchoolSystem

**SchoolSystem** is a Java-based application designed to manage the operations of a school, including handling student information, courses, grades, and staff. The project leverages Spring Boot for building the backend and provides RESTful APIs for various CRUD operations.

## Features

- **Student Management**: Add, update, view, and delete student records.
- **Course Management**: Manage courses including adding, updating, and removing courses.
- **Grades Management**: Record and manage grades for students across different courses.
- **Staff Management**: Manage school staff details including roles and responsibilities.
- **REST API**: Provides endpoints to interact with the system programmatically.

## Technologies Used

- **Java**: Core programming language used for the application.
- **Spring Boot**: Framework used to build the backend services.
- **Hibernate**: ORM framework used for database operations.
- **MySQL**: Database used for storing all school-related data.
- **Maven**: Dependency management and build tool.
- **Postman**: Used for API testing.

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6 or higher
- MySQL database

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/xreedev/SchoolSystem.git
   cd SchoolSystem
   ```

2. Configure the database:
   - Create a MySQL database named `school_system`.
   - Update the `application.properties` file with your database credentials.

3. Build and run the application:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

### API Endpoints

- **Students**:
  - `GET /students`: Retrieve all students.
  - `POST /students`: Add a new student.
  - `PUT /students/{id}`: Update student information.
  - `DELETE /students/{id}`: Delete a student record.

- **Courses**:
  - `GET /courses`: Retrieve all courses.
  - `POST /courses`: Add a new course.
  - `PUT /courses/{id}`: Update course details.
  - `DELETE /courses/{id}`: Remove a course.

- **Grades**:
  - `GET /grades`: Retrieve all grades.
  - `POST /grades`: Add a new grade.
  - `PUT /grades/{id}`: Update grade information.
  - `DELETE /grades/{id}`: Delete a grade record.

- **Staff**:
  - `GET /staff`: Retrieve all staff members.
  - `POST /staff`: Add a new staff member.
  - `PUT /staff/{id}`: Update staff details.
  - `DELETE /staff/{id}`: Remove a staff member.

## Contributing

Contributions are welcome! Please fork the repository and create a pull request with your changes. Ensure your code adheres to the project's coding standards.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

## Contact

For any inquiries or issues, please reach out to Sreedev at xreedev@gmail.com.
