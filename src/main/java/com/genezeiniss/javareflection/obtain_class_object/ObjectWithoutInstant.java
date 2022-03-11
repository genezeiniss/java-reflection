package com.genezeiniss.javareflection.obtain_class_object;

import com.genezeiniss.javareflection.obtain_class_object.example.CustomObject;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class ObjectWithoutInstant {

    public void obtainClassObject() {
        Class<String> stringClass = String.class;
        Class<CustomObject> customObjectClass = CustomObject.class;
        Class<?> mapClass = HashMap.class;

        Class<Boolean> booleanClass = boolean.class;
        Class<Integer> intClass = int.class;
        Class<Double> doubleClass = double.class;
    }
}
