LearnTrack - Student & Course Management System

1. Introduction:

LearnTrack is a simple console-based Core Java application that manages Students, Courses, and Enrollments.
The project is designed to demonstrate Object-Oriented Programming (OOP) principles and clean code practices.

2. Features:

* Add new students
* View Students
* Add new courses
* View courses
* Enroll students in courses
* View student and course details
* Track enrollment status

3. Technologies Used:

* Java (Core Java)
* Object-Oriented Programming (OOP)
* Java Collections (ArrayList)
* Exception Handling(try and catch block)

4. Project Structure:

com.airtribe.learntrack
│
├── entity // Contains data models (Student, Course, Enrollment, Person)
├── enums // Contains enums (EnrollmentStatus)
├── service // Business logic layer
├── ui // User interface (MainMenu)
├── util // Utility classes (IdGenerator)

5. Class Diagram:

Person
- id
- name
  |
  ↓
  Student


Course
- id
- title


Enrollment
- id
- enrollmentDate
- studentId
- courseId
- status


EnrollmentStatus (enum)
- ACTIVE
- COMPLETED
- DROPPED


IdGenerator
- generateId()


-------------------------------
Service Classes
-------------------------------

StudentService
- addStudent()
- viewStudents()

CourseService
- addCourse()
- viewCourses()

EnrollmentService
- enrollStudent()
- viewEnrollments()


Flow:
UI → Service → Entity

6. How to Compile and Run

* Clone the repository
* git clone <your-repository-link>
* Navigate to the project folder
* cd learntrack
* Compile the project
* javac -d out src/com/airtribe/learntrack/**/*.java
* Run the application
* java -cp out com.airtribe.learntrack.ui.MainMenu
