package com.rrs.robot_dreams;

public class Student extends Human {
    private String studentId;
    private String studentName;
    private String studentEmail;
    private String studentPhone;

    public Student() {

    }

    public Student(String firstName, String lastName, int age, String gender, String studentId, String studentName, String studentEmail, String studentPhone) {
        super(firstName, lastName, age, gender);
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentPhone = studentPhone;
    }

    @Override
    public void getInfo() {
        System.out.println("Student created.");
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Student ID: " + getStudentId());
        System.out.println("Student Name: " + getStudentName());
        System.out.println("Student Email: " + getStudentEmail());
        System.out.println("Student Phone: " + getStudentPhone());
        System.out.println("");
    }


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }
}
