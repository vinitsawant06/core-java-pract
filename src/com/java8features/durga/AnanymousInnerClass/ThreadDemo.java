package com.java8features.durga.AnanymousInnerClass;

public class ThreadDemo {
    public static void main(String[] args) {

        //Anonymous Inner class
        AnanymousInterface ananymousInterface = new AnanymousInterface() {
            @Override
            public void m1() {
                System.out.println("Anonymous Inner Class");
            }
        };

        ananymousInterface.m1();

        //Anonymous Inner class with Multithreading

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<10; i++) {
                    System.out.println("Child Thread!");
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        //Lambda Instead of Anonymous Inner Class

        Runnable runnable1 = () -> {
            for(int i=0; i<10; i++) {
                System.out.println("Child Thread with Lambda");
            }
        };
        Thread thread1 = new Thread(runnable1);
        thread1.start();

        //Lambda by directly passing as argument to Thread class

        Thread thread2 = new Thread(() -> {
            for(int i=0; i<10; i++) {
                try {
                    System.out.println("Lambda as an argument to Thread class");
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                    ie.getMessage();
                }
            }
        });
        thread2.start();
    }
}
