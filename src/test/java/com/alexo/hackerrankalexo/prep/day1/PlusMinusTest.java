package com.alexo.hackerrankalexo.prep.day1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PlusMinusTest {
    private final PlusMinus plusMinus = new PlusMinus();

    @Test
    void plusMinus_1() {
        plusMinus.plusMinus(Arrays.asList(-4, 3, -9, 0, 4, 1));
    }

    @Test
    void plusMinus_2() {
        plusMinus.plusMinus(Arrays.asList(1, 2, 3, -1, -2, -3, 0, 0));
    }



    @Test
    void plusMinus_3() {
        plusMinus.plusMinus(Arrays.asList(1,1,0,-1,-1));
    }
}