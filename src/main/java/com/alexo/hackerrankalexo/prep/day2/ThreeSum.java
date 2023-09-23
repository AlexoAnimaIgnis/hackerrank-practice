package com.alexo.hackerrankalexo.prep.day2;

import java.util.Arrays;

public class ThreeSum {

    public static void main(String[] args) {
        int[] arr = {12, 2, 18, 23, 11, 10, 22, 56, 110, 78};  // Given array
        int targetSum = 30;  // Target sum to find
        Arrays.sort(arr);  // Sort the array first

        // Loop through each element in the sorted array
        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;  // Initialize left pointer
            int right = arr.length - 1;  // Initialize right pointer

            while (left < right) {
                int currentSum = arr[i] + arr[left] + arr[right];

                if (currentSum == targetSum) {
                    System.out.println("Answer is: " + arr[i] + ", " + arr[left] + ", " + arr[right]);
                    break;  // Exit the loop if the target sum is found
                } else if (currentSum < targetSum) {
                    left++;  // Move the left pointer to the right
                } else {
                    right--;  // Move the right pointer to the left
                }
            }
        }
    }
}
