package com.multithreading.staticsynchronization;

public class MySecondThread implements Runnable {
    Display d;
    MySecondThread(Display d) {
        this.d = d;
    }
    public void run() {
        d.displayN();
    }
}
