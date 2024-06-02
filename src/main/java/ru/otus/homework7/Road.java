package ru.otus.homework7;

public class Road {
    Terrain terrain;

    public Road setTerrain(Terrain terrain) {
        this.terrain = terrain;
        return this;
    }
    public Terrain getTerrain() {
        return terrain;
    }

}
