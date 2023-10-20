package com.alexo.hackerrankalexo.prep.day2;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    //return index;
    //O(n2)
    public int[] solution(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            for(int j = i + 1; j < arr.length; j++) {
                if(diff == arr[j]) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

    /**
     * int[] nums = {1, 3, 7, 9, 2};
     * int[] ans = {3, 4};
     * int target = 11;
     *
     * @param arr
     * @param target
     * @return
     */
    public int[] solutionOptimized(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];

            if(map.containsKey(diff)) {
                return new int[] {
                        map.get(diff), i // returns the index of the two
                };
            } else {
                // add the ELEMENT as key, and the INDEX as the value
                map.put(arr[i], i);
            }
        }
        return null;
    }
}
