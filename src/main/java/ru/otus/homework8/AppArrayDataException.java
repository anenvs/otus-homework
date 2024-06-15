package ru.otus.homework8;

public class AppArrayDataException extends Exception{
    private int i;
    private int j;

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public AppArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public String toString() {
        return "Ошибка данных в массиве: [" + this.i + "," + this.j + "]";
    }

}
