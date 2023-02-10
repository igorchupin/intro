package org.example.multiThread;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println("Main thread");
//        Thread myThreadExt = new MyThreadExt();
//        myThreadExt.start();
//        Thread.sleep(1000);
//        System.out.println("Main thread");
//        System.out.println("Main thread");
//        MyThreadImpl myThreadRunnable = new MyThreadImpl();
//        Thread myThreadImpl = new Thread(myThreadRunnable, "newThreadImpl");
//        myThreadImpl.start();

//        Thread.sleep(1000);
//        System.out.println("Main thread");
//        if (!myThreadImpl.isAlive() && !myThreadExt.isAlive()) {
//            System.out.println("Now we can finish");
//        } else {
//            Syst/em.out.println("Still alive threads");
//            Thread.sleep(5000);
//        }
//        System.out.println("Now we can finish");

//        myThreadImpl.join();
//        System.out.println("MainThread finish");
        CommonResource commonResource = new CommonResource();
        Thread one = new CommonResourceUserThreadOne(commonResource);
        Thread two = new CommonResourceUserThreadTwo(commonResource);
        one.start();
        two.start();
        Thread.sleep(1000);
        System.out.println(commonResource.someNumber);

        CommonResource commonResource1 = new CommonResource();
        Caller caller = new Caller(commonResource1);
        Thread three = new CommonResourceUserThreadThree(caller, "three");
        Thread three1 = new CommonResourceUserThreadThree(caller,"three1");

        three.start();
        three1.start();
        three.join();
        three1.join();


        System.out.println(commonResource1.someNumber);


    }


}
