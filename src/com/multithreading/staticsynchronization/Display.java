package com.multithreading.staticsynchronization;

public class Display {

    public static synchronized void displayN() { // Static sync: Class level lock
        for(int i=0; i<10; i++) {
            System.out.print(i);
            try{
                Thread.sleep(2000);
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
    }

    public synchronized void displayC() { // Only sync: Object level lock
        for(int i=65; i<=75; i++) {
            System.out.print((char)i);
            try{
                Thread.sleep(2000);
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
    }

}
