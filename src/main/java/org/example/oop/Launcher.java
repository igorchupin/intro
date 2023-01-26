package org.example.oop;

import org.example.Cat;
import org.example.Player;
import org.example.oop.abstractClass.Car;
import org.example.oop.abstractClass.ElectronikCar;

public class Launcher {


    public static void main(String[] args) {
        ElectronikCar car = new ElectronikCar();
        Car car1;

//        car.compareTo(new Cat());

        car.drive();
    }

}
