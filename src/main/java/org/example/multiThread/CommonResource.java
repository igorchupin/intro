package org.example.multiThread;

public class CommonResource {

    public int someNumber;

    public synchronized void addOneToIntSynch() {
        someNumber++;
    }

    public void addOneToIntNonSynch() {
        someNumber++;
    }
}
