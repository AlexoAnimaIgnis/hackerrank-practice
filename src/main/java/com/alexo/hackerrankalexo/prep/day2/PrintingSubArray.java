package com.alexo.hackerrankalexo.prep.day2;

public class PrintingSubArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        //bruteForce(arr);
        recursion(arr, 0);
    }

    private static void  recursion(int[] arr, int currentIndex) {
        // base case is we are at the last index
        if(currentIndex == arr.length) {
            return;
        }

        StringBuilder result = new StringBuilder();
        for(int i = currentIndex; i < arr.length; i++) {
            result.append(" ").append(arr[i]).append(" ");
            System.out.println("[" + result + "]");
        }
        recursion(arr, currentIndex +1);
    }

    // brute force sub array
    private static void  bruteForce(int[] arr) {

        // steps:
        //1. loop for the starting point
        for(int start = 0; start < arr.length; start++) {
            // 2. loop for the groupings
            for(int grp = start; grp <= arr.length; grp++) {
                // 3. inner loop will actually do the printing
                for(int j = start; j < grp; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }
    }
}
