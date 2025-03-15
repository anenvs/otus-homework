package ru.otus.homework7;

import ru.otus.homework7.domain.Human;
import ru.otus.homework7.transport.*;

public class Application {
    public static void main(String[] args) {
        Human human = new Human("Joe", 20);

        Car car = new Car("LADA", 60);
        Horse horse = new Horse("Horse", 30);
        Bicycle bicycle = new Bicycle("Bycicle");
        Jeep jeep = new Jeep("Hammer", 120);

        human.move(10, TerrainType.PLAIN);

        human.mount(car);
        human.move(50, TerrainType.PLAIN);
        human.move(10, TerrainType.FOREST);
        human.move(20, TerrainType.PLAIN);

        human.dismount();
        human.mount(horse);
        human.move(15, TerrainType.SWAMP);
        human.move(10, TerrainType.PLAIN);

        human.mount(bicycle);
        human.move(25, TerrainType.PLAIN);
        human.move(10, TerrainType.PLAIN);

        human.dismount();
        human.mount(bicycle);
        human.move(25, TerrainType.SWAMP);
        human.move(10, TerrainType.PLAIN);
        human.move(20, TerrainType.PLAIN);

        human.dismount();
        human.mount(jeep);
        human.move(50, TerrainType.SWAMP);

    }
}
