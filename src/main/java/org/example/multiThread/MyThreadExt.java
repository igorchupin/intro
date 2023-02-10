package org.example.multiThread;

public class MyThreadExt extends Thread{

    public MyThreadExt() {
        super("myThreadExt");
    }
    @Override
    public void run() {
        System.out.println("From new thread");
    }
}
