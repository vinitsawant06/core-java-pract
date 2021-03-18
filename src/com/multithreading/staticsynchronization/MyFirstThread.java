package com.multithreading.staticsynchronization;

public class MyFirstThread implements Runnable {
    Display d;
    MyFirstThread(Display d) {
        this.d = d;
    }
    public void run(){
        d.displayC();
    }
}
