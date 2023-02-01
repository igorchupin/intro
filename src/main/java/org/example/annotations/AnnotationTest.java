package org.example.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class AnnotationTest {



    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        AnnotationUsage annotationUsage = new AnnotationUsage(3);
        AnnotationUsage annotationUsage2 = new AnnotationUsage(10);

        Field[] declaredFields = annotationUsage.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
            for (Annotation annotation : declaredAnnotations) {
                if (annotation.annotationType().equals(MyAnno.class)) {
                    MyAnno anno = field.getAnnotation(MyAnno.class);

                    if ((int) field.get(annotationUsage) < anno.from() || (int) field.get(annotationUsage) > anno.to()) {
                        annotationUsage.someClassInt = 100500;
                    }
                    System.out.println(annotationUsage.someClassInt);

                    if ((int) field.get(annotationUsage2) < anno.from() || (int) field.get(annotationUsage2) > anno.to()) {
                        annotationUsage2.someClassInt = 100500;
                    }
                    System.out.println(annotationUsage2.someClassInt);



                }
            }
        }


    }
}
