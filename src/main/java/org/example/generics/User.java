package org.example.generics;

public class User {

    void doSmth(GenericClass<? extends Number> param) {
        System.out.println(param.getObject());
    }

    void doSmthElse(GenericClass<? super Number> param) {
        System.out.println(param.getObject());
    }

}
