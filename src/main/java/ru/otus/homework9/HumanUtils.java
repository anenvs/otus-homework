package ru.otus.homework9;

import java.util.ArrayList;
import java.util.List;

public class HumanUtils {
    public static List<String> getHumanNamesList(List<Human> humans) {
        List<String> namesList = new ArrayList<>();
        for (Human human : humans) {
            namesList.add(human.getName());
        }
        return namesList;
    }

    public static List<Human> filterHumansByMinAge(int minAge, List<Human> humans) {
        List<Human> filteredList = new ArrayList<>();
        for (Human human : humans) {
            if (human.getAge() >= minAge) {
                filteredList.add(human);
            }
        }
        return filteredList;
    }

    public static boolean isAverageAgeGreaterThan(int midAge, List<Human> humans) {
        int totalAge = 0;
        int count = 0;
        for (Human human : humans) {
            totalAge += human.getAge();
            count += 1;
        }
        return count!=0 && totalAge / count > midAge;
    }

    public static Human getYoungestHuman(List<Human> humans) {
        if (humans.isEmpty()) {
            return null;
        }

        Human youngest = humans.getFirst();
        int minAge = youngest.getAge();

        for (Human human : humans) {
            if (human.getAge() < minAge) {
                youngest = human;
                minAge = human.getAge();
            }
        }
        return youngest;
    }
}