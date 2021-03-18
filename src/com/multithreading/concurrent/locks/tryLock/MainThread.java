package com.multithreading.concurrent.locks.tryLock;

public class MainThread {
    public static final String FIRST_THREAD = "First Thread";
    public static final String SECOND_THREAD = "Second Thread";
    public static void main(String[] args) {

        MyThread thread1 = ThreadCalling(FIRST_THREAD);
        thread1.start();
        MyThread thread2 = ThreadCalling(SECOND_THREAD);
        thread2.start();
    }

    private static MyThread ThreadCalling(String name) {
        return new MyThread(name);
    }
}
