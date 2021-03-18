package com.multithreading.synchtemppract;

public class Display {

    public synchronized void show(String name) {
        for(int i=0; i<10; i++) {
            System.out.print("\nGood Morning!");
            try{
                Thread.sleep(2000);
            } catch(InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
            System.out.print(name);
        }
    }
}
