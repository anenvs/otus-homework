package ru.otus.homework10;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов Иван Иваныч", "+7(926)123-45-67");
        phoneBook.add("Дмитриев Дмитрий Дмитриевич", "+7(926)223-45-67");
        phoneBook.add("Сидорова Анна Александровна", "+7(926)323-45-67");
        phoneBook.add("Сидорова Анна Александровна", "+7(926)423-45-67");

        System.out.println("Телефоны Анна Александровны: " + phoneBook.find("Сидорова Анна Александровна"));
        System.out.println("Телефоны Дмитриев Дмитрий: " + phoneBook.find("Дмитриев Дмитрий Дмитриевич"));
        System.out.println("Телефоны несуществующего человека: " + phoneBook.find("Неизвестный"));

        System.out.println("Содержит номер +7(926)123-45-67? " + phoneBook.containsPhoneNumber("+7(926)123-45-67"));
        System.out.println("Содержит номер 000-000-000? " + phoneBook.containsPhoneNumber("000-000-000"));
    }
}