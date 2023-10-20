package com.alexo.hackerrankalexo.prep.day2;

import java.util.Arrays;

public class ThreeSum {

    public static int[] threeSum(int[] arr, int targetSum) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int runningSum = arr[i] + arr[left] + arr[right];

                if (targetSum == runningSum) {
                    return new int[]{
                            arr[i], arr[left], arr[right]
                    };
                } else if (runningSum < targetSum) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return null;
    }
}
