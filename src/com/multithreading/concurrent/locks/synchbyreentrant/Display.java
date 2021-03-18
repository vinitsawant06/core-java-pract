package com.multithreading.concurrent.locks.synchbyreentrant;

import java.util.concurrent.locks.ReentrantLock;

public class Display {

    ReentrantLock reentrantLock = new ReentrantLock();
    public void show(String name) {
        reentrantLock.lock();
        for(int i=0; i<10; i++) {
            System.out.print("\nGood Morning:");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                ie.getMessage();
            }
            System.out.print(name);
        }
        reentrantLock.unlock();
    }
}
