package ru.otus.homework7;

public class Car implements Move {
    private int fuel;

    public Car(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean move(Terrain terrain, int distance) {
        if (terrain == Terrain.SWAMP && terrain == Terrain.WOOD) {
            System.out.println("Машина не может проехать по этому типу местности");
            return false;
        } else if(this.fuel < distance / 9) {
            System.out.println("Не хватит бензина");
            return false;
        }
        this.fuel = this.fuel - distance / 9;
        System.out.println("Проехал на машине: "+ distance+ ". Осталось бензина: " + this.fuel);
        return true;

    }
}