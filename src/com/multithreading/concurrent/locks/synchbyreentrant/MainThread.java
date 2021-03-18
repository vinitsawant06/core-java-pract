package com.multithreading.concurrent.locks.synchbyreentrant;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class MainThread {
    public static void main(String[] args) {
        Display d = new Display();
        String firstName = "Dhoni";
        String secondName = "Kohli";
        MyThread myThread = new MyThread(d, firstName);
        MyThread myThread1 = ThreadCalling(d, firstName);
        Thread thread1 = new Thread(myThread1);
        thread1.start();
        MyThread myThread2 = ThreadCalling(d, secondName);
        Thread thread2 = new Thread(myThread2);
        thread2.start();
    }

    /**
     *
     * @param d
     * @param name
     * @return myThread
     * Epam standard
     */
    @NotNull
    @Contract("_, _ -> new")
    public static MyThread ThreadCalling(Display d, String name) {
        return new MyThread(d, name);
    }
}
