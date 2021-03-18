package com.multithreading.interthreadwaitnotify;

public class ThreadA implements Runnable{

   int total = 0;
    public void run() {
        //MainThread mainThread = new MainThread();
        synchronized (this) {
            System.out.println("Child thread execution started!");
            for(int i=1; i<100; i++) {
                total = total + i;
                System.out.println("Total is: "+total);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Execution of sync block of child thread finished");
            System.out.println(total);
            this.notify();
        }
    }
}
