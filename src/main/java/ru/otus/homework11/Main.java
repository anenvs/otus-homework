package ru.otus.homework11;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PersonDataBase db = new PersonDataBase();
        db.add(new Person(1L, "Иван", Position.MANAGER));
        db.add(new Person(2L, "Мария", Position.DEVELOPER));
        db.add(new Person(3L, "Анна", Position.JANITOR));
        db.add(new Person(4L, "Егор", Position.BRANCH_DIRECTOR));

        System.out.println(db.isManager(db.findById(1L)));
        System.out.println(db.isEmployee(2L));
        System.out.println(db.isManager(db.findById(3L)));
        System.out.println(db.isManager(db.findById(4L)));

        int[] arr = {5, 3, 8, 4, 2};
        SortUtils.quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}