package com.alexo.hackerrankalexo.random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddDigitsTest {

    private final AddDigits addDigits = new AddDigits();

    @Test
    public void shouldReturn3() {
        assertEquals(3, addDigits.solution(12));
    }

    @Test
    public void shouldReturn1() {
        assertEquals(1, addDigits.solution(1));
    }

    @Test
    public void shouldReturn15() {
        assertEquals(15, addDigits.solution(12345));
    }
}