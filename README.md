# Excel to PostgreSQL Database with Spring Batch

This project demonstrates reading Excel files and converting them into structured data in a PostgreSQL database using Spring Batch and Spring Boot.

## Project Description

### Objectives

- Read multiple tabs in an Excel file and persist the data into a PostgreSQL database.
- Handle relationships between data tabs.
- Use Spring Batch for batch processing.

### Technologies Used

- Java 17
- Spring Boot
- Spring Batch
- PostgreSQL
- Apache POI
- SLF4J (Logging)
- Maven

## Project Progress

- [x] **Project Setup**
  - [x] Initialize a Spring Boot project with Spring Batch.
  - [x] Add PostgreSQL dependency.

- [x] **Database Configuration**
  - [x] Install and configure PostgreSQL on Windows 10.
  - [x] Create database tables for `events` and `users`.
  - [x] Create `Event` and `User` entities.

- [x] **Excel Reader Setup**
  - [x] Implement `EventExcelItemReader` to read the `events` sheet.
  - [x] Implement `UserExcelItemReader` to read the `users` sheet.

- [x] **DTO and Entity Mapping**
  - [x] Create `EventDto` and `UserDto`.
  - [x] Map DTOs to corresponding entities (`Event` and `User`).

- [x] **Item Writers**
  - [x] Implement `EventItemWriter` for writing events to the database.
  - [x] Implement `UserItemWriter` for writing users to the database.

- [x] **Service Layer**
  - [x] Create `EventService` and `UserService` to save data.
  - [x] Add logging to track saving operations.

- [x] **Batch Configuration**
  - [x] Implement `BatchConfiguration` with `Job` and `Step` definitions.
  - [x] Ensure proper execution order: `EventStep` before `UserStep`.

- [x] **Logging Setup**
  - [x] Add SLF4J dependencies.
  - [x] Configure `logback.xml` for logging.
  - [x] Log read, write, and step operations.
     
  
## Project Structure

The application is organized into several key directories:

- `src/main/java/com/internship/exceltodb/`
  - `config/`: Contains Spring Batch job and step configuration.
    - `BatchConfiguration.java`: Configuration file defining jobs and steps.
    - `JobListener.java`: Listener for overall job lifecycle events.
    - `StepListener.java`: Listener for step lifecycle events.
  - `dto/`: Data Transfer Objects representing the data read from Excel.
    - `EventDto.java`
    - `UserDto.java`
  - `model/`: Domain models representing database entities.
    - `Event.java`
    - `User.java`
  - `repository/`: Spring Data JPA repositories for database operations.
    - `EventRepository.java`
    - `UserRepository.java`
  - `service/`: Service classes for saving entities to the database.
    - `EventService.java`
    - `UserService.java`
  - `reader/`: Item readers for reading Excel files.
    - `EventExcelItemReader.java`
    - `UserExcelItemReader.java`
- `src/main/resources/`
  - `data/`: Directory containing Excel files.
    - `events.xlsx`
  - `application.properties`: Configuration file for database and batch settings.
  - `logback.xml`: Logging configuration for SLF4J.

- `pom.xml`: Maven configuration file.


## Key Components

### Batch Configuration

- **Job Configuration**:
  - **`BatchConfiguration`**: Contains job and step definitions.
    - **`importExcelJob`**: Main job that orchestrates the data import process.
  - **Listeners**:
    - **`JobListener`**: Logs job start and end events.
    - **`StepListener`**: Logs step start and end events.

- **Step Configuration**:
  - **`eventStep`**: Reads, processes, and writes event data.
  - **`userStep`**: Reads, processes, and writes user data.
    
- **Writers**:
  - **`UserItemWriter`**: Writes user data to the PostgreSQL database via `UserService`.
  - **`EventItemWriter`**: Writes event data to the PostgreSQL database via `EventService`.

### Readers

- **`UserExcelItemReader`**: Reads user data from the `users` sheet of the Excel file.
- **`EventExcelItemReader`**: Reads event data from the `events` sheet of the Excel file.

### DTOs (Data Transfer Objects)

- **`UserDto`**: Data structure for user information extracted from Excel.
- **`EventDto`**: Data structure for event information extracted from Excel.

### Models

- **`User`**: Represents the `users` table in PostgreSQL.
- **`Event`**: Represents the `events` table in PostgreSQL.

### Services

- **`UserService`**:
  - Saves user data to the PostgreSQL database.
  - Logs successful saves.

- **`EventService`**:
  - Saves event data to the PostgreSQL database.
  - Logs successful saves.

### Repositories

- **`UserRepository`**: Spring Data JPA repository for `User`.
- **`EventRepository`**: Spring Data JPA repository for `Event`.

### Logging

- **SLF4J with Logback**:
  - **`logback.xml`**: Custom logging configuration for console output.
  - Logging is integrated into batch processing listeners and service methods.


## Setup and Running

### Setup

#### Create the project from (https://start.spring.io/)

![image](https://github.com/YounessElhasnaoui/excel-to-PostgreSQL-db/assets/125697912/52412d9e-afd1-434a-a841-353bfce9ee19)


#### Import the project in my IDE, then respect the DevOps structure :

![image](https://github.com/YounessElhasnaoui/excel-to-PostgreSQL-db/assets/125697912/76685019-b3e4-4fee-a7e4-77e4a9494de3)

#### Prepare the Excel file structure and create compatible classes in the project 

##### Excel structure 

![image](https://github.com/YounessElhasnaoui/excel-to-PostgreSQL-db/assets/125697912/f067f965-feee-4fda-ba00-63e61ac59887)

![image](https://github.com/YounessElhasnaoui/excel-to-PostgreSQL-db/assets/125697912/620156b6-be78-4a37-85a8-48bf61688b0c)

![image](https://github.com/YounessElhasnaoui/excel-to-PostgreSQL-db/assets/125697912/b3160678-950b-401d-b1ab-17e7c3062112)

##### Project Classes 

![image](https://github.com/YounessElhasnaoui/excel-to-PostgreSQL-db/assets/125697912/5e5f512d-2ec6-4985-8bbd-17b349723613)

### Running (How the program saves each row in the database)

#### Step 1: Iterate Over Events/Users and Create the EventDto/UserDto Objects

**`Events`**:

![image](https://github.com/YounessElhasnaoui/excel-to-PostgreSQL-db/assets/125697912/bcf29c7d-3af0-459a-9cdb-8f0f0c025ca2)

**`Users`**:

![image](https://github.com/YounessElhasnaoui/excel-to-PostgreSQL-db/assets/125697912/6517c6b0-3424-4714-bba8-f59fc9dda2e0)

#### Step 2: Map the EventDto/UserDto Objects to Event/User Entities

**`Events`**:

![image](https://github.com/YounessElhasnaoui/excel-to-PostgreSQL-db/assets/125697912/51bb0aad-858f-48d0-90e5-b522c6fd506d)

**`Users`**:

![image](https://github.com/YounessElhasnaoui/excel-to-PostgreSQL-db/assets/125697912/8cf23f31-93e0-4ae2-b898-91e58a04d5b6)

#### Step 3: Write the Event/User Entities to the Database

**`Events`**:

![image](https://github.com/YounessElhasnaoui/excel-to-PostgreSQL-db/assets/125697912/ca0787e3-1049-4c1f-b56d-e9f0ea43ace4)

![image](https://github.com/YounessElhasnaoui/excel-to-PostgreSQL-db/assets/125697912/8d202263-8b7e-4591-bfd0-c1ddb8646520)

**`Users`**: 

![image](https://github.com/YounessElhasnaoui/excel-to-PostgreSQL-db/assets/125697912/ec6d530b-9cd8-4f93-8189-fc79a2dd54fb)

![image](https://github.com/YounessElhasnaoui/excel-to-PostgreSQL-db/assets/125697912/8254717b-3728-4a42-9887-23d1fc13f859)

#### Step 4: Verify the Events/Users are Saved in the Database

**`Events`**: 

![image](https://github.com/YounessElhasnaoui/excel-to-PostgreSQL-db/assets/125697912/f71422c5-0add-4be1-a67d-e7cb65f4a33c)

**`Users`**: 

![image](https://github.com/YounessElhasnaoui/excel-to-PostgreSQL-db/assets/125697912/ae8acf1a-8767-491a-9132-5e87393fee59)



















