package org.example.multiThread;

public class MyThreadImpl implements Runnable{

    @Override
    public void run() {
        System.out.println("From myThreadImpl");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("ThreadImpl is not sleeping now");
    }
}
