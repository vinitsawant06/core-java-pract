package com.multithreading.synchtemppract;

public class MainClass {

    public static void main(String[] args) {
        Display display = new Display();
        MyThread myThread = new MyThread(display, "Vinit");
        Thread firstThread = new Thread(myThread);
        firstThread.start();
        MyThread mySecondThread = new MyThread(display, "Sawant");
        Thread secondThread = new Thread(mySecondThread);
        secondThread.start();
    }
}
