package org.example;

public class Generics {

    public static void main(String[] args) {
        Comparable<Integer> a = new Comparable<Integer>() {
            @Override
            public int compareTo(Integer o) {
                return 0;
            }
        };

        a.compareTo(1);
    }
}
