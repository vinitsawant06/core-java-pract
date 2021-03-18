package com.java8features.durga.MethodReference.MultiThreading;

public class ThreadDemo {
    public void myMethod() {
        for (int i =0; i<10; i++) {
            System.out.println("Child Thread!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                ie.getMessage();
            }
        }
    }
    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        Thread thread = new Thread(threadDemo::myMethod);
        thread.start();
        for (int i=0; i<10; i++) {
            System.out.println("Main Thread!");
        }

    }
}

