package ru.otus.homework11;

import java.util.*;

public class PersonDataBase {
    private final Map<Long, Person> personsById;
    private final Map<Long, Boolean> managerStatusCache;
    private final Set<Position> managerPositions;

    public PersonDataBase() {
        this.personsById = new HashMap<>();
        this.managerStatusCache = new HashMap<>();
        this.managerPositions = new HashSet<>(Arrays.asList(
                Position.MANAGER,
                Position.DIRECTOR,
                Position.BRANCH_DIRECTOR,
                Position.SENIOR_MANAGER
        ));
    }

    // O(1)
    public Person findById(Long id) {
        return personsById.get(id);
    }

    // O(1)
    public void add(Person person) {
        personsById.put(person.getId(), person);
        managerStatusCache.put(person.getId(), managerPositions.contains(person.getPosition()));
    }

    // O(1)
    public boolean isManager(Person person) {
        return managerStatusCache.getOrDefault(person.getId(), false);
    }

    // O(1)
    public boolean isEmployee(Long id) {
        return !isManager(findById(id));
    }
}