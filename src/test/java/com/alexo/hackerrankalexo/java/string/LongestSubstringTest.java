package com.alexo.hackerrankalexo.java.string;

import com.alexo.hackerrankalexo.random.string.LongestSubstring;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringTest {
    private final LongestSubstring lsb = new LongestSubstring();

    @Test
    public void should_return_3() {
        assertEquals(3, lsb.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void should_return_1() {
        assertEquals(1, lsb.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void should_return_another_3() {
        assertEquals(3, lsb.lengthOfLongestSubstring("pwwkew"));
    }

}