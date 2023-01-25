package org.example;

public interface Player {
    int a = 1;
    void play();


    default void doSmth() {
        System.out.println("Nothing");
    }


    void learn(LearningTool learningTool);

}
