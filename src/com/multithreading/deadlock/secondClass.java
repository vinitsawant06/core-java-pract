package com.multithreading.deadlock;

public class secondClass {

    public synchronized void d2(firstClass a) {
        System.out.println("Thread 2 execution of d2 method");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }

        a.last();
    }
    public synchronized void last() {
        System.out.println("Inside B's last method");
    }
}

