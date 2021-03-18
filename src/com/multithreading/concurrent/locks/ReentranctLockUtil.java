package com.multithreading.concurrent.locks;

import java.util.concurrent.locks.ReentrantLock;

public class ReentranctLockUtil {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
        reentrantLock.lock();
        System.out.println(reentrantLock.isLocked());
        System.out.println(reentrantLock.getHoldCount());
        System.out.println(reentrantLock.getQueueLength());
        System.out.println(reentrantLock.hasQueuedThreads());
        System.out.println(reentrantLock.isFair());
        System.out.println(reentrantLock.isHeldByCurrentThread());
        reentrantLock.unlock();
        reentrantLock.unlock();
        System.out.println(reentrantLock.isLocked());
        System.out.println(reentrantLock.getHoldCount());
        System.out.println(reentrantLock.getQueueLength());
        System.out.println(reentrantLock.hasQueuedThreads());
        System.out.println(reentrantLock.isFair());
        System.out.println(reentrantLock.isHeldByCurrentThread());

    }
}
