package com.genezeiniss.javareflection.service;

import com.genezeiniss.javareflection.domain.Admirer;
import com.genezeiniss.javareflection.enums.AdmirerName;

public class Narcissus {

    public boolean rejectRomanticAdvance(Admirer admire) {
        return !AdmirerName.NARCISSUS.equals(admire.getName());
    }
}
