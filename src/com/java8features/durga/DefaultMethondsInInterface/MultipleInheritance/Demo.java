package com.java8features.durga.DefaultMethondsInInterface.MultipleInheritance;

interface Left {
    default void m1() {

        System.out.println("Left Default Method");
    }
}

interface Right {
    default void m1() {

        System.out.println("Right Default Method");
    }
}

public class Demo implements Left, Right {

    public void m1() {
        System.out.println("My Own implementation");
        Left.super.m1();
    }
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.m1();
    }
}
