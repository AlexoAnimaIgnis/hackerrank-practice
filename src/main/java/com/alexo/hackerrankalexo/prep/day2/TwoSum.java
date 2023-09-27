package com.alexo.hackerrankalexo.prep.day2;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    //return index;
    //O(n2)
    public int[] solution(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if(diff == arr[j]) {
                    return new int[] {
                            i, j
                    };
                }
            }
        }
        return null;
    }

    public int[] solutionOptimized(int[] arr, int target) {
        // store the number and the index
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];

            if(map.containsKey(diff)) {
                return new int[] {
                        map.get(diff), i
                };
            } else {
                // put the array element + corresponding index
                map.put(arr[i], i);
            }
        }
        return null;
    }
}
