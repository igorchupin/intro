package org.example.generics;

import org.example.Dog;

public class Launcher {

    public static void main(String[] args) {
        GenericClass<String> stringGenericClass = new GenericClass<>("String");
        GenericClass<Integer> intGenericClass = new GenericClass<>(5);

        System.out.println(stringGenericClass.getObject());
        System.out.println(intGenericClass.getObject());


        User user = new User();
        user.doSmth(new GenericClass<>(5));
        user.doSmthElse(new GenericClass<>(new Dog()));
    }
}
