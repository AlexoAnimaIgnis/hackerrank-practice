package com.alexo.hackerrankalexo.prep.day1;

import java.util.List;

/**
 * Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
 * Print the decimal value of each fraction on a new line with  places after the decimal.
 *
 * Note: This challenge introduces precision problems. The test cases are scaled to six decimal places,
 * though answers with absolute error of up to  are acceptable.
 */
public class PlusMinus {

    public void plusMinus(List<Integer> arr) {
        double posCount = 0, negaCount = 0, zeroCount = 0;
        for(int i: arr) {
            if(i < 0 ) {
                negaCount++;
            } else if(i > 0 ) {
                posCount++;
            } else {
                zeroCount++;
            }
        }


        System.out.println(posCount/ arr.size());
        System.out.println(negaCount/ arr.size());
        System.out.println(zeroCount/ arr.size());
    }
}
