package com.multithreading.concurrent.locks.synchbyreentrant;

public class MyThread implements Runnable {
    Display d;
    String name;
    MyThread(Display d, String name) {
        this.d = d;
        this.name = name;
    }
    public void run() {
        d.show(name);
    }
}
