package com.alexo.hackerrankalexo.random;

public class FizzBuzz {

    public static void main(String[] args) {
        fizzBuzzSolution(40);
    }

    public static void fizzBuzzSolution(int limit) {
        for(int i = 1; i <= limit; i++) {
            if((i % 5 == 0) && (i % 7 == 0)){
                System.out.println("fizzbuz");
            } else if(i % 5 == 0) {
                System.out.println("fizz");
            } else if(i % 7 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }

        }
    }
}
