package com.alexo.hackerrankalexo.prep.day2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LonelyIntegerTest {
    private final LonelyInteger lonelyInteger = new LonelyInteger();

    @Test
    void solution_1() {
        assertEquals(4, lonelyInteger.solution(List.of(1, 2, 3, 4, 3, 2, 1)));
        assertEquals(4, lonelyInteger.solution2(List.of(1, 2, 3, 4, 3, 2, 1)));
        assertEquals(4, lonelyInteger.solution3(List.of(1, 2, 3, 4, 3, 2, 1)));
    }

    @Test
    void solution_2() {
        assertEquals(1, lonelyInteger.solution(List.of(1)));
        assertEquals(1, lonelyInteger.solution2(List.of(1)));
        assertEquals(1, lonelyInteger.solution3(List.of(1)));
    }


    @Test
    void solution_3() {
        assertEquals(2, lonelyInteger.solution(List.of(1, 1, 2)));
        assertEquals(2, lonelyInteger.solution2(List.of(1, 1, 2)));
        assertEquals(2, lonelyInteger.solution3(List.of(1, 1, 2)));
    }


    @Test
    void solution_4() {
        assertEquals(2, lonelyInteger.solution(List.of(0, 0, 1, 2, 1)));
        assertEquals(2, lonelyInteger.solution2(List.of(0, 0, 1, 2, 1)));
        assertEquals(2, lonelyInteger.solution3(List.of(0, 0, 1, 2, 1)));
    }

}