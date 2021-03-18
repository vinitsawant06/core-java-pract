package com.java8features.durga.DefaultMethondsInInterface;

interface Interf {
    default void m1() {
        System.out.println("Default Method");
    }
}

public class DefaultDemo implements Interf {
    public void m1() {
        System.out.println("My custom default method");
    }
    public static void main(String[] args) {
        DefaultDemo defaultDemo = new DefaultDemo();
        defaultDemo.m1();
    }
}
