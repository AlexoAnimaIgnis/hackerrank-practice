package com.alexo.hackerrankalexo.prep.day1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MiniMaxSumTest {

    private final MiniMaxSum miniMaxSum = new MiniMaxSum();

    @Test
    void solution_1() {
        assertEquals(Arrays.asList(16, 24),
                miniMaxSum.solution(Arrays.asList(1, 3, 5, 7, 9)));
    }

    @Test
    void solution_2() {
        assertEquals(Arrays.asList(10, 14),
                miniMaxSum.solution(Arrays.asList(1, 2, 3, 4, 5)));
    }
}