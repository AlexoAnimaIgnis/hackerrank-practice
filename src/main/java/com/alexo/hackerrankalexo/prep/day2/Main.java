package com.alexo.hackerrankalexo.prep.day2;

import java.util.*;

class Main {

    static void targetSumUsingMap(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int n : arr) {
            int diff = target - n;

            if (map.containsKey(diff)) {
                System.out.println(diff + " ," + n);
            }

            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        System.out.println();

    }

    static void targetSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            int diff = target - num;

            if (map.containsKey(diff)) { // found a pair
                System.out.println("(" + diff + ", " + num + ")");
                count++;
            }

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("Total Pairs with sum " + target + " are: " + count);
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1};
        int target = 6;
        targetSumUsingMap(arr, target);
        targetSum(arr, target);

    }
}

