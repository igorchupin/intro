package org.example.multiThread;

public class CommonResourceUserThreadOne extends Thread{

    private CommonResource commonResource;
    public CommonResourceUserThreadOne(CommonResource commonResource) {
        this.commonResource = commonResource;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            commonResource.addOneToIntSynch();
        }
    }
}
