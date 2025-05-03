// 1. Abstraction and Encapsulation
abstract class Person {
    private String name;
    private String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    // Abstract method
    public abstract void displayInfo();
}
// 2. Inheritance and Method Overriding
class Student extends Person {
    private String course;
    public Student(String name, String id, String course) {
        super(name, id);
        this.course = course;
    }
    public String getCourse() {
        return course;
    }
    @Override
    public void displayInfo() {
        System.out.println("Student Name: " + getName());
        System.out.println("Student ID: " + getId());
        System.out.println("Course: " + getCourse());
    }
}
// 3. Attendance Management System
class Attendance {
    private String studentId;
    private String date;
    private boolean isPresent;
    public Attendance(String studentId, String date, boolean isPresent) {
        this.studentId = studentId;
        this.date = date;
        this.isPresent = isPresent;
    }
    // Method Overloading (Compile-time Polymorphism)
    public void markAttendance(Student student) {
        this.studentId = student.getId();
        this.date = "2024-08-12";
        this.isPresent = true;
        System.out.println("Attendance marked for: " + student.getName() + " on " + this.date);
    }
    public void markAttendance(Student student, String date) {
        this.studentId = student.getId();
        this.date = date;
        this.isPresent = true;
        System.out.println("Attendance marked for: " + student.getName() + " on " + this.date);
    }
    public void displayAttendance() {
        System.out.println("Student ID: " + studentId + " Date: " + date + " Present: " + isPresent);
    }
}
// 4. Main Class

public class AttendanceManagementSystem {
    public static void main(String[] args) {
        Student student1 = new Student("Nitish Goregaonkar", "2221826", "TY Computer Engineering");
        student1.displayInfo();
        Attendance attendance1 = new Attendance(student1.getId(), "2024-08-12", true);
        attendance1.markAttendance(student1);
        attendance1.displayAttendance();
        Attendance attendance2 = new Attendance(student1.getId(), "2024-08-13", true);
        attendance2.markAttendance(student1, "2024-08-13");
        attendance2.displayAttendance();
    }
}