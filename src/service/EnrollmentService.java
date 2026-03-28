package service;

import entity.Enrollment;
import java.io.PrintStream;
import java.util.ArrayList;

public class EnrollmentService {
    private ArrayList<Enrollment> enrollments = new ArrayList();

    public void addEnrollment(Enrollment e) {
        this.enrollments.add(e);
        System.out.println(" Enrollment Added Successfully!");
    }

    public void viewEnrollments() {
        if (this.enrollments.isEmpty()) {
            System.out.println("⚠ No enrollments available");
        } else {
            for(Enrollment e : this.enrollments) {
                PrintStream var10000 = System.out;
                int var10001 = e.getId();
                var10000.println("ID: " + var10001 + ", Student ID: " + e.getStudentId() + ", Course ID: " + e.getCourseId() + ", Date: " + e.getEnrollmentDate() + ", Status: " + e.getStatus());
            }

        }
    }

    public ArrayList<Enrollment> getEnrollmentsByStudentId(int studentId) {
        ArrayList<Enrollment> result = new ArrayList();

        for(Enrollment e : this.enrollments) {
            if (e.getStudentId() == studentId) {
                result.add(e);
            }
        }

        return result;
    }

    public ArrayList<Enrollment> getEnrollmentsByCourseId(int courseId) {
        ArrayList<Enrollment> result = new ArrayList();

        for(Enrollment e : this.enrollments) {
            if (e.getCourseId() == courseId) {
                result.add(e);
            }
        }

        return result;
    }
}
