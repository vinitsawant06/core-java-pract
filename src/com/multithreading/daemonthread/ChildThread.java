package com.multithreading.daemonthread;

public class ChildThread extends Thread{

    public void run() {
        synchronized (this) {
            for(int i=0; i<10; i++) {
                System.out.println("Child thread");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ie) {
                    ie.getCause();
                }
            }
            this.notify();
        }

    }
}
