package ru.otus.homework9;

import java.util.ArrayList;
import java.util.List;

public class Human {
    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Human setAge(int age) {
        this.age = age;
        return this;
    }

    public String getName() {
        return name;
    }

    public Human setName(String name) {
        this.name = name;
        return this;
    }

    public static List humanNamesList(List list){
        List<Human> namesList = list;
        List<String> namesListForReturn = new ArrayList<>();
        for (Human human : namesList) {
            namesListForReturn.add(human.getName());
        }
        return namesListForReturn;
    }

    public static List humanMinAgeNamesList(int minAge, List list){
        List<Human> namesList = list;
        List<String> namesListForReturn = new ArrayList<>();
        for (Human human : namesList) {
            if(human.getAge() <= minAge) {
                namesListForReturn.add(human.getName());
            }
        }
        return namesListForReturn;
    }
    public static boolean humanMidAgeNamesList(int midAge, List list){
        List<Human> namesList = list;
        List<String> namesListForReturn = new ArrayList<>();
        int arrayMidAge = 0;
        int counter = 0;
        for (Human human : namesList) {
            arrayMidAge = arrayMidAge + human.getAge();
            counter += 1;
        }
        if (arrayMidAge / counter > midAge){
            return true;
        }
        return false;
    }
    public static Human yongestHuman (List list){
        List<Human> namesList = list;
        Human yongest = null;
        int ageCnt = namesList.get(0).getAge();
        for (Human human : namesList) {
            if(ageCnt >= human.getAge()) {
                yongest = human;
                ageCnt = human.getAge();
            }
        }
        return yongest;
    }
}