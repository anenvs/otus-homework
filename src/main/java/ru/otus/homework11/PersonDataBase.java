package ru.otus.homework11;

import java.util.HashMap;
import java.util.Map;

public class PersonDataBase {
    private final Map<Long, Person> personsById;
    private final Map<Long, Boolean> managerStatusCache;

    public PersonDataBase() {
        this.personsById = new HashMap<>();
        this.managerStatusCache = new HashMap<>();
    }

    // O(1)
    public Person findById(Long id) {
        return personsById.get(id);
    }

    // O(1)
    public void add(Person person) {
        personsById.put(person.getId(), person);
        managerStatusCache.put(person.getId(), isManagerPosition(person.getPosition()));
    }

    // O(1)
    public boolean isManager(Person person) {
        return managerStatusCache.getOrDefault(person.getId(), false);
    }

    // O(1)
    public boolean isEmployee(Long id) {
        return !isManager(findById(id));
    }

    private boolean isManagerPosition(Position position) {
        return position == Position.MANAGER ||
                position == Position.DIRECTOR ||
                position == Position.BRANCH_DIRECTOR ||
                position == Position.SENIOR_MANAGER;
    }
}