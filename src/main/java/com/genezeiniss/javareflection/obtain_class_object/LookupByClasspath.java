package com.genezeiniss.javareflection.obtain_class_object;

import org.springframework.stereotype.Component;

@Component
public class LookupByClasspath {

    public static void obtainClassObject() throws ClassNotFoundException {

        Class<?> stringClass = Class.forName("java.lang.String");
        Class<?> customObjectClass = Class.forName("com.genezeiniss.javareflection.obtain_class_object.example.CustomObject");
        Class<?> innerCustomObjectClass = Class.forName("com.genezeiniss.javareflection.obtain_class_object.example.CustomObject$InnerCustomObject");
    }
}
