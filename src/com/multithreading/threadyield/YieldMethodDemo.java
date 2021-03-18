package com.multithreading.threadyield;

import com.multithreading.threadexample.SecondThreadToYield;

public class YieldMethodDemo {
    public static void main(String[] args) {
        MyThreadToYield myThreadToYield = new MyThreadToYield();
        Thread thread = new Thread(myThreadToYield);
        thread.setPriority(10);
        thread.start();
        SecondThreadToYield secondThreadToYield = new SecondThreadToYield();
        Thread thread1 = new Thread(secondThreadToYield);
        thread1.setPriority(10);
        thread1.start();
        for (int i=0; i<5; i++) {
            System.out.println("Main Thread!");
        }
    }
}
