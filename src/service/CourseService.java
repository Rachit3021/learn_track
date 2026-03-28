package service;

import entity.Course;
import java.io.PrintStream;
import java.util.ArrayList;

public class CourseService {
    private ArrayList<Course> courses = new ArrayList();

    public void addCourse(Course c) {
        this.courses.add(c);
        System.out.println(" Course Added Successfully!");
    }

    public void viewCourses() {
        if (this.courses.isEmpty()) {
            System.out.println("No courses available");
        } else {
            for(Course c : this.courses) {
                PrintStream var10000 = System.out;
                int var10001 = c.getId();
                var10000.println("ID: " + var10001 + ", Name: " + c.getCourseName() + ", Description: " + c.getDescription() + ", Duration: " + c.getDurationInWeeks() + " weeks, Active: " + c.isActive());
            }

        }
    }

    public Course getCourseById(int id) {
        for(Course c : this.courses) {
            if (c.getId() == id) {
                return c;
            }
        }

        return null;
    }
}
