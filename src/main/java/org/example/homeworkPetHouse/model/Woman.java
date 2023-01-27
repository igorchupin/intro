package org.example.homeworkPetHouse.model;

public class Woman {

    public Storage[] storages;

    public Woman(int countOfStorages) {
        storages = new Storage[countOfStorages];
    }

    public void initStorages(Storage newStorage) {
        for (int i = 0; i < storages.length; i++) {
            storages[i] = newStorage;
        }
    }

    public void giveFood() {
        for (int i = 0; i < storages.length; i++) {

            if (storages[i].catFood.kilos > 0) {
                storages[i].catFood.kilos -= 1;
                System.out.println("Питомец накормлен");
                return;
            } else {
                buyFood(storages[i]);
                System.out.println("Кладовка пополнена");
                storages[i].catFood.kilos -= 1;
                System.out.println("Питомец накормлен");
            }
        }

    }

    public void buyFood(Storage storage) {
        storage.catFood.kilos += 5;
    }
}
