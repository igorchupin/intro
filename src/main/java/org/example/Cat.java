package org.example;

public class Cat extends Animal implements Player{

    public int a;
    public Dog dog;

    public Cat() {
        this.dog = dog;
        boolean isAlive1 = super.isAlive;
    }

    @Override
    public void play() {
        System.out.println("I'm doing tigidic");
    }

    @Override
    public void learn(LearningTool learningTool) {
        learningTool.teach();
    }
}
