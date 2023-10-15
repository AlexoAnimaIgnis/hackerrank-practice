package com.alexo.hackerrankalexo.random.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.isEmpty()) {
            return 0;
        }

        int left = 0;
        Set<Character> charSet = new HashSet<>();
        int maximumLength = 0;


        for(int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);

            // handle the duplicates
            while(charSet.contains(current)) {
                charSet.remove(s.charAt(left));
                left++;
            }

            charSet.add(current);
            maximumLength = Math.max(maximumLength, right - left + 1);
        }
        return maximumLength;
    }
}
