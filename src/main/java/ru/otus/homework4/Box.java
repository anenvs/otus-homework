package ru.otus.homework4;

public class Box {

    private String color;
    private String size;
    private boolean isOpen;
    private boolean isEmpty;
    private String item;

    public Box(String color, String size) {
        this.color = color;
        this.size = size;
        this.isOpen = true;
        this.isEmpty = true;
    }

    public String getColor() {
        return color;
    }

    public Box setColor(String color) {
        this.color = color;
        return this;
    }

    public String getSize() {
        return size;
    }

    public void printBoxInfo() {
        System.out.println("Размер коробки: " + size);
        System.out.println("Цвет коробки: " + color);
        if (isOpen) {
            System.out.println("Коробка открыта");
        } else {
            System.out.println("Коробка закрыта");
        }
        if (isEmpty) {
            System.out.println("Коробка пуста");
        } else {
            System.out.println("В коробке находится: " + item);
        }
    }

    public boolean getIsOpen() {
        return isOpen;
    }

    public void open() {
        this.isOpen = isOpen;
    }

    public void close() {
        this.isOpen = isOpen;
    }

    public void fillBox(String item) {
        if (isOpen && isEmpty) {
            this.item = item;
            System.out.println("В коробку добавлено: " + item);
            isEmpty = false;
        } else if (!isOpen && !isEmpty) {
            System.out.println("Положить не удалось. Коробка наполенена и закрыта");
        } else if (isOpen && !isEmpty) {
            System.out.println("Положить не удалось. Коробка не пуста");
        } else if (!isOpen && isEmpty) {
            System.out.println("Положить не удалось. Коробка закрыта");
        }
    }

    public void cleanBox() {
        if (isOpen && !isEmpty) {
            this.item = null;
            System.out.println("Коробка отчищена");
            isEmpty = true;
        } else if (!isOpen && isEmpty) {
            System.out.println("Очистить не удалось. Коробка закрыта и пуста.");
        } else if (!isOpen && !isEmpty) {
            System.out.println("Очистить не удалось. Коробка закрыта.");
        } else if (isOpen && !isEmpty) {
            System.out.println("Очистить не удалось. Коробка уже пуста.");
        }
    }
}
