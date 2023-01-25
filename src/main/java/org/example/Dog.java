package org.example;

public class Dog implements Player{

    public int dogAge;

    String sound = new String("");


    public Dog() {

    }

    public Dog(int dogAge) {

    }

    public void doSound() {
        System.out.println(this.sound);
        System.out.println(this.sound);
        System.out.println(this.sound);
    }


    @Override
    public void play() {
        System.out.println("I'm running with the ball");
    }

    @Override
    public void learn(LearningTool learningTool) {
        learningTool.teach();
    }
}
