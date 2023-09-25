package com.alexo.hackerrankalexo.prep.day2;

public class MissingNumber {
    public int findMissingNumber(int[] A) {
        int xor1 = 0;

        // 1, 2, 4, 5
        for (int i = 1; i <= A.length + 1; i++) {
            xor1 = xor1 ^ i;

        }

        int xor2 = 0;
        for (int elem : A) {
            xor2 = xor2 ^ elem;
        }

        return xor1 ^ xor2;
    }

}
