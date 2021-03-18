package com.multithreading.concurrent.locks.tryLock;

import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {
    // if not declared as static then it will be instance variable and every object will access it separately
    static ReentrantLock reentrantLock = new ReentrantLock();
    MyThread(String name) {
        super(name);
    }
    public void run() {
        if(reentrantLock.tryLock()) {
            System.out.println(Thread.currentThread().getName() + " Got lock");
            try{
                Thread.sleep(5000);
            } catch (InterruptedException ie) {
                ie.getMessage();
            }
        } else {
            System.out.println(Thread.currentThread().getName()+" didn't get the lock");
        }
    }
}
