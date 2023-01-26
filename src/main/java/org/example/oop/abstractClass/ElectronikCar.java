package org.example.oop.abstractClass;

import org.example.Cat;

public class ElectronikCar extends Car implements Comparable<ElectronikCar>{

    @Override
    public void drive() {

    }

    public void stop() {
        System.out.println();
    }

    @Override
    public int compareTo(ElectronikCar o) {
        if (super.a == o.a) {
            return 0;
        }
        return 1;
    }
}
