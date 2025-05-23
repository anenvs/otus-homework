package ru.otus.homework10;

import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> nameToPhoneNumbers;

    public PhoneBook() {
        nameToPhoneNumbers = new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        if (nameToPhoneNumbers.containsKey(name)) {
            List<String> phoneNumbers = nameToPhoneNumbers.get(name);
            phoneNumbers.add(phoneNumber);
        } else {
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            nameToPhoneNumbers.put(name, phoneNumbers);
        }
    }

    public List<String> find(String name) {
        return nameToPhoneNumbers.getOrDefault(name, Collections.emptyList());
    }

    public boolean containsPhoneNumber(String phoneNumber) {
        for (List<String> phoneNumbers : nameToPhoneNumbers.values()) {
            if (phoneNumbers.contains(phoneNumber)) {
                return true;
            }
        }
        return false;
    }
}