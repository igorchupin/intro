package org.example;

public class Main {
    public static void main(String[] args) {

        Player cat = new Cat();
        Player dog = new Dog();

        cat.play();
        dog.play();

        cat.learn(new Book());
        dog.learn(new PC());


    }


}