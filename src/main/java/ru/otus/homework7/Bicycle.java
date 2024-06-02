package ru.otus.homework7;

public class Bicycle {

    public boolean move(Terrain terrain, int distance, int energy) {
        if (terrain == Terrain.SWAMP) {
            System.out.println("Велосипед не может ехать по этому типу местности");
            return false;
        } else if (energy > distance / 2) {
            return true;
        }
        return false;
    }
}


