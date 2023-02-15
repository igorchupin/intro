package org.example.multiThread.waitNotify;

public class CommonRes {
    private int someInt;
    private boolean valueSet;

    synchronized int get() {
        while(!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Num was used " + someInt);
        valueSet = false;
        notify();
        return someInt;
    }

    synchronized void setSomeInt(int num) {
        while (valueSet){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.someInt = num;
        valueSet = true;
        System.out.println("Num is set " + num);
        notify();

    }

}
