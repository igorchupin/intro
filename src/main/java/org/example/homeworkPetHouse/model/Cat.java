package org.example.homeworkPetHouse.model;

public class Cat {

    public Woman master;

    public Cat(Woman master) {
        this.master = master;
    }

    public void askForFood() {
        master.giveFood();
    }
}
