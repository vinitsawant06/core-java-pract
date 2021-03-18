package com.multithreading.staticsynchronization;

public class SyncDemo {
    public static void main(String[] args) {
        Display display = new Display();
        MyFirstThread t1 = new MyFirstThread(display);
        MySecondThread t2 = new MySecondThread(display);
        Thread firstThread = new Thread(t1);
        Thread secondThread = new Thread(t2);
        firstThread.start();
        secondThread.start();
    }
}
