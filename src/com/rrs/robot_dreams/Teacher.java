package com.rrs.robot_dreams;

public class Teacher {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String scientificDegree;

    public Teacher(String firstName, String lastName, int age, String gender, String scientificDegree) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.scientificDegree = scientificDegree;
    }

    public void teaching() {
        System.out.println("Teacher " + firstName + " " + lastName + " is teaching.");
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

    public String getScientificDegree() {
        return scientificDegree;
    }

    public void setScientificDegree(String scientificDegree) {
        this.scientificDegree = scientificDegree;
    }

    @Override
    public String toString() {
        return "Teacher {" +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", age = " + age +
                ", \ngender = '" + gender + '\'' +
                ", scientificDegree = '" + scientificDegree + '\'' +
                '}';
    }
}