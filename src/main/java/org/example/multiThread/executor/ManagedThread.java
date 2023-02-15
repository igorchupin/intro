package org.example.multiThread.executor;

import java.util.concurrent.Callable;

public class ManagedThread implements Runnable, Callable<String> {
    @Override
    public void run() {
        System.out.println(SharedRes.a++);
        System.out.println(SharedRes.a);
    }

    @Override
    public String call() throws Exception {
        return "Some string";
    }
}
