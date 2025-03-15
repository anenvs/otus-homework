package ru.otus.homework7.transport;

import ru.otus.homework7.domain.Human;

public class Bicycle extends Transport {

    public Bicycle(String name) {
        super(name);
    }

    @Override
    public void move(int distance, TerrainType terrainType, Human human) {
        if (canMoveOnCurrentTerrain(terrainType)) {
            int riderStamina = human.getStamina();
            if (riderStamina >= distance) {
                human.setStamina(riderStamina - distance);
                System.out.println(getName() + " rided " + distance + " on " + terrainType + ". Stamina left:" + human.getStamina());
            } else {
                System.out.println("Not enought stamina to ride " + distance + " on " + getName() + ". Stamina left:" + human.getStamina());
            }
        }   else {
            System.out.println(getName() + " can't move on current terrain " + terrainType);
        }
    }

    @Override
    public boolean canMoveOnCurrentTerrain(TerrainType terrainType) {
        return terrainType != TerrainType.SWAMP;
    }
}


