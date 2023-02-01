package org.example.generics.model;

public class Dog extends Animal implements Comparable<Dog>{
    @Override
    public int compareTo(Dog o) {
        return 0;
    }

}
