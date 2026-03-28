package entity;

import enums.EnrollmentStatus;

public class Enrollment {
    private int id;
    private String enrollmentDate;
    private int studentId;
    private int courseId;
    private EnrollmentStatus status;

    public Enrollment(int id, String enrollmentDate, int studentId, int courseId, EnrollmentStatus status) {
        this.id = id;
        this.enrollmentDate = enrollmentDate;
        this.studentId = studentId;
        this.courseId = courseId;
        this.status = status;
    }

    public int getId() {
        return this.id;
    }

    public String getEnrollmentDate() {
        return this.enrollmentDate;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public int getCourseId() {
        return this.courseId;
    }

    public EnrollmentStatus getStatus() {
        return this.status;
    }
}
