package com.alexo.hackerrankalexo.prep.day2;

import java.util.List;

public class UniqueNumber {

    public int uniqueInteger(List<Integer> a) {
        if(a.size() == 1) {
            return a.get(0);
        }

        int maxElement = Integer.MIN_VALUE;

        for(Integer t: a) {
            maxElement = Math.max(maxElement, t);
        }

        int ctr[] = new int[maxElement+1];

        for(int elem: a) {
            ctr[elem]++;
        }
        for(int i = 0; i < ctr.length; i++) {
            if(ctr[i] == 1) {
                return i;
            }
        }
        return 0;
    }

    public int uniqueIntegerXor(List<Integer> a) {
        //in
        int result = 0;
        for(Integer elem: a) {
            result ^= elem;
        }
        return result;
    }
}
