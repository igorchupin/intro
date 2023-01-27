package org.example.generics;

public class GenericClass<Type> {

    Type object;

    public GenericClass(Type object) {
        this.object = object;
    }

    public Type getObject() {
        return object;
    }
}
