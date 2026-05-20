# LearnTrack - Student & Course Management System

## Project Overview
LearnTrack is a modular and object-oriented Student & Course Management System
built using Core Java. The project demonstrates strong understanding of Java
fundamentals, OOP principles, collections, exception handling, layered architecture,
and clean code practices.

The system allows management of:
- Students
- Courses
- Enrollments

This project is designed for practicing real-world backend architecture using
Core Java without external frameworks.

---

# Features

## Student Management
- Add students
- View all students
- Search student by ID
- Update student details
- Delete students

## Course Management
- Add courses
- View available courses
- Update course information
- Track course status

## Enrollment Management
- Enroll students into courses
- Track enrollment status
- View enrolled courses for a student
- Prevent duplicate enrollments

---

# Technologies Used

- Core Java
- OOP Concepts
- Collections Framework
- Exception Handling
- Enums
- Layered Architecture
- Generics
- Java Streams (Optional)

---

# Project Structure

src/
└── com/
    └── airtribe/
        └── learntrack/
            ├── Main.java
            │
            ├── entity/
            │   ├── Person.java
            │   ├── Student.java
            │   ├── Course.java
            │   └── Enrollment.java
            │
            ├── repository/
            │   ├── StudentRepository.java
            │   ├── CourseRepository.java
            │   └── EnrollmentRepository.java
            │
            ├── service/
            │   ├── StudentService.java
            │   ├── CourseService.java
            │   └── EnrollmentService.java
            │
            ├── exception/
            │   ├── EntityNotFoundException.java
            │   └── InvalidInputException.java
            │
            ├── util/
            │   ├── IdGenerator.java
            │   └── InputValidator.java
            │
            ├── constants/
            │   ├── MenuOptions.java
            │   └── AppConstants.java
            │
            └── enums/
                ├── EnrollmentStatus.java
                └── CourseStatus.java

---

# OOP Concepts Used

## Encapsulation
Data hiding using private fields and public getters/setters.

## Inheritance
`Student` extends `Person`.

## Abstraction
Services and repositories separate implementation details.

## Polymorphism
Method overriding and dynamic behavior.

---

# Architecture Used

## Entity Layer
Contains core business objects.

## Repository Layer
Handles in-memory data storage.

## Service Layer
Contains business logic and validations.

## Utility Layer
Provides reusable helper classes.

---

# Exception Handling

Custom exceptions used:
- EntityNotFoundException
- InvalidInputException

---

# Enums Used

## EnrollmentStatus
- ACTIVE
- COMPLETED
- DROPPED

## CourseStatus
- AVAILABLE
- CLOSED
- FULL

---

# Sample Workflow

1. Add Student
2. Add Course
3. Enroll Student into Course
4. View Enrollment Details
5. Update Enrollment Status

---

# Future Enhancements

- File Storage Support
- Database Integration
- Spring Boot REST APIs
- Authentication System
- GUI Interface

---

# How to Run

## Compile

```bash
javac com/airtribe/learntrack/Main.java
