package service;

import entity.Student;
import java.util.ArrayList;
import java.util.Scanner;
import util.IdGenerator;

public class StudentService {
    private ArrayList<Student> students = new ArrayList();
    Scanner sc;
    private static int counter = 1;

    public StudentService() {
        this.sc = new Scanner(System.in);
    }

    public void addStudent() {
        System.out.print("Enter First Name: ");
        String firstName = this.sc.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = this.sc.nextLine();
        System.out.print("Enter Email: ");
        String email = this.sc.nextLine();
        System.out.print("Enter Batch: ");
        String batch = this.sc.nextLine();
        System.out.print("Is Active (true/false)");
        boolean active = Boolean.parseBoolean(this.sc.nextLine());
        Student s = new Student(IdGenerator.getNextStudentId(), firstName, lastName, email, batch, active);
        this.students.add(s);
        System.out.println(" Student Added Successfully!");
    }

    public void viewStudents() {
        if (this.students.isEmpty()) {
            System.out.println(" No students available");
        } else {
            for(Student s : this.students) {
                System.out.println(s);
            }

        }
    }

    public Student getStudentById(int id) {
        for(Student s : this.students) {
            if (s.getId() == id) {
                return s;
            }
        }

        return null;
    }
}
