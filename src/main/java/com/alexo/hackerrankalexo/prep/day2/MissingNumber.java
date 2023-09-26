package com.alexo.hackerrankalexo.prep.day2;

public class MissingNumber {
//    public int findMissingNumber(int[] A) {
//        int xor1 = 0;
//
//        // 1, 2, 4, 5
//        for (int i = 1; i <= A.length + 1; i++) {
//            xor1 = xor1 ^ i;
//
//        }
//
//        int xor2 = 0;
//        for (int elem : A) {
//            xor2 = xor2 ^ elem;
//        }
//
//        return xor1 ^ xor2;
//    }

//    public int findMissingNumber(int[] arr) {
//        int n = arr.length;
//        int total = (n + 1) * (n+2) / 2; // Sum of n natural numbers formula.
//
//        int sum = 0;
//        for (int num : arr) {
//            sum += num;
//        }
//
//        return total - sum;
//    }

    public int findMissingNumber(int[] arr) {
        int n = arr.length + 1; // As one number is missing in the range [1, n], so we add 1.
        boolean[] isPresent = new boolean[n + 1]; // +1 to accommodate the number n.

        for (int num : arr) {
            isPresent[num] = true;
        }

        for (int i = 1; i <= n; i++) { // Starting from 1 as the range is [1, n].
            if (!isPresent[i])
                return i;
        }

        return -1; // This should never happen if there's always one missing number
    }

}
