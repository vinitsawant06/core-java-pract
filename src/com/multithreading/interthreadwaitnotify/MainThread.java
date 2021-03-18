package com.multithreading.interthreadwaitnotify;

public class MainThread {
    public static void main(String[] args) {
        ThreadA A = new ThreadA();
        Thread thread = new Thread(A);
        thread.start();
        synchronized (A) {
            try {
                A.wait(); // if no guarantee of time then use A.wait(10000)
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
        System.out.println(A.total);
    }
}
