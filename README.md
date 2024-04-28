# Excel-to-Database Importer

This Spring Boot application demonstrates a robust Excel-to-database batch processing system using Spring Batch. The project reads data from structured Excel files, processes the data, and writes the processed data to a PostgreSQL database.
## Project Progress

- [x] Create a SpringBoot project using Maven.
- [x] Add the Spring Boot and Spring Batch dependencies in poi.xml.
- [x] Implement the `User` & `Event` models.
- [x] Configure database connectivity.
- [x] Create the `ItemReader` for users and events.
- [x] Create the `ItemProcessor` for users and events.
- [ ] Create the `ItemWriter` for users and events.
- [ ] implement `Jobs` and `Steps` for the Items


## Project Structure

The application is organized into several key directories:

- `src/main/java/com/internship/exceltodb/`
  - `config/`: Contains Spring Batch job and step configuration.
  - `model/`: Domain models representing database entities.
  - `processor/`: Processors that transform data.
  - `reader/`: Item readers for reading Excel files.
  - `writer/`: Item writers for writing to the database.
- `src/main/resources/`
  - `data/`: Directory containing Excel files.
  - `application.properties`: Configuration file for database and batch settings.

## Key Components

### Batch Configuration

- **Job Configuration**: Defines jobs that manage batch processing steps.
- **Step Configuration**: Defines steps for reading, processing, and writing data.

### Readers

- **UserItemReader**: Configured to read user data from an Excel file.
- **EventItemReader**: Configured to read event data from an Excel file.

### Processors

- **UserItemProcessor**: Example processor (if any specific logic is needed).
- **EventItemProcessor**: Converts event time data from Excel format `HH.MM.SS` to `HH:mm:ss`.

### Writers

- **UserItemWriter**: Writes user data to the PostgreSQL database.
- **EventItemWriter**: Writes event data to the PostgreSQL database.

## Setup and Running

### Create the project from (https://start.spring.io/)

![image](https://github.com/YounessElhasnaoui/excel-to-PostgreSQL-db/assets/125697912/52412d9e-afd1-434a-a841-353bfce9ee19)


### Import the project in my IDE, then respect the DevOps structure :

![image](https://github.com/YounessElhasnaoui/excel-to-PostgreSQL-db/assets/125697912/8d160e08-1818-423a-b8d9-98fba25900c0)

### Prepare the Excel file structure and create compatible classes in the project 

#### Excel structure 

![image](https://github.com/YounessElhasnaoui/excel-to-PostgreSQL-db/assets/125697912/f067f965-feee-4fda-ba00-63e61ac59887)

![image](https://github.com/YounessElhasnaoui/excel-to-PostgreSQL-db/assets/125697912/620156b6-be78-4a37-85a8-48bf61688b0c)

![image](https://github.com/YounessElhasnaoui/excel-to-PostgreSQL-db/assets/125697912/b3160678-950b-401d-b1ab-17e7c3062112)

#### Project Classes 

![image](https://github.com/YounessElhasnaoui/excel-to-PostgreSQL-db/assets/125697912/5e5f512d-2ec6-4985-8bbd-17b349723613)

#### Implement ItemReader for User and Event
![image](https://github.com/YounessElhasnaoui/excel-to-PostgreSQL-db/assets/125697912/b9d26d39-8389-48b6-829a-fc53065ef362)

![image](https://github.com/YounessElhasnaoui/excel-to-PostgreSQL-db/assets/125697912/978f347d-42da-4558-a6f2-e80601977ccb)

#### Implement ItemProcessor for User and Event
![image](https://github.com/YounessElhasnaoui/excel-to-PostgreSQL-db/assets/125697912/757fb173-2030-4e5e-804d-edba5e0ac915)

![image](https://github.com/YounessElhasnaoui/excel-to-PostgreSQL-db/assets/125697912/6265776b-ffea-4866-9c4a-5b3689dc7ec6)










