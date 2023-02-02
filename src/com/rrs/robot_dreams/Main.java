package com.rrs.robot_dreams;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[10];
        createArrayRandom(arr);
        printArray(arr);
        minValue(arr);
        maxValue(arr);
        sumAllValue(arr);
        averageValue(arr);

    }

    static void createArrayRandom(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1,10);
        }
    }

    static void printArray(int[] arr) {
        System.out.println("Масив з 10 елементів:");
        for (int j : arr) {
            System.out.print(j + "; ");
        }
    }

    static void minValue(int[] arr) {
        System.out.println("\nМінімальне значення:");
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println(min);
    }

    static void maxValue(int[] arr) {
        System.out.println("Максимальне значення:");
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println(max);
    }

    static void sumAllValue(int[] arr) {
        System.out.println("Сума всіх елементів:");
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println(sum);
    }

    static void averageValue(int[] arr) {
        System.out.println("Cереднє значення елементів:");
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        int avr = sum / arr.length;
        System.out.println(avr);
    }

}