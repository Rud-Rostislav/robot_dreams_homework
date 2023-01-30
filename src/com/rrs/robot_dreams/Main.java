package com.rrs.robot_dreams;

public class Main {
    public static void main(String[] args) {

        System.out.println(cube(3));
        print_star(5);
        print_element("&", 10);

    }

    static int cube(int a) {
        return a * a * a;
    }

    static void print_star(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    static void print_element(String element, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(element);
        }
        System.out.println();
    }

}