package com.multithreading.threadexample;

public class SecondThreadToYield implements Runnable {
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println("Second child thread!");
            Thread.yield();
        }
    }
}
