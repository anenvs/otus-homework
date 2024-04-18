package ru.otus.homework2;

import java.net.SocketTimeoutException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //task1. print text X times
        printTextCycle(5, "Mytext");

        //task2. sum arrays numbers bigger then 5
        int[] array2 = {1, 2, 12, 4, 7, 9, 10};
        sumArrBiggerThenFive(array2);

        //task3. set array values
        int number3 = 4;
        int[] array3 = {5, 7, 12, 1, 2, 4};
        setArrValues(number3, array3);

        //tast4. increment array values
        int number4 = 2;
        int[] array4 = {1, 2, 4, 3, 1, 8};
        incArrValues(number4, array4);

        //task5. Array half's comparison
        int[] array5 = {1, 2, 3, 3, 5, 1};
        comparisonArray(array5);

        //additional task1.
        int[] array_a1 = {1, 2, 3, 2, 8};
        int[] array_a2 = {2, 4, 6, 4, 1, 3, 5};
        int[] array_a3 = {5, 1, 5, 2, 3, 9};
        sumArrays(array_a1, array_a2, array_a3);

        //additional task2.
        int[] array_b1 = {1, 2, 3, 0, 7, -1};
        findSumInsideArray(array_b1);

        //additional task3.
        int[] array_c1 = {4, 3, 2, 1};
        increaseOrDecreaseCheck(array_c1);

        //additional task4. Array reverse
        int[] array_d1 = {10, 20, 30, 40, 50};
        reverseArray(array_d1);
    }

    public static void printTextCycle(int counter, String text) {
        for (int i = 0; i < counter; i++) {
            System.out.println(text);
        }
    }

    public static void sumArrBiggerThenFive(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }

    public static void setArrValues(int number, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = number;
        }
    }

    public static void incArrValues(int number, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += number;
        }
    }

    public static void comparisonArray(int[] arr) {
        int halfNumber = arr.length / 2;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < halfNumber; i++) {
            sum1 += arr[i];
        }
        for (int i = halfNumber; i < arr.length; i++) {
            sum2 += arr[i];
        }
        if (sum1 > sum2) {
            System.out.println("Сумма из первой половины массива больше");
        } else System.out.println("Сумма из второй половины массива больше");
    }

    private static void sumArrays(int[] arr1, int[] arr2, int[] arr3) {

        int biggerArrayLength = Math.max(arr1.length, arr2.length);
        if (biggerArrayLength < arr3.length) {
            biggerArrayLength = arr3.length;
        }
        int[] finalArray = new int[biggerArrayLength];
        int smallerArrayLength = Math.min(arr1.length, arr2.length);
        if (smallerArrayLength > arr3.length) {
            smallerArrayLength = arr3.length;
        }
        int nextArrayLength = 0;

        for (int i = 0; i < smallerArrayLength; i++) {
            finalArray[i] = arr1[i] + arr2[i] + arr3[i];
        }

        if (smallerArrayLength == arr1.length) {

            nextArrayLength = Math.min(arr2.length, arr3.length);
            if (smallerArrayLength == arr2.length) {
                for (int i = smallerArrayLength; i < nextArrayLength; i++) {
                    finalArray[i] = arr2[i] + arr3[i];
                }

            } else
                for (int i = smallerArrayLength; i < nextArrayLength; i++) {
                    finalArray[i] = arr3[i] + arr2[i];
                }
            if (biggerArrayLength == arr2.length) {
                for (int i = nextArrayLength; i < biggerArrayLength; i++) {
                    finalArray[i] = arr2[i];
                }
            } else {
                for (int i = nextArrayLength; i < biggerArrayLength; i++) {
                    finalArray[i] = arr3[i];
                }

            }
        } else if (smallerArrayLength == arr2.length) {
            nextArrayLength = Math.min(arr1.length, arr3.length);
            if (smallerArrayLength == arr1.length) {
                for (int i = smallerArrayLength; i < nextArrayLength; i++) {
                    finalArray[i] = arr1[i] + arr3[i];
                }

            } else
                for (int i = smallerArrayLength; i < nextArrayLength; i++) {
                    finalArray[i] = arr3[i] + arr1[i];
                }
            if (biggerArrayLength == arr1.length) {
                for (int i = nextArrayLength; i < biggerArrayLength; i++) {
                    finalArray[i] = arr1[i];
                }
            } else {
                for (int i = nextArrayLength; i < biggerArrayLength; i++) {
                    finalArray[i] = arr3[i];
                }
            }
        } else {
            nextArrayLength = Math.min(arr1.length, arr2.length);
            if (smallerArrayLength == arr1.length) {
                for (int i = smallerArrayLength; i < nextArrayLength; i++) {
                    finalArray[i] = arr1[i] + arr2[i];
                }

            } else ;
            for (int i = smallerArrayLength; i < nextArrayLength; i++) {
                finalArray[i] = arr2[i] + arr1[i];
            }
            if (biggerArrayLength == arr2.length) {

                for (int i = nextArrayLength; i < biggerArrayLength; i++) {
                    finalArray[i] = arr2[i];
                }
            } else {
                for (int i = nextArrayLength; i < biggerArrayLength; i++) {
                    finalArray[i] = arr1[i];
                }
            }
        }
        System.out.println(Arrays.toString(finalArray));
    }

    public static void increaseOrDecreaseCheck(int[] arr) {
        int arrayNumber = arr[0];
        int checkArrayIncrease = 1;
        int checkArrayDecrease = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arrayNumber) {
                checkArrayIncrease += 1;
            } else if (arr[i] < arrayNumber) {
                checkArrayDecrease += 1;
            }
            arrayNumber = arr[i];
        }
        if (arr.length == checkArrayIncrease) {
            System.out.println("Массив возрастающий");
        } else if (arr.length == checkArrayDecrease) {
            System.out.println("Массив убывающий");
        }
    }

    public static void findSumInsideArray(int[] arr) {
        int sumAhead = 0;
        String finalArray = ("[");
        for (int i = 0; i < arr.length; i++) {
            sumAhead += arr[i];
            int sumBehind = 0;
            finalArray += arr[i] + ", ";
            for (int j = arr.length - 1; j > i; j--) {
                sumBehind += arr[j];
            }
            if (sumAhead == sumBehind) {
                finalArray += '|';
            }
        }
        System.out.println(finalArray.substring(0, finalArray.length() - 2) + "]");
    }

    public static void reverseArray(int[] arr) {
        String s = "[";
        for (int i = arr.length - 1; i >= 0; i--) {
            s += arr[i] + ", ";
        }
        System.out.println(s.substring(0, s.length() - 2) + "]");
    }
}
