# IMC API

This project is an API for managing user data and calculating their Body Mass Index (BMI) along with their health status based on the BMI result. The API is built using the Spring Boot framework and follows RESTful principles.

## Table of Contents
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Endpoints](#endpoints)
- [Configuration](#configuration)
- [Contributing](#contributing)
- [License](#license)

## Prerequisites
Ensure you have the following installed before running the application:
- Java Development Kit (JDK) 8 or later
- Maven

## Installation
1. Clone the repository:
    ```bash
    git clone https://github.com/your-username/imc-api.git
    ```
2. Navigate to the project directory:
    ```bash
    cd imc-api
    ```
3. Build the project using Maven:
    ```bash
    mvn clean install
    ```

## Usage
Run the application using the following command:
```bash
java -jar target/imc-api-<version>.jar
```
Replace `<version>` with the actual version of the JAR file.

The application will be accessible at `http://localhost:8080`.

## Endpoints
### User Management
- **Get User List**
    - URL: `/user/list`
    - Method: `GET`
    - Description: Retrieve a list of users.
- **Get User by ID**
    - URL: `/user/get/{id}`
    - Method: `GET`
    - Description: Retrieve user details by ID.
- **Save User**
    - URL: `/user/save`
    - Method: `POST`
    - Description: Create a new user.
- **Update User**
    - URL: `/user/update`
    - Method: `PATCH`
    - Description: Update user details.
- **Delete User by ID**
    - URL: `/user/delete/{id}`
    - Method: `DELETE`
    - Description: Delete user by ID.

### Health Status Calculation
- **Get Health Status**
    - URL: `/health/status/{imc}`
    - Method: `GET`
    - Description: Calculate and retrieve health status based on BMI.

## Configuration
### Cross-Origin Resource Sharing (CORS)
The application has CORS configuration to allow requests from `http://localhost:4200`. You can modify the allowed origins in the `WebMvcConfig` class.

## Contributing
Feel free to contribute to the project. Fork the repository, make your changes, and submit a pull request.

---

*Note: This README assumes that the project structure and dependencies follow common Spring Boot conventions.*