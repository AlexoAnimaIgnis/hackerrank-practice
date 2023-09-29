package com.alexo.hackerrankalexo.prep.day2;

import com.alexo.hackerrankalexo.prep.day2.UniqueString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueStringTest {

    private final UniqueString uniqueString = new UniqueString();

    @Test
    public void should_return_a() {
        assertEquals("a", uniqueString.solution("aba"));
    }

    @Test
    public void should_return_z() {
        assertEquals("z", uniqueString.solution("zz"));
    }

    @Test
    public void should_return_i() {
        assertEquals("i", uniqueString.solution("codility"));
    }
}