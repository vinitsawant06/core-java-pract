package com.multithreading;

public class ThreadDemo {

    public static void main(String[] args) {
        //Approach 1: By extending Thread class
        MyThread myThread = new MyThread();
        myThread.start();
        for(int i=0; i<15; i++) {
            System.out.println("Main Thread");
        }
        //Approach 2: By implementing Runnable interface
        ThreadRunnable threadRunnable = new ThreadRunnable();
        Thread t = new Thread(threadRunnable);
        t.start();
        System.out.println("Hello");
    }
}