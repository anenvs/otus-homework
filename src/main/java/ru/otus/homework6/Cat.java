package ru.otus.homework6;

public class Cat {
    String name;
    int foodKillingSpeed;
    boolean hungry;

    public Cat(String name, int foodKillingSpeed) {
        this.name = name;
        this.foodKillingSpeed = foodKillingSpeed;
        this.hungry = true;
    }

    public void eat(Plate plate){
        if(plate.currentFood > foodKillingSpeed){
            plate.eatFood(foodKillingSpeed);
            this.hungry = false;
        }
    }

    public String catInfo() {
        return "Кот " +
                "" + name + '\'' +
                ", состояние голода - " + hungry;
    }
}