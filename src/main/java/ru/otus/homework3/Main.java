package ru.otus.homework3;

public class Main {
    public static void main(String[] args) {

        //task 1 positiveArraySum
        int[][] arrayT1 = {{-1, 6, -4, 3}, {2, 7, -11, 5}};
        int sum = sumOfPositiveElements(arrayT1);
        System.out.println(sum);

        //task 2 printSquare
        int size = 5;
        printSquare(size);

        //task 3 printLine
        int[][] arrayT3 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        printLine(arrayT3);

        //task 4 maxArrayNumber
        int[][] arrayT4 = {{-5, -6, -14, -3}, {-2, -7, -11, -5}};
        int maxNumber = findMax(arrayT4);
        System.out.println(maxNumber);

        //task 5 secondLineSum
        int[][] arrayT5 = {{5, 6, 14, 3},{}};
        int lineSum = secondLineSum(arrayT5);
        System.out.println(lineSum);
    }

    public static int sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public static void printSquare(int size) {
        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printLine(int[][] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == counter) {
                    arr[i][j] = 0;
                }
                if ((arr[i].length - 1) - j == counter) {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j] + " ");
            }
            counter += 1;
            System.out.println();
        }
    }

    public static int findMax(int[][] array) {
        int maxNum = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxNum) {
                    maxNum = array[i][j];
                }
            }
        }
        return maxNum;
    }

    public static int secondLineSum(int[][] array) {
        int lineSum = 0;
        int counter = 0;

        if (array.length < 2) {
            return -1;
        }

        for (int i = 1; i <= 1; i++) {
            for (int j = 0; j < array[i].length; j++) {
                lineSum += array[i][j];
                counter += 1;
            }
            if (counter == 0) {
                lineSum = -1;
            }
        }
        return lineSum;
    }
}