package ru.otus.homework5.animals;

public abstract class Animal {
    String name;
    int runSpeed;
    int swimSpeed;
    int vitality;
    boolean fatigue;

    public int run(int distance) {
        if (fatigue) {
            System.out.println(name + " уставщий");
            return -1;
        }
        if (vitality - distance >= 0) {
            vitality = vitality - distance;
            if (vitality == 0){
                fatigue = true;
            }
            System.out.println(name + " пробежал " + distance + "м, за " + (distance / runSpeed) + " сек");
            return (distance / runSpeed);
        }
        System.out.println("Дистанция слишком большая. Животное устало");
        fatigue = true;
        return -1;
    }

    public int swim(int distance){
        if(swimSpeed == 0){
            System.out.println("Животное не умеет плавать");
            return -1;
        }
        if(vitality - (distance * swimSpeed) > 0){
            vitality = vitality - (distance * swimSpeed);
            if (vitality == 0){
                fatigue = true;
            }
            System.out.println(name + " проплыл " + distance + "м, за " + (distance / swimSpeed) + " сек");
            return (distance / swimSpeed);
        }
        System.out.println(name +  " устал и не может больше плыть");
        return -1;

    }

    @Override
    public String toString() {
        return   name +
                ", выносливость:  " + vitality +
                ", состояние усталости: " + fatigue
                ;
    }
}
