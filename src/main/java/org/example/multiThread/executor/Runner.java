package org.example.multiThread.executor;

import java.util.concurrent.*;

public class Runner {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Thread thread = new Thread(new ManagedThread());
        executor.execute(thread);
        executor.execute(thread);
        Future<String> submit1 = executor.submit(new MyCallable());
        System.out.println(submit1.get());
    }

}
