package com.multithreading.synchronization;

import java.util.ArrayList;

public class SynchronizationDemo {
    public static void main(String[] args) {
        Display display = new Display();
        MyThread myThread = new MyThread(display, "Dhoni");
        Thread firstThread = new Thread(myThread);
        MyThread mySecondThread = new MyThread(display, "Kohli");
        Thread secondThread = new Thread(mySecondThread);
        firstThread.start();
        secondThread.start();


    }
}
