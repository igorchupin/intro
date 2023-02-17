package org.example.io;

public class RecursionExample {

    private int i = 0;

    public void printRecursive() {
        System.out.println(i++);
        if (i < 5) {
            printRecursive();
        }
    }
}
