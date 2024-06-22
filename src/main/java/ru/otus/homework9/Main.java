package ru.otus.homework9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //task1
        System.out.println(fillArray(2, 9));

        //task2
        List<Integer> arr1 = new ArrayList<>(Arrays.asList(3, 13, 16, 11, 2, -9));
        System.out.println(sumArray(arr1));

        //task3
        List<Integer> arr2 = new ArrayList<>(Arrays.asList(1,2,0,4,5));
        updateArray(8, arr2);

        //task4
        List<Integer> arr3 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        increaseArray(2, arr3);

        Human human1 = new Human(12,"Дмитрий");
        Human human2 = new Human(28,"Анна");
        Human human3 = new Human(55,"Анатолий");
        Human human4 = new Human(24,"Ольга");
        Human human5 = new Human(34,"Егор");
        Human human6 = new Human(67,"Яна");

        List<Human> humanList = new ArrayList<>(Arrays.asList(human1, human2, human3, human4, human5, human6));
        System.out.println(Human.humanNamesList(humanList));
        System.out.println(Human.humanMinAgeNamesList(30, humanList));
        System.out.println(Human.humanMidAgeNamesList(20, humanList));
        System.out.println(Human.yongestHuman(humanList));
    }
    public static ArrayList fillArray(int a, int b){
        ArrayList<Integer> arr = new ArrayList();
        for (int i = 0; i < b-1; i++) {
            arr.add(a);
            a += 1;
        }
        return arr;
    }

    public static int sumArray(List list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if((int)list.get(i) > 5){
                sum += (int) list.get(i);
            }
        }
        return sum;
    }

    public static void updateArray(int a, List list){
        for (int i = 0; i < list.size(); i++) {
            list.set(i, a);
        }
        System.out.println(list.toString());
    }

    public static void increaseArray(int a, List list){
        for (int i = 0; i < list.size(); i++) {
            list.set(i,((int)list.get(i) + a));
        }
        System.out.println(list.toString());
    }

}