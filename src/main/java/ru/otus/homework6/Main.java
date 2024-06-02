package ru.otus.homework6;

public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate(100);
        Cat[] cats = {
                new Cat("Иван", 10),
                new Cat("Дмитрий", 15),
                new Cat("Ольга", 30),
                new Cat("Анна", 40),
                new Cat("Николай", 15)
        };
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            System.out.println(cats[i].catInfo());
        }
    }
}

