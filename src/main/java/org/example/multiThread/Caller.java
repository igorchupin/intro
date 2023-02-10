package org.example.multiThread;

public class Caller {

    private CommonResource commonResource;

    public Caller(CommonResource commonResource) {
        this.commonResource = commonResource;
    }
    public void useCommonResource() {
        synchronized (commonResource) {
            commonResource.addOneToIntNonSynch();
        }
    }
}
