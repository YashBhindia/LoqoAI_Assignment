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

 ### MySql Collection
Assume you have a MySql collection named `product` with the following structure:

```
  
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
```

## Run Successfully! ==
![Screenshot (98)](https://github.com/user-attachments/assets/e01e3e33-3817-4d8a-94b8-91646b7e7253)

## In MySql Table Look Like ==
![Screenshot (99)](https://github.com/user-attachments/assets/2496a14e-a3f0-4414-ab66-68d17c000fac)

## Add Details(With Successfully return) == 
![Screenshot (101)](https://github.com/user-attachments/assets/94719bdb-2bed-4691-9f5a-b7ce31992331)

## In MySql Table Data Look Like == 
![Screenshot (100)](https://github.com/user-attachments/assets/c08520e4-5719-430b-986f-6a48b62de524)

## Getting Data Without Filtering == 
![Screenshot (102)](https://github.com/user-attachments/assets/89f1e2bb-eedc-43c3-9b4e-989804ab0646)

## Getting Data By Applying Filtering and Sorting ==
![Screenshot (103)](https://github.com/user-attachments/assets/0ec993ca-4d0b-4286-8eb4-0fc7f165717c)

## Testing

![Screenshot (105)](https://github.com/user-attachments/assets/f1fef983-1879-4398-9ac3-4c4b3724557b)

## Testing Coverge 53.4%
![Screenshot (104)](https://github.com/user-attachments/assets/6280184d-b55c-4e0b-a2cf-b5c19042d482)
