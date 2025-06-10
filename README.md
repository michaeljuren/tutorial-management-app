```markdown
# Tutorials Management Application

A simple Spring Boot application demonstrating CRUD operations with MySQL, JPA, and Flyway database migrations.

## Features

— RESTful API for managing tutorials
— MySQL database integration
— Database migrations with Flyway
— Maven build system

## Prerequisites

— Java 17+
— Maven 3.8+
— Docker/Podman

## Getting Started

### 1. Start MySQL with Docker

Run the following command to start a MySQL 8.1 container:

sh - for Docker
docker run --name mysql-8.1 -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=tutorials -e MYSQL_USER=root -e MYSQL_PASSWORD=root -p 3397:3306 -d mysql:8.1

sh - for Podman
podman run --name mysql-8.1 -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=tutorials -e MYSQL_USER=root -e MYSQL_PASSWORD=root -p 3397:3306 -d mysql:8.1
```

### 2. Build the Project

```sh
mvn clean install
```

### 3. Run Database Migrations

```sh
mvn flyway:migrate
```

### 4. Start the Application

```sh
mvn spring-boot:run
```

The app will be available at [http://localhost:8080](http://localhost:8080).

## Configuration

Database connection settings are in `src/main/resources/application.properties`:

- URL: `jdbc:mysql://localhost:3397/tutorials`
- Username: `root`
- Password: `root`

## API Endpoints

Typical CRUD endpoints (example):

- `GET /tutorials` - List all tutorials
- `POST /tutorials` - Create a new tutorial
- `GET /tutorials/{id}` - Get a tutorial by ID
- `PUT /tutorials/{id}` - Update a tutorial
- `DELETE /tutorials/{id}` - Delete a tutorial

## Database Migration

Flyway migration scripts are in `src/main/resources/db/migration/`.

## License

MIT (add your license details here)
```
