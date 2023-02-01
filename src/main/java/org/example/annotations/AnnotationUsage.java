package org.example.annotations;

public class AnnotationUsage {

    String someClassString = "asd";
    @MyAnno(to = 4)
    int someClassInt;

    public AnnotationUsage(int someClassInt) {
        if (someClassInt < 1 || someClassInt > 4) {
            someClassInt = 100500;
        }
        this.someClassInt = someClassInt;
    }

}
