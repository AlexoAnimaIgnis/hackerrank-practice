package com.alexo.hackerrankalexo.random.datastructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackJavaTest {
    private final StackJava stackJava = new StackJava();

    @Test
    void solution_1() {
        assertTrue(stackJava.solution("{}()"));
    }


    @Test
    void solution_2() {
        assertTrue(stackJava.solution("({()})"));
    }


    @Test
    void solution_3() {
        assertFalse(stackJava.solution("{}("));
    }


    @Test
    void solution_4() {
        assertTrue(stackJava.solution("[]"));
    }

    @Test
    void solution_5() {
        assertTrue(stackJava.solution("[({})(())]"));
    }

    @Test
    void solution_6() {
        assertFalse(stackJava.solution("(({()})))[["));
    }
}