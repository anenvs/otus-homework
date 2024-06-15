package ru.otus.homework7;

public class Jeep implements Move {
    private int fuel;
    public Jeep(int fuel) {
        this.fuel = fuel;
    }
    @Override
    public boolean move(Terrain terrain, int distance) {
        if (this.fuel < distance / 15) {
            System.out.println("Не хватит бензина");
            return false;
        }
        this.fuel = this.fuel - distance / 15;
        System.out.println("Проехал на вездеходе: "+ distance + ". Осталось бензина: " + this.fuel);
        return true;
    }
}