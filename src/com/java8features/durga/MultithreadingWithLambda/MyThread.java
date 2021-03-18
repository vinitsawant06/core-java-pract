package com.java8features.durga.MultithreadingWithLambda;

public class MyThread {


    public static void main(String[] args) {
         Runnable r = () -> {
            for(int i=0; i<10; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        };
        Thread t = new Thread(r);
        t.start();
        for(int i=0; i<10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
