package entity;

public class Student extends Person {
    private String batch;
    private boolean active;

    public Student(int id, String firstName, String lastName, String email, String batch, boolean active) {
        super(id, firstName, lastName, email);
        this.batch = batch;
        this.active = active;
    }

    public String getDisplayName() {
        return super.getDisplayName() + " (Student)";
    }

    public String toString() {
        int var10000 = super.getId();
        return "Student ID: " + var10000 + ", Name: " + super.getDisplayName() + ", Email: " + super.getEmail() + ", Batch: " + this.batch + ", Active: " + this.active;
    }
}
