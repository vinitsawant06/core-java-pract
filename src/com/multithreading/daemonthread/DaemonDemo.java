package com.multithreading.daemonthread;

public class DaemonDemo {
    public static void main(String[] args) {
        ChildThread childThread = new ChildThread();
        childThread.setDaemon(true);
        childThread.start();
        synchronized (childThread) {
            try {
                childThread.wait();
            } catch (InterruptedException ie) {
                ie.getMessage();
            }
        }
        System.out.println("End of main thread");
    }
}
