package org.example.oop;

public class Transmission {

    TransmissionState transmissionState;

    public Transmission() {
        transmissionState = TransmissionState.PARKING;
    }

    public void move() {
        if (transmissionState == TransmissionState.DRIVE) {
            System.out.println("I'm driving");
        } else {
            System.out.println("I'm on parking mode");
        }
    }
}
