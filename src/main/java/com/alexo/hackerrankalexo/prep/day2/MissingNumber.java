package com.alexo.hackerrankalexo.prep.day2;

public class MissingNumber {

    public int findMissingNumber(int[] arr) {
        int newLen = arr.length + 1; // for the missing number
        boolean[] frequency = new boolean[newLen + 1]; // to account for 0;

        // traverse the input array and update the frequency
        for(int i: arr) {
            frequency[i] = true;
        }

        // traverse frequency to check if missing. range starts from [1,n]
        for(int i = 1; i < frequency.length; i++) {
            if(!frequency[i]) {
                return i;
            }
        }
        return -1; // This should never happen if there's always one missing number
    }

    public int findMissingNumberXor(int[] arr) {
        int completeXor = 0;
        for(int i = 1; i <= arr.length + 1; i++) {
            completeXor ^= i;
        }

        int currentXor = 0;
        for(int i: arr) {
            currentXor ^= i;
        }
        return completeXor ^ currentXor;
    }


    public int findMissingNumberFormula(int[] arr) {
        int n = arr.length;
        int total = (n+1) * (n+2) /2;
        int currentSum = 0;

        for(int i: arr) {
            currentSum += i;
        }
        return total - currentSum;
    }

}
