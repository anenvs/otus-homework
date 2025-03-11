package ru.otus.homework5;

import ru.otus.homework5.animals.*;

public class Main {

    public static void main(String[] args) {
        //CAT part
        Cat cat = new Cat("Пушок", 30);
        //cat run part
        cat.run(20);
        System.out.println(cat.toString());
        cat.run(10);
        System.out.println(cat.toString());
        //cat swim part
        cat.swim(20);
        System.out.println(cat.toString());

        //Dog part
        Dog dog = new Dog("Бобик", 50);
        System.out.println(dog.toString());
        dog.run(20);
        System.out.println(dog.toString());
        dog.swim(20);

        //Horse part
        Horse horse = new Horse("Алиста", 200);
        System.out.println(horse.toString());
        horse.run(20);
        System.out.println(dog.toString());
        horse.swim(10);
    }

}
