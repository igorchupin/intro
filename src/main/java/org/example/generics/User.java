package org.example.generics;

import org.example.generics.model.Dog;

public class User {

    void doSmth(GenericClass<? extends Dog> param) {
        System.out.println(param.getObject());
    }

    void doSmthElse(GenericClass<? super Dog> param) {
        System.out.println(param.getObject());
    }

}
