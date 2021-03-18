package com.multithreading.syncblock;

public class BlockDemo {

    public static void main(String[] args) {
        Display display = new Display();
        MyThread myThread = new MyThread(display);
        Thread thread = new Thread(myThread);
        MyThread myThread1 = new MyThread(display);
        Thread thread1 = new Thread(myThread1);
        thread.start();
        thread1.start();

    }
}
