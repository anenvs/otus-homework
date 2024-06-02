package ru.otus.homework7;

public class Horse implements Move{
    private int energy;
    public Horse(int energy) {
        this.energy = energy;
    }
    @Override
    public boolean move(Terrain terrain, int distance) {
        if (terrain == Terrain.SWAMP) {
            System.out.println("Лошадь не может скакать по этому типу местности");
            return false;
        } else if (this.energy < distance / 1) {
            System.out.println("Не хватит энергии");
            return false;
        }
        this.energy = this.energy - distance / 1;
        System.out.println("Проехал на лошади: "+ distance+ ". Осталось энергии: " + this.energy);
        return true;
    }
}