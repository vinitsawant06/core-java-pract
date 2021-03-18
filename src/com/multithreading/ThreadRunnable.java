package com.multithreading;

public class ThreadRunnable implements Runnable {

    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println("Runnable Thread");
        }
    }
}
