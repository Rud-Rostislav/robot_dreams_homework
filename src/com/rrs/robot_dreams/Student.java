package com.rrs.robot_dreams;

public class Student {
    private String name;
    private int age;
    private static int startId = 0;
    private int id;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++startId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getStartId() {
        return startId;
    }

    public static void setStartId(int startId) {
        Student.startId = startId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                "}";
    }
}