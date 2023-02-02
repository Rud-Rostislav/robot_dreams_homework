package com.rrs.robot_dreams;

public class Main {
    public static void main(String[] args) {

        int a = 53;
        int b = 36;

        if (a > b) {
            System.out.println(a + " > " + b);
        } else {
            System.out.println(b + " > " + a);
        }

        int d = 46;
        int c = 32;

        if (d < c) {
            System.out.println(d + " < " + c);
        } else {
            System.out.println(c + " < " + d);
        }

        int e = 52;

        if (e % 2 == 0) {
            System.out.println("Число " + e + " парне");
        } else {
            System.out.println("Число " + e + " не парне");
        }

    }
}