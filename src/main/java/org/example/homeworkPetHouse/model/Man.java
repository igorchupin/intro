package org.example.homeworkPetHouse.model;

public class Man {

    int countOfStorages;
    public Storage[] storages = new Storage[countOfStorages];

    public void giveFood() {
        for (Storage storage : storages) {
            if (storage.dogFood.kilos > 0) {
                storage.dogFood.kilos -= 1;
                System.out.println("Питомец накормлен");
            } else {
                buyFood(storage);
                storage.dogFood.kilos -= 1;
                System.out.println("Питомец накормлен");
            }
        }
    }

    public void buyFood(Storage storage) {
        storage.dogFood.kilos += 10;
    }
}
