package com.multithreading.syncblock;

public class Display {
    public void myMethod() {
        System.out.println("Normal Exection");
        System.out.println("Normal Exection");
        System.out.println("Normal Exection");
        System.out.println("Normal Exection");
        System.out.println("Normal Exection");
        System.out.println("Normal Exection");
        synchronized (this) {
            for(int i=0; i<10; i++) {
                System.out.println("Synchronized block");
                try{
                    Thread.sleep(2000);
                } catch (InterruptedException ie) {
                    System.out.println(ie.getMessage());
                }
            }
            System.out.println("Normal Exection");
            System.out.println("Normal Exection");
            System.out.println("Normal Exection");
            System.out.println("Normal Exection");
            System.out.println("Normal Exection");
            System.out.println("Normal Exection");
        }


    }
}
