package com.genezeiniss.javareflection.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class ClassInfoService {

    public static void printClassInfo(Class<?> clazz) {

        System.out.printf("class name: %s%n", clazz.getSimpleName());

        System.out.printf("class package name: %s%n",
                Optional.ofNullable(clazz.getPackage()).map(Package::getName).orElse("no name"));

        System.out.printf("class superclass: %s%n", clazz.getSuperclass());

        for (Class<?> implementedInterface : clazz.getInterfaces()) {
            System.out.printf("class %s implements %s%n",
                    clazz.getSimpleName(),
                    implementedInterface.getSimpleName());
        }

        System.out.printf("is array: %s%n", clazz.isArray());
        System.out.printf("is primitive: %s%n", clazz.isPrimitive());
        System.out.printf("is enum: %s%n", clazz.isEnum());
        System.out.printf("is interface: %s%n", clazz.isInterface());
        System.out.printf("is anonymous: %s%n", clazz.isAnonymousClass());
    }

    public static void getAllInheritedClassNames(Class<?> inputClass) {

        String[] inheritedClasses;

        if (inputClass.isInterface()) {
            Class<?> inheritedClass = inputClass.getSuperclass();
            inheritedClasses = inheritedClass != null ?
                    new String[]{inputClass.getSuperclass().getSimpleName()} : null;
        } else {
            inheritedClasses = Arrays.stream(inputClass.getInterfaces())
                    .map(Class::getSimpleName)
                    .toArray(String[]::new);
        }

        Arrays.stream(inheritedClasses).forEach(System.out::println);
    }
}
