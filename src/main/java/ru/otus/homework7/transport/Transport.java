package ru.otus.homework7.transport;

import ru.otus.homework7.domain.Human;

public abstract class Transport {
    private final String name;

    public Transport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract void move(int distance, TerrainType terrainType, Human human);
    public abstract boolean canMoveOnCurrentTerrain(TerrainType terrainType);

}
