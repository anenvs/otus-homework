package ru.otus.homework7.transport;

import ru.otus.homework7.domain.Human;

public class Jeep extends Transport {
    private int fuel;

    public Jeep(String name, int fuel) {
        super(name);
        this.fuel = fuel;
    }

    @Override
    public void move(int distance, TerrainType terrainType, Human human) {
        if (fuel >= distance) {
            fuel -= distance;
            System.out.println(getName() + " moved " + distance + " on " + terrainType + ". Fuel left:" + fuel);
        } else {
            System.out.println("Not enought fuel to move " + distance + " on " + getName());
        }
    }

    @Override
    public boolean canMoveOnCurrentTerrain(TerrainType terrainType) {
        return true;
    }
}
