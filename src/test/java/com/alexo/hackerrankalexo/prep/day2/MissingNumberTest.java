package com.alexo.hackerrankalexo.prep.day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingNumberTest {
    private final MissingNumber missingNumber = new MissingNumber();

    @Test
    public void shouldReturn_3() {
        assertEquals(3, missingNumber.findMissingNumber(new int[]{1, 2, 4, 5}));
        assertEquals(3, missingNumber.findMissingNumberXor(new int[]{1, 2, 4, 5}));
        assertEquals(3, missingNumber.findMissingNumberFormula(new int[]{1, 2, 4, 5}));
    }

    @Test
    public void shouldReturn3() {
        assertEquals(3, missingNumber.findMissingNumber(new int[]{2, 1, 4, 6, 5}));
        assertEquals(3, missingNumber.findMissingNumberXor(new int[]{2, 1, 4, 6, 5}));
        assertEquals(3, missingNumber.findMissingNumberFormula(new int[]{2, 1, 4, 6, 5}));
    }

    @Test
    public void shouldReturn5() {
        assertEquals(5, missingNumber.findMissingNumber(new int[]{1, 2, 3, 4}));
        assertEquals(5, missingNumber.findMissingNumberXor(new int[]{1, 2, 3, 4}));
        assertEquals(5, missingNumber.findMissingNumberFormula(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void shouldReturn2() {
        assertEquals(2, missingNumber.findMissingNumber(new int[]{1}));
        assertEquals(2, missingNumber.findMissingNumberXor(new int[]{1}));
        assertEquals(2, missingNumber.findMissingNumberFormula(new int[]{1}));
    }
}