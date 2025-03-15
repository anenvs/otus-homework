package ru.otus.homework7.domain;

import ru.otus.homework7.transport.TerrainType;
import ru.otus.homework7.transport.Transport;

public class Human {
    private final String name;
    private int stamina;
    private Transport currentTransport;

    public Human(String name, int stamina) {
        this.name = name;
        this.stamina = stamina;
    }

    public String getName() {
        return name;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void mount(Transport transport) {
        if (currentTransport != null) {
            System.out.println(name + " already mounted:" + currentTransport.getName());
        } else {
            currentTransport = transport;
            System.out.println(name + " mounted:" + transport.getName());
        }
    }

    public void dismount() {
        if (currentTransport != null) {
            System.out.println(name + " has dismounted:" + currentTransport.getName());
            currentTransport = null;
        } else {
            System.out.println(name + " has no transport");
        }
    }

    public void move(int distance, TerrainType terrainType) {
        if (currentTransport != null) {
            currentTransport.move(distance, terrainType, this);
        } else {
            System.out.println(name + " walked " + distance + " on terrain: " + terrainType);
        }
    }
}
