package ru.otus.homework7;

public class Human implements Move {
    private String name;
    private int strength;

    private Transport currentTransport;

    public int getStrength() {
        return strength;
    }

    public Human setStrength(int strength) {
        if(this.strength > this.strength - strength) {
            this.strength = strength;
            return this;
        }
        System.out.println("Человек устал");
        return this;
    }
    public Human setCurrentTransport(Transport currentTransport) {
        this.currentTransport = currentTransport;
        return this;
    }

    public Human(String name) {
        this.name = name;
        this.currentTransport = Transport.NONE;
        this.strength = 100;
    }

    @Override
    public boolean move(Terrain terrain, int distance) {
        if (this.currentTransport == Transport.CAR) {
            Car car = new Car(80);
            return car.move(terrain, distance);
        } else if (this.currentTransport == Transport.JEEP) {
            Jeep jeep = new Jeep(120);
            return jeep.move(terrain, distance);
        } else if (this.currentTransport == Transport.BICYCLE) {
            Bicycle bicycle = new Bicycle();
            if (bicycle.move(terrain, distance, this.strength)){
                this.strength = this.strength - distance / 2;
                System.out.println("Проехал на велосипеде: " + distance + ". Осталось сил: " + this.strength);
                return true;
            } else {
                System.out.println("Нет сил ехать на велосипеде");
                return false;
            }
        } else if (this.currentTransport == Transport.HORSE) {
            Horse horse = new Horse(100);
            return horse.move(terrain, distance);
        } else {
            System.out.println(this.currentTransport);
            System.out.println("Прошел пешком");
            return true;
        }
    }
}