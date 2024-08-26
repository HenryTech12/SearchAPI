# SEARCH API

## Overview
This project provides a Spring Boot RESTful API for searching manufacturers based on location, nature of business, and manufacturing process. It supports pagination, input validation, and exception handling.

## Prerequisites
- **Java 17** or higher
- **Maven 3.8.1** or higher
- **Git** (optional, for cloning the repository)

### Build the project
Use Maven to build the project:
./mvnw clean install

### Run the application
To run the Spring Boot application, use the following command:
./mvnw spring-boot:run

Alternatively, you can run the application using the generated JAR file:
java -jar target/SearchAPI-0.0.1-SNAPSHOT.jar

## Configuration
The application can be configured via the application.properties located in src/main/resources. Here, you can set up various parameters like server port, database configurations, etc.

## BASIC AUTHENTICATION 
To access the API, users need to log in with this credentials:
Username: Admin
Password: 1234

## API Endpoints

- **Search Manufacturers**
  - **URL:** /api/supplier/query
  - **Method:** GET
  - **Parameters:**
    - location: Filter by location.
    - natureOfBusiness: Filter by nature of business.
    - manufacturingProcess: Filter by manufacturing process
  - **Response:** JSON array of manufacturers matching the search criteria.
