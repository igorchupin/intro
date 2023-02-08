package org.example.collections;

import java.util.*;
import java.util.function.Consumer;

public class CollectionFramework {

    public static void main(String[] args) {
        Collection<Dog> dogCollection = new ArrayList<>();
//
//        Dog[] dogs = new Dog[3];
//        dogs[0] = new Dog("Bobik");
//        dogs[1] = new Dog("Bobik");
//        dogs[2] = new Dog("Bobik");
//        dogs[3] = new Dog("Bobik");
//
        Dog dog = new Dog("Bobik");
        Dog dog1 = new Dog("Tyzik");
//        dogCollection.add(dog);
//        dogCollection.add(dog);
//        System.out.println(dogCollection.size());
//        dogCollection.remove(dog);
//        System.out.println(dogCollection.size());
//        System.out.println(dogCollection.contains(new Dog("Sharik")));
//
//
//
//        System.out.println("************");
//        List<Dog> dogList = new ArrayList<>();
//        dogList.add(dog);
//        dogList.add(dog1);
//        dogList.get(0);
//
//        System.out.println("************");
//        Set<Dog> dogSet = new HashSet<>();
//        dogSet.add(dog);
//        System.out.println(dogSet.add(dog));
//        System.out.println(dogSet.size());
//
//
//        System.out.println("************");
//        Queue<Dog> dogQueue = new ArrayDeque<>();
//        dogQueue.add(dog);
//        dogQueue.add(dog1);

//        System.out.println(dogQueue.poll().name);
//        System.out.println(dogQueue.poll().name);
//        System.out.println(dogQueue.element().name);
//
//        Deque<Dog> dogDeque = new ArrayDeque<>();
//        dogDeque.add(dog);
//        dogDeque.add(dog1);
//
//        System.out.println(dogDeque.pollLast().name);
//        System.out.println(dogDeque.getLast().name);


//
//        ArrayList<String> strings = new ArrayList<>();
//
//        strings.add("");
//        strings.add("");
//        strings.add(0,":");
//        System.out.println(strings.size());
//        strings.trimToSize();
//        System.out.println(strings.size());
//        strings.add(1, "");
//
//        LinkedList<String> stringLinkedList= new LinkedList<>();
//
//        stringLinkedList.add(0, "0");
//        stringLinkedList.add(1, "1");
//        stringLinkedList.add(2, "2");
//        stringLinkedList.add(1, "3");
//        System.out.println(stringLinkedList);
//        System.out.println(stringLinkedList);
//
//
//        HashSet<Dog> stringHashSet = new HashSet<>();
//        LinkedHashSet<String> strings1 = new LinkedHashSet<>();
//
//        stringHashSet.add(dog1);
//        stringHashSet.add(dog);
//
//
//        System.out.println(dog1);
//
//        TreeSet<Integer> integerTreeSet = new TreeSet<>();
//
//        integerTreeSet.add(2);
//        integerTreeSet.add(1);
//        integerTreeSet.add(3);
//
        Comparator<Dog> comparator = new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return 1;
            }
        };
//
//
//        TreeSet<Dog> dogTreeSet = new TreeSet<>(comparator);
//        dogTreeSet.add(dog1);
//        dogTreeSet.add(dog);
//        dogTreeSet.add(new Dog("Barbos"));
//
//        System.out.println(dogTreeSet);
//
//        Iterator<Dog> iterator = dogTreeSet.iterator();
//
//        while (iterator.hasNext()) {
//            iterator.next();
//            iterator.remove();
//            System.out.println(dogTreeSet.size());
//        }
//
//        iterator = dogTreeSet.iterator();
//
//        iterator.next();
//        iterator.next();
//
//        Consumer<Dog> dogConsumer = new Consumer<Dog>() {
//            @Override
//            public void accept(Dog dog) {
//                System.out.println(dog.getName());
//            }
//        };
//
//        iterator.forEachRemaining(dogConsumer);

//        for (Dog dogFromCollection : dogTreeSet) {
//            System.out.println(dogFromCollection.getName());
//        }
//
//        Map<String, Integer> map = new HashMap<>();
//        map.put("One", 1);
//        map.put("Two", 2);
//        map.put("Three", 3);
//        System.out.println(map);
//
//        map.forEach((k, v) -> {
//
//        });
//
//        Set<String> strings1 = map.keySet();
//        System.out.println(strings1);
//
//        Set<Map.Entry<String, Integer>> entries = map.entrySet();
//        entries.forEach(node -> {
//            System.out.println(node.getKey());
//        });
        Map<String, String> map;
    }

}
