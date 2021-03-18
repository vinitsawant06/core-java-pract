package com.multithreading.deadlock;

public class firstClass {

    public synchronized void d1(secondClass b) throws InterruptedException {
        System.out.println("Thread 1 starts execution of d1 method");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
        b.last();
    }

    public synchronized void last() {
        System.out.println("Inside A's last method");
    }
}
