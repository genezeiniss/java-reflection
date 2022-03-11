package com.genezeiniss.javareflection.obtain_class_object;

import com.genezeiniss.javareflection.obtain_class_object.example.CustomObject;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ObjectInstant {

    public void obtainClassObject() {

        String stringObject = "instantiated string";
        CustomObject customObject = new CustomObject();
        Map<String, String> map = new HashMap<>();

        // get class of object instance

        Class<? extends String> stringClass = stringObject.getClass();
        Class<? extends CustomObject> customObjectClass = customObject.getClass();
        Class<?> mapClass = map.getClass();
    }
}

