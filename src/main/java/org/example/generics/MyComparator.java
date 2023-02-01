package org.example.generics;

public class MyComparator {

    public <T extends Comparable<T> , V extends T> boolean isIn(T x, V[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(x == arr[i]) {
                return true;
            }
        }
        return false;
    }
}
