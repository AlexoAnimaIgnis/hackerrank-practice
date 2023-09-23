package com.alexo.hackerrankalexo.random;

public class AddDigits {

    public int solution(int i) {
        int sum = 0;

        while( i != 0) {
            sum += i % 10;
            i = i/10;
        }
        return sum;
    }
}
