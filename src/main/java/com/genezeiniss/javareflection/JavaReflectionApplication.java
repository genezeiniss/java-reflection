package com.genezeiniss.javareflection;

import com.genezeiniss.javareflection.enums.Color;
import com.genezeiniss.javareflection.obtain_class_object.LookupByClasspath;
import lombok.SneakyThrows;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class JavaReflectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaReflectionApplication.class, args);
    }

}
