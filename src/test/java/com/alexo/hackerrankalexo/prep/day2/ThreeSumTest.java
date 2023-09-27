package com.alexo.hackerrankalexo.prep.day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

    @Test
    void threeSum() {
        int[] arr = {12, 2, 18, 23, 11, 10, 22, 56, 110, 78};  // Given array
        int targetSum = 30;  // Target sum to find

        assertArrayEquals(new int[]{2, 10, 18}, ThreeSum.threeSum(arr, targetSum));
    }
}