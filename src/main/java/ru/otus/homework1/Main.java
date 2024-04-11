package ru.otus.homework1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //первая домашняя работа
        System.out.println("Введите число от 1 до 5");
        Scanner scanner = new Scanner(System.in);

        int userInt = scanner.nextInt();

        if (userInt == 1) {
            greetings();
        } else if (userInt == 2) {
            checkSign(1, 5, 18);
        } else if (userInt == 3) {
            selectColor();
        } else if (userInt == 4) {
            compareNumbers();
        } else if (userInt == 5) {
            addOrSubtractAndPrint(5, 10, false);
        } else System.out.println("Вы ввели что-то не то");
    }

    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c){
        int result = a + b + c;
        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor(){
        int data = 14;
        if (data <= 10) {
            System.out.println("Красный");
        } else if(data > 10 && data <= 20) {
            System.out.println("Желтый");
        } else if (data >20){
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(){
        int a = 10;
        int b = 20;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment){
        if (increment == true) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }
}