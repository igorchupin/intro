package org.example.generics;

import org.example.Dog;
import org.example.generics.model.Animal;
import org.example.generics.model.Labrador;

import java.util.ArrayList;
import java.util.Collection;

public class Launcher {

    public static void main(String[] args) {
        GenericClass<Number> stringGenericClass = new GenericClass<>(2.5d);
//        GenericClass<Integer> intGenericClass = new GenericClass<>(5);
//
//        System.out.println(stringGenericClass.getObject());
//        System.out.println(intGenericClass.getObject());
//
//
//        User user = new User();
        Labrador labrador = new Labrador();
//        Animal animal = new Animal();
//        GenericClass<Labrador> labradorGenericClass = new GenericClass<>(labrador);
//        GenericClass<Animal> animalGenericClass = new GenericClass<>(animal);
//        user.doSmth(labradorGenericClass);
//        user.doSmthElse(animalGenericClass);

        Labrador labrador2 = new Labrador();
        MyComparator comparator = new MyComparator();
        Labrador[] dogs = new Labrador[1] ;
        dogs[0] = new Labrador();

        Labrador[] dogs1 = new Labrador[2];
        dogs1[0] = dogs[0];


        dogs[1] = new Labrador();

        System.out.println(comparator.isIn(labrador, dogs));
        System.out.println(comparator.isIn(labrador2, dogs));
    }
}
