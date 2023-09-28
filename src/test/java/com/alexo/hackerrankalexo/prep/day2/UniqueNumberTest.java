package com.alexo.hackerrankalexo.prep.day2;

import com.alexo.hackerrankalexo.prep.day2.UniqueNumber;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UniqueNumberTest {
    private final UniqueNumber uniqueNumber = new UniqueNumber();

    @Test
    public void should_return_1() {
        List<Integer> roster = List.of(1);
//        assertEquals(1,uniqueNumber.uniqueInteger(roster));
        assertEquals(1,uniqueNumber.uniqueIntegerXor(roster));
    }

    @Test
    public void should_return_2() {
        List<Integer> roster = List.of(1,1,2);
//        assertEquals(2, uniqueNumber.uniqueInteger(roster));
        assertEquals(2, uniqueNumber.uniqueIntegerXor(roster));

    }

    @Test
    public void should_return_another2() {
        List<Integer> roster = List.of(0, 0, 1, 2, 1);
//        assertEquals(2, uniqueNumber.uniqueInteger(roster));
        assertEquals(2, uniqueNumber.uniqueIntegerXor(roster));
    }

}