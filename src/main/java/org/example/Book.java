package org.example;

public class Book implements LearningTool{
    @Override
    public void teach() {
        System.out.println("I'm book teacher");
    }
}
