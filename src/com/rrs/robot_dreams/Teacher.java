package com.rrs.robot_dreams;

public class Teacher extends Human {
    private String teacherId;
    private String teacherName;
    private String teacherEmail;
    private String teacherPhone;

    public Teacher() {

    }

    public Teacher(String firstName, String lastName, int age, String gender, String teacherId, String teacherName, String teacherEmail, String teacherPhone) {
        super(firstName, lastName, age, gender);
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.teacherEmail = teacherEmail;
        this.teacherPhone = teacherPhone;
    }

    @Override
    public void getInfo() {
        System.out.println("Teacher created.");
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Teacher ID: " + getTeacherId());
        System.out.println("Teacher Name: " + getTeacherName());
        System.out.println("Teacher Email: " + getTeacherEmail());
        System.out.println("Teacher Phone: " + getTeacherPhone());
        System.out.println("");
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
    }

    public String getTeacherPhone() {
        return teacherPhone;
    }

    public void setTeacherPhone(String teacherPhone) {
        this.teacherPhone = teacherPhone;
    }
}
