package com.multithreading.threadexample;

public class ThreadClass implements Runnable {
    public void run() {
       int value =  m1(10,20);
       System.out.println(value);
    }
    public int m1(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
