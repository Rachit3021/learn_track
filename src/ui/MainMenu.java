
package ui;

import entity.Course;
import entity.Enrollment;
import enums.EnrollmentStatus;
import java.util.Scanner;
import service.CourseService;
import service.EnrollmentService;
import service.StudentService;

public class MainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService studentService = new StudentService();
        CourseService courseService = new CourseService();
        EnrollmentService enrollmentService = new EnrollmentService();

        while(true) {
            System.out.println("\n===== LEARNTRACK MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Add Course");
            System.out.println("4. View Courses");
            System.out.println("5. Enroll Student in Course");
            System.out.println("6. View Enrollments");
            System.out.println("0. Exit");

            int choice;
            try {
                System.out.print("Enter choice: ");
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException var18) {
                System.out.println("Invalid input! Please enter a valid number.");
                continue;
            }

            switch (choice) {
                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("⚠ Invalid choice! Try again.");
                    break;
                case 1:
                    studentService.addStudent();
                    break;
                case 2:
                    studentService.viewStudents();
                    break;
                case 3:
                    System.out.print("Enter Course ID: ");
                    int cid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Course Name: ");
                    String cname = sc.nextLine();
                    System.out.print("Enter Description: ");
                    String desc = sc.nextLine();
                    System.out.print("Enter Duration (weeks): ");
                    int dur = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Is Active (true/false): ");
                    boolean cactive = sc.nextBoolean();
                    sc.nextLine();
                    Course c = new Course(cid, cname, desc, dur, cactive);
                    courseService.addCourse(c);
                    break;
                case 4:
                    courseService.viewCourses();
                    break;
                case 5:
                    System.out.print("Enter Enrollment ID: ");
                    int eid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Student ID: ");
                    int esid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Course ID: ");
                    int ecid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Status: ");
                    System.out.println("Select Status:");
                    System.out.println("1. ACTIVE");
                    System.out.println("2. COMPLETED");
                    System.out.println("3. CANCELLED");
                    int statusChoice = Integer.parseInt(sc.nextLine());
                    EnrollmentStatus status = null;
                    switch (statusChoice) {
                        case 1:
                            status = EnrollmentStatus.ACTIVE;
                            break;
                        case 2:
                            status = EnrollmentStatus.COMPLETED;
                            break;
                        case 3:
                            status = EnrollmentStatus.CANCELLED;
                            break;
                        default:
                            System.out.println(" Invalid status!");
                            return;
                    }

                    if (studentService.getStudentById(esid) == null) {
                        System.out.println(" Student ID not found!");
                    } else if (courseService.getCourseById(ecid) == null) {
                        System.out.println("Course ID not found!");
                    } else {
                        Enrollment e = new Enrollment(eid, "2026-03-27", esid, ecid, status);
                        enrollmentService.addEnrollment(e);
                    }
                    break;
                case 6:
                    enrollmentService.viewEnrollments();
            }
        }
    }
}
