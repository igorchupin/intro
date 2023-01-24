package org.example;

public class Cat implements Player{

    public int a;
    @Override
    public void play() {
        System.out.println("I'm doing tigidic");
    }

    @Override
    public void learn(LearningTool learningTool) {
        learningTool.teach();
    }
}
