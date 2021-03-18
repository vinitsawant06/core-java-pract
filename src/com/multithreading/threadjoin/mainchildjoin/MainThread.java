package com.multithreading.threadjoin.mainchildjoin;

public class MainThread {
    public static void main(String[] args) {
        ChildThread.mainThread = Thread.currentThread();
        ChildThread childThread = new ChildThread();
        Thread thread = new Thread(childThread);
        thread.start();
        for(int i=0; i<6; i++) {
            System.out.println("Main Thread!");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
    }
}
