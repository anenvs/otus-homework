package ru.otus.homework4;

public class Box {

    private String color;
    private String size;
    private boolean isOpen;
    private boolean isEmpty;
    private String Item;

    public Box(String color, String size) {
        this.color = color;
        this.size = size;
        isOpen = true;
        isEmpty = true;
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
            System.out.println("В коробке находится: " + Item);
        }
    }

    public boolean getIsOpen() {
        if (isOpen) {
            System.out.println("Коробка открыта");
        } else {
            System.out.println("Коробка закрыта");
        }
        return isOpen;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public void fillBox(String Item) {
        if (isOpen && isEmpty) {
            this.Item = Item;
            System.out.println("В коробку добавлено: " + Item);
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
            this.Item = null;
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
