package com.multithreading.syncblock;


public class MyThread implements Runnable {

    Display d;
    MyThread(Display d) {
        this.d = d;
    }
    public void run() {
        d.myMethod();
    }
}
