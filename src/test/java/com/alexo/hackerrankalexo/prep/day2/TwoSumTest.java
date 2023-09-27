package com.alexo.hackerrankalexo.prep.day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    private TwoSum arrayTwoSum =  new TwoSum();

    // [ 1, 3, 7, 9 , 2], target = 11, [3,4]
    @Test
    public void testWithAnswer() {
        int[] nums = {1, 3, 7, 9, 2};
        int[] ans = {3, 4};
        int target = 11;

        assertArrayEquals(ans, arrayTwoSum.solution(nums, target));
        assertArrayEquals(ans, arrayTwoSum.solutionOptimized(nums, target));
    }

    // [ 1, 3, 7, 9 , 2], target = 25, null
    @Test
    public void testWithNoPair() {
        int[] nums = {1, 3, 7, 9, 2};
        int target = 25;

        assertArrayEquals(null, arrayTwoSum.solution(nums, target));
        assertArrayEquals(null, arrayTwoSum.solutionOptimized(nums, target));
    }

    // [], target = 11, null
    @Test
    public void testWithEmptyArr() {
        int[] nums = {};
        int target = 25;

        assertArrayEquals(null, arrayTwoSum.solution(nums, target));
        assertArrayEquals(null, arrayTwoSum.solutionOptimized(nums, target));
    }

    // [1], target = 11, null
    @Test
    public void testWithOneElement() {
        int[] nums = {1};
        int target = 25;

        assertArrayEquals(null, arrayTwoSum.solution(nums, target));
        assertArrayEquals(null, arrayTwoSum.solutionOptimized(nums, target));
    }

    // [ 1, 3, 7, 9 , 2], target = 11, [3,4]
    @Test
    public void testWithTwoElement() {
        int[] nums = {1, 4};
        int target = 5;

        assertArrayEquals(new int[]{0, 1}, arrayTwoSum.solution(nums, target));
        assertArrayEquals(new int[]{0, 1}, arrayTwoSum.solutionOptimized(nums, target));
    }

}