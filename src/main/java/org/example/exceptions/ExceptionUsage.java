package org.example.exceptions;

import org.example.Cat;
import org.example.Dog;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.stream.Stream;

public class ExceptionUsage {

    public static void main(String[] args){
        Dog dog = new Dog();
        Cat cat = new Cat();

        FileExecutor fileExecutor = new FileExecutor();
//
//        fileExecutor.doSmth(dog);
//        fileExecutor.doSmth(dog);
//        fileExecutor.doSmth(cat);

//        int a = 4, b = 0;
//        try {
//            try {
//
//                System.out.println(a / b);
//
//            } catch (ArithmeticException e) {
//                System.out.println("Null");
//                throw new NullPointerException();
//            }
//        } catch (NullPointerException e) {
//            System.out.println(e.getLocalizedMessage());
//        }

//        Stream<Integer> integerStream = Stream.of(1);
//        try (ByteArrayInputStream inputStream = new ByteArrayInputStream(new byte[1])) {
//            fileExecutor.doSmth(cat);
//            integerStream.count();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            integerStream.count();
//        }

        try {
            throw new MyException();
        } catch (MyException e) {
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println("*********");
        System.out.println("*********");
        System.out.println("*********");
    }
}
