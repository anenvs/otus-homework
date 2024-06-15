package ru.otus.homework6;

public class Plate {
    int maxFood;
    int currentFood;

    public Plate(int maxFood) {
        this.maxFood = maxFood;
        this.currentFood = maxFood;
    }

    public void addFood(){
        if(maxFood < (this.currentFood + currentFood)){
            System.out.println("Тарелка переполнена");
        }
        else{
            this.currentFood = this.currentFood + currentFood;
        }
    }

    public boolean eatFood(int currentFood) {
        if ((this.currentFood - currentFood) > 0) {
            this.currentFood = this.currentFood - currentFood;
            return true;
        } else {
            return false;
        }
    }
}
