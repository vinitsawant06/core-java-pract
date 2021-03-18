package com.multithreading.deadlock;


public class Deadlock extends Thread {
    firstClass a = new firstClass();
    secondClass b = new secondClass();

    public void m1() {
        this.start();
        try {
            a.d1(b);
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
    }
    public void run() {
        b.d2(a);
    }

    public static void main(String[] args) {
        Deadlock deadlock = new Deadlock();
        deadlock.m1();
    }


}
