package lesson1;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        printTreeWords();
        checkSumSign();
        //printColor();
        compareNumbers();
    }

    public static void printTreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = 1;
        int b = 3;
        int sum = a + b;
        if (sum > 0) {
            System.out.println("sum положительная");
        } else {
            System.out.println("SUM отрицательная");
        }
    }

    static void printColor() {
        Scanner console = new Scanner(System.in);
        int color = console.nextInt();
        if (color <= 0) {
            System.out.println("Красный");
        }
        if (color <= 100) {
            System.out.println("Желтый");
        }
        if (color > 100) {
            System.out.println("Зеленый");
        }
    }

    static void compareNumbers() {
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        int number1 = num1.nextInt();
        int number2 = num2.nextInt();
        if (number1 >= number2) {
            System.out.println("number1 >= number2");
        } else {
            System.out.println("number1 < number2");
        }
    }
}