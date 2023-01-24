package org.example;

public enum Monitors {

    HP(true), LENOVO(false);

    boolean b;
    Monitors(Boolean hasHDMI) {
        this.b = hasHDMI;
    }

    Monitors(){

}
}
