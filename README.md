# S4.01-Spring-Nivel1

This is a Spring Boot project built with Maven as the dependency manager.

## Requirements
- Java JDK (minimum version 17)
- Maven installed
- Postman (or a similar HTTP client) for testing the API endpoints

## How to run the application
- Navigate to the root directory of the project in your terminal.
- Run the Maven command to start the application:
mvn spring-boot:run
- The application will be accessible at http://localhost:9000.

## API Endpoints
This API has been tested using Postman.

- GET /HelloWorld: Returns a greeting with an optional "name" parameter (default is "UNKNOWN").
Example (Postman): Send a GET request to http://localhost:9000/HelloWorld or http://localhost:9000/HelloWorld?name=YourName.
- GET /HelloWorld2/{name}: Returns a greeting with an optional "name" parameter in the path.
Example (Postman): Send a GET request to http://localhost:9000/HelloWorld2 or http://localhost:9000/HelloWorld2/YourName.

## Maven Commands

```bash
- mvn clean: Cleans the project, removing the target directory.
- mvn compile: Compiles the project.
- mvn package: Packages the project into a JAR or WAR file in the target directory.
- mvn spring-boot:run: Runs the Spring Boot application.
