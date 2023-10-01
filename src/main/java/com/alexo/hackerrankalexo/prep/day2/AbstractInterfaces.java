package com.alexo.hackerrankalexo.prep.day2;

public class AbstractInterfaces {

    public static void main(String[] args) {

    }

}

abstract class AbsDemo {
    int test = 0;
    int value;

    abstract void demo() ;
}

interface InterDemo {

    int test = 0; // allowed
    // int value;  // not allowed

    void printName();

    // methods are not allowed to have a body
//    void printName(){
//
//    }
}