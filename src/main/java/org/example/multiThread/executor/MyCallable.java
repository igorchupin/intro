package org.example.multiThread.executor;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {

        Thread.sleep(3000);
        return "S s";
    }
}
