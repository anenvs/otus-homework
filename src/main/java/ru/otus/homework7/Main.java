package ru.otus.homework7;

public class Main {

    public static void main(String[] args) {
        Road road = new Road();
        road.setTerrain(Terrain.PLAIN);

        Human human = new Human("Олег");
        human.setCurrentTransport(Transport.JEEP);

        System.out.println(human.move(road.getTerrain(), 20));
    }
}