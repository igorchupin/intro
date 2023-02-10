package org.example.multiThread;

public class CommonResourceUserThreadTwo extends Thread{
    private CommonResource commonResource;
    public CommonResourceUserThreadTwo(CommonResource commonResource) {
        this.commonResource = commonResource;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            commonResource.addOneToIntSynch();
        }
    }
}