package ru.otus.homework9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //task1
        System.out.println(getSequence(2, 9));

        //task2
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 13, 16, 11, 2, -9));
        System.out.println(sumNumbersGreaterThanFive(numbers));

        //task3
        List<Integer> numbersToUpdate = new ArrayList<>(Arrays.asList(1, 2, 0, 4, 5));
        fillListWithValue(8, numbersToUpdate);

        //task4
        List<Integer> numbersToIncrease = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        increaseListValues(2, numbersToIncrease);

        Human human1 = new Human(12, "Дмитрий");
        Human human2 = new Human(28, "Анна");
        Human human3 = new Human(55, "Анатолий");
        Human human4 = new Human(24, "Ольга");
        Human human5 = new Human(34, "Егор");
        Human human6 = new Human(67, "Яна");

        List<Human> humanList = new ArrayList<>(Arrays.asList(human1, human2, human3, human4, human5, human6));
        System.out.println(HumanUtils.getHumanNamesList(humanList));
        System.out.println(HumanUtils.filterHumansByMinAge(30, humanList));
        System.out.println(HumanUtils.isAverageAgeGreaterThan(20, humanList));
        System.out.println(HumanUtils.getYoungestHuman(humanList));
    }

    public static List<Integer> getSequence(int min, int max) {
        List<Integer> sequence = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            sequence.add(i);
        }
        return sequence;
    }

    public static int sumNumbersGreaterThanFive(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number > 5) {
                sum += number;
            }
        }
        return sum;
    }

    public static void fillListWithValue(int newValue, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, newValue);
        }
        System.out.println(list);
    }

    public static void increaseListValues(int increment, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + increment);
        }
        System.out.println(list);
    }
}