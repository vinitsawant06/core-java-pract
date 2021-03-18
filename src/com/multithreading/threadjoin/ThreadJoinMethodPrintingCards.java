package com.multithreading.threadjoin;


public class ThreadJoinMethodPrintingCards implements Runnable {
    public void run() {
        System.out.println("Cards printing started!");
        System.out.println("Cards has been printed!");
    }
}
