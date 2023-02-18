package com.rrs.robot_dreams;

public class Main {
    public static void main(String[] args) {

        ArrayNumbers array = new ArrayNumbers(10, 1, 100);
        array.printArray();
        array.sortArray();
        array.sortReverseArray();

        Student john = new Student("John", "Donoway", 3, 18, "male", "Journalism" );
        System.out.println("\n" + john.toString());
        john.learning();

        Teacher brad = new Teacher("Brad", "Welch", 32, "male", "Engineering" );
        System.out.println("\n" + brad.toString());
        brad.teaching();

    }
}
