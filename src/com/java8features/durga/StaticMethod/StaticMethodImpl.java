package com.java8features.durga.StaticMethod;

interface Interf {
     static void m1() {
         System.out.println("Static method");
    }
}

public class StaticMethodImpl {
    public static void main(String[] args) {
       Interf.m1();
    }
}
