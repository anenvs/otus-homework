package ru.otus.homework7.transport;

import ru.otus.homework7.domain.Human;

public class Car extends Transport {
    private int fuel;

    public Car(String name, int fuel) {
        super(name);
        this.fuel = fuel;
    }

    @Override
    public void move(int distance, TerrainType terrainType, Human human) {
        if (canMoveOnCurrentTerrain(terrainType)) {
            if (fuel >= distance) {
                fuel -= distance;
                System.out.println(getName() + " moved " + distance + " on " + terrainType + ". Fuel left:" + fuel);
            } else {
                System.out.println("Not enought fuel to move " + distance + " on " + getName());
            }
        } else {
            System.out.println(getName() + " can't move on current terrain " + terrainType);
        }
    }

    @Override
    public boolean canMoveOnCurrentTerrain(TerrainType terrainType) {
        return terrainType != TerrainType.FOREST && terrainType != TerrainType.SWAMP;
    }
}
