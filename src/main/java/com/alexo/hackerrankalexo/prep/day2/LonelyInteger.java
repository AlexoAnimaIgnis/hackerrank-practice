package com.alexo.hackerrankalexo.prep.day2;

import java.util.*;

public class LonelyInteger {


    // using arr only?
    public int solution3(List<Integer> arr) {
        int result = 0;
        // create an array that will store frequency
        // but creating an array, we need to determine the size.
        // we can get it by determining the highest value in the array
        int max = Integer.MIN_VALUE;
        for(int i : arr) {
            max = Math.max(max, i);
        }
        // once we have it we can then create the array
        int[] counts = new int[max+1]; // plus 1 to account for 0
        for(int i : arr) {
            //increment the corresponding index
            counts[i]++;
        }

        for(int i = 0; i <counts.length; i++) {
            if(counts[i] == 1) {
                return i;
            }
        }
        return result;
    }

    // using XOR
    public int solution2(List<Integer> arr) {
        int result = 0;
        for(int i: arr) {
            result ^= i;
        }
        return result;
    }

    public int solution(List<Integer> arr) {
        Map<Integer, Integer> mapCount = new HashMap<>();
        for(int i: arr) {
            mapCount.put(i, mapCount.getOrDefault(i, 0)+1);
        }
        for(int i : mapCount.keySet()) {
            if(mapCount.get(i) == 1) {
                return i;
            }
        }
        return -1;
    }
}
