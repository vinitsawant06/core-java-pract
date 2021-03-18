package com.multithreading.practicedemodelete;

import com.java8features.durga.MethodReference.MultiThreading.ThreadDemo;

public class MyRunnable implements Runnable {
    public void run() {
        for(int i =0; i<5; i++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Hello");
        }
    }
}

class Threadable {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
       Thread thread = new Thread(runnable);
        thread.start();

        for (int i=0; i<5; i++) {

            System.out.println(Thread.currentThread().getName());
            System.out.println("Main");
        }
    }
}
