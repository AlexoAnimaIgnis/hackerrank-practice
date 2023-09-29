package com.alexo.hackerrankalexo.prep.day2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *  you are given a string s, in which one letter occurs twice, every other letter occurs at most once.
 *
 * write a function which given a string S, returns a single character string: the letter that occurs twice
 *
 */
public class UniqueString {

    public String solution(String s) {

        //return usingMap(s);
        //return usingSet(s);
        return usingArray(s);
    }

    public String usingArray(String s) {
        int[] alphabet = new int[26];

        for(Character c: s.toCharArray()) {
            int index = c - 'a';
            System.out.print(index);
            alphabet[index]++;
        }

        for(int i = 0; i < 26; i++) {
            if(alphabet[i] == 2) {
                char duplicate = (char) (i + 'a');
                return String.valueOf(duplicate);
            }
        }
        return null;
    }

    private String usingMap(String s) {
        Map<Character, Integer> charMap = new HashMap<>();

        for(Character c: s.toCharArray()) {
            if(charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c)+1);
            } else {
                charMap.put(c,1);
            }
        }

        for(Character c: charMap.keySet()) {
            if(charMap.get(c) == 2) {
                return c+"";
            }
        }
        return "";
    }

    private String usingSet(String s) {
        Set<Character> charSet = new HashSet<>();

        for(Character ch: s.toCharArray()) {
            if(charSet.contains(ch)) {
                return ch.toString();
            }

            charSet.add(ch);
        }

        return "";
    }
}
