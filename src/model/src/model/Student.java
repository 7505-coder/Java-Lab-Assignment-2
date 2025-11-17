package model;

public class Student extends Person {
    int rollNo;
    String course;
    double marks;
    char grade;

    // Constructor Overloading
    public Student() {}

    public Student(int rollNo, String name, String email, String course, double marks) {
        super(name, email);
        this.rollNo = rollNo;
        this.course = course;
        this.marks = marks;
        calculateGrade();
    }

    // Method Overloading Example
    public void displayInfo(boolean showEmail) {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        if (showEmail)
            System.out.println("Email: " + email);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }

    @Override
    public void displayInfo() {
        displayInfo(true);
    }

    public void calculateGrade() {
        if (marks >= 90) grade = 'A';
        else if (marks >= 75) grade = 'B';
        else if (marks >= 50) grade = 'C';
        else grade = 'D';
    }
}
