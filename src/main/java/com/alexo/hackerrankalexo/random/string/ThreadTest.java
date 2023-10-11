package com.alexo.hackerrankalexo.random.string;

public class ThreadTest {
    public int lengthOfLongestSubstring(String s) {
        return -1;
    }

    public static void main(String[] args) {
        int i = 010;
        int j = 07;
        System.out.println(i);
        System.out.println(j);

        int mask = 0x000F;
        int value = 0x2222;
        System.out.println(mask & value);

        SampleDemo a = new SampleDemo("A");
        SampleDemo b = new SampleDemo("B");

        b.start();
        a.start();

    }
}


class SampleDemo implements Runnable{

    private Thread t;
    private String threadname;

    SampleDemo(String threadname) {
        this.threadname = threadname;
    }

    @Override
    public void run() {
        while(true)
            System.out.print(threadname);
    }

    public void start() {
        if( t== null) {
            t = new Thread(this, threadname);
            t.start();
        }
    }
}