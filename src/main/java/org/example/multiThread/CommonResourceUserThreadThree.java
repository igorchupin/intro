package org.example.multiThread;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.random.RandomGenerator;

public class CommonResourceUserThreadThree extends Thread {

    private Caller caller;

    public CommonResourceUserThreadThree(Caller caller, String name) {
        super(name);
        this.caller = caller;
    }
    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            try {
                Thread.sleep(RandomGenerator.getDefault().nextInt(0, 1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            caller.useCommonResource();
        }
    }
}
