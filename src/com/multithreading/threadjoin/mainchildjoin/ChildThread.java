package com.multithreading.threadjoin.mainchildjoin;

public class ChildThread implements Runnable {

    static Thread mainThread;

    public void run() {
        try {
            mainThread.join();
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
        for(int i=0; i<6; i++) {
            System.out.println("Child Thread!");
        }
    }
}
