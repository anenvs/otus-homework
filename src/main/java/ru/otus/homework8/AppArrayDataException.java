package ru.otus.homework8;

public class AppArrayDataException extends Exception {
    private final int i;
    private final int j;

    public AppArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public String toString() {
        return "Ошибка данных в массиве: [" + this.i + "," + this.j + "]";
    }
}

