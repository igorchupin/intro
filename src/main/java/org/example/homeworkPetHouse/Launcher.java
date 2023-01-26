package org.example.homeworkPetHouse;

import org.example.homeworkPetHouse.model.*;

public class Launcher {

    public static void main(String[] args) {
        DogFood dogFood = new DogFood(3);
        CatFood catFood = new CatFood(2);
        Storage storage = new Storage(dogFood,catFood);
        Woman master = new Woman(3);
        master.initStorages(storage);
        Cat cat = new Cat(master);

        for (int i = 0; i < 30; i++) {
            cat.askForFood();
        }

    }
}
