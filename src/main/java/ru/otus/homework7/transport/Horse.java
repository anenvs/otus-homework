package ru.otus.homework7.transport;

import ru.otus.homework7.domain.Human;

public class Horse extends Transport {
    private int stamina;

    public Horse(String name, int stamina) {
        super(name);
        this.stamina = stamina;
    }

    @Override
    public void move(int distance, TerrainType terrainType, Human human) {
        if (canMoveOnCurrentTerrain(terrainType)) {
            if (stamina >= distance) {
                stamina -= distance;
                System.out.println(getName() + " rided " + distance + " on " + terrainType + ". Stamina left:" + stamina);
            } else {
                System.out.println("Not enought stamina to ride " + distance + " on " + getName() + ". Stamina left:" + stamina);
            }
        } else {
            System.out.println(getName() + " can't move on current terrain " + terrainType);
        }

    }

    @Override
    public boolean canMoveOnCurrentTerrain(TerrainType terrainType) {
        return terrainType != TerrainType.SWAMP;
    }
}
