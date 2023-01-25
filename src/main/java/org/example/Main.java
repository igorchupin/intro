package org.example;

public class Main {
    public static void main(String[] args) {

        Player dog = new Dog();
        Player cat = new Cat();

        cat.play();
        dog.play();


        cat.learn(new Book());
        dog.learn(new PC());


    }


}