package org.example.collections;

import java.util.*;

public class CollectionFramework {

    public static void main(String[] args) {
        Collection<Dog> dogCollection = new ArrayList<>();

        Dog dog = new Dog("Bobik");
        Dog dog1 = new Dog("Tyzik");
        dogCollection.add(dog);
        dogCollection.add(dog);
        System.out.println(dogCollection.size());
        dogCollection.remove(dog);
        System.out.println(dogCollection.size());
        System.out.println(dogCollection.contains(new Dog("Sharik")));



        System.out.println("************");
        List<Dog> dogList = new ArrayList<>();
        dogList.add(dog);
        dogList.add(dog1);
        dogList.get(0);


        System.out.println("************");
        Set<Dog> dogSet = new HashSet<>();
        dogSet.add(dog);
        System.out.println(dogSet.add(dog));
        System.out.println(dogSet.size());


        System.out.println("************");
        Queue<Dog> dogQueue = new ArrayDeque<>();
        dogQueue.add(dog);
        dogQueue.add(dog1);

        System.out.println(dogQueue.poll().name);
        System.out.println(dogQueue.poll().name);
//        System.out.println(dogQueue.element().name);

        Deque<Dog> dogDeque = new ArrayDeque<>();
        dogDeque.add(dog);
        dogDeque.add(dog1);

        System.out.println(dogDeque.pollLast().name);
        System.out.println(dogDeque.getLast().name);



    }
}
