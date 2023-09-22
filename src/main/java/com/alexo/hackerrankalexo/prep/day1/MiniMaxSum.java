package com.alexo.hackerrankalexo.prep.day1;

import java.util.Arrays;
import java.util.List;

/**
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
 * Then print the respective minimum and maximum values as a single line of two space-separated long integers.
 *
 * Example
 *
 * The minimum sum is 16 and the maximum sum is 24
 */
public class MiniMaxSum {

    public List<Integer> solution(List<Integer> arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int totalSum = 0;

        for(int i : arr) {
            totalSum += i;
        }

        for(int i : arr) {
            int runningSum = totalSum - i;
            min = Math.min(runningSum, min);
            max = Math.max(runningSum, max);
        }

        return Arrays.asList(min, max);
    }
}
