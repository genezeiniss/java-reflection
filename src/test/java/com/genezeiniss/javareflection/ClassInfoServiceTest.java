package com.genezeiniss.javareflection;

import com.genezeiniss.javareflection.domain.Echo;
import com.genezeiniss.javareflection.domain.NarcissusAdmirer;
import com.genezeiniss.javareflection.enums.AdmirerName;
import com.genezeiniss.javareflection.service.ClassInfoService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Collection;

public class ClassInfoServiceTest {

    @ParameterizedTest(name = "print class info")
    @ValueSource(classes = {
            Echo.class,
            NarcissusAdmirer.class,
            AdmirerName.class,
            boolean.class,
            Collection.class,
            int[][].class})
    public void testPrintClassInfo(Class<?> clazz) {
        ClassInfoService.printClassInfo(clazz);
    }

    @Test
    public void testPrintAnonymousClassInfo() {
        Object anonymousAdmirer = new NarcissusAdmirer() {
            @Override
            public String destiny() {
                return "Live happily ever after.";
            }
        };
        ClassInfoService.printClassInfo(anonymousAdmirer.getClass());
    }
}
