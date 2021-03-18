package com.multithreading.threadexample;

public class ThreadDemo {
    public static void main(String[] args) {
        ThreadClass threadClass = new ThreadClass();
        Thread thread = new Thread(threadClass);
        thread.start();
        thread.start();
    }
}
