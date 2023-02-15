package org.example.newJava8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
//        SomeInterface someInterface = new SomeInterface() {
//            @Override
//            public void doNothing() {
//
//            }
//
//            @Override
//            public void doSomething() {
//                System.out.println("Some text");
//            }
//        };
//
//        someInterface.doSomething();

//        Consumer<String> consumer = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        };
//
//        consumer.accept("My consumer");
//
//        Supplier<Integer> supplier = new Supplier<Integer>() {
//            @Override
//            public Integer get() {
//                return RandomGenerator.getDefault().nextInt();
//            }
//        };
//
//        System.out.println(supplier.get());


//        Predicate<String> predicate = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.length() > 3;
//            }
//        };
//
//        System.out.println(predicate.test("12345"));
//
//        Function<String, Integer> function = new Function<>() {
//            @Override
//            public Integer apply(String s) {
//                return s.length();
//            }
//        };
//
//        System.out.println(function.apply("Length"));
//
//        BiFunction<Integer, Integer, Boolean> biFunction = (integer, integer2) -> integer + integer2 > 10;
//
//        System.out.println(biFunction.apply(2,5));


        List<String> strings = new ArrayList<>() {{
            add("ABCD");
            add("A");
            add("B");
            add("B");
            add("B");
            add("C");
        }};
//
//        System.out.println(strings.stream().count());
//
//        System.out.println(strings.stream().filter(string -> string.equals("A")).count());
//
//        System.out.println(strings.stream().map(string -> string.length()).findFirst().get());
//
//        TestClass testClass = new TestClass();
//
//        List<TestClass> testClasses = new ArrayList<>() {{
//            add(testClass);
//            add(testClass);
//            add(testClass);
//        }};
//
//        List<String> collect = testClasses.stream().flatMap(list -> list.stringList.stream()).collect(Collectors.toList());
//        System.out.println(collect);
//
//
//        System.out.println(strings.stream().distinct().collect(Collectors.toList()).size());
//
//
        System.out.println(strings.stream().reduce((str1, str2) -> {
            System.out.println();
            return str1 + str2;
        }).get());
//        System.out.println(strings.stream().reduce("12", (str1, str2) -> str1 + str2));
//
//
//        Stream.of(1,2,3);


    }
}
