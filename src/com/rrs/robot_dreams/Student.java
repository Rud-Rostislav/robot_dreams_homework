package com.rrs.robot_dreams;

public class Student {

    private String firstName;
    private String lastName;
    private int course;
    private int age;
    private String gender;
    private String faculty;

    public Student(String firstName, String lastName, int course, int age, String gender, String faculty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.age = age;
        this.gender = gender;
        this.faculty = faculty;
    }

    public void learning() {
        System.out.println("Student " + firstName + " " + lastName + " is learning.");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student {" +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", course = " + course +
                ", \nage = " + age +
                ", gender = '" + gender + '\'' +
                ", faculty = '" + faculty + '\'' +
                '}';
    }

}