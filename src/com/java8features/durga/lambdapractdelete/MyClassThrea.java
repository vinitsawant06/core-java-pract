package com.java8features.durga.lambdapractdelete;

interface Interf {
    default void m1() {
        System.out.println("Hello");
    }
    static void m2() {
        System.out.println("m2 hello");
    }
}

public class MyClassThrea implements Interf  {

    public static void main(String[] args) {
//        Runnable r = () -> {
//            for(int i= 0; i<5; i++) {
//                System.out.println(Thread.currentThread().getName());
//                System.out.println("Child thread!");
//            }
//        };
//        Thread thread = new Thread(r);
//        thread.start();
        Interf interf = new MyClassThrea();
        interf.m1();

        Interf.m2();
    }
}
