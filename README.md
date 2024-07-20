## 🎯LoqoAI_Assignment - Product Filter and Sort API


## Objective

This project is a Spring Boot application that interacts with a MySql database to provide an API that filters and sorts product records based on specified parameters.

## Problem Statement

The RESTful API fetches product details from a MySql collection. The API supports filtering based on specific fields and sorting based on three designated fields.

## Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- PostMan
- Lombok
  
## Modules

- Product Module


## Specifications

### Setup
- Use Spring Boot to create the application.
- Use MYSql as the database.

## Installation & Run

- Before running the API server, you should update the database config inside the [application.properties] file.
- Update the port number, username and password as per your local database config.

```
    server.port=8888

    spring.datasource.url=jdbc:mysql://localhost:8080/loqodb;
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.datasource.username=root
    spring.datasource.password=root

```

### MYSql Collection
Assume you have a MySql collection named `product` with the following structure:
```json
 {
    "_id": "ObjectId",
    "name": "string",
    "category": "string",
    "price": "double",
    "inStock": "boolean",
    "rating": "double",
    "createdAt": "Date"
 }

