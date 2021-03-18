package com.java8features.durga.AnonymousWithThis;

interface Interf {
    void m1();
}

public class AnonymousThis {

    int x =888;
    public void m2() {
        Interf interf = new Interf() {
            int x =999;
            @Override
            public void m1() {
                //It refers to current object of inner class
                System.out.println(this.x);

                //It refers to object of AnonymousThis clss
                System.out.println(AnonymousThis.this.x);

            }
        };
        interf.m1();
    }
    public static void main(String[] args) {
        AnonymousThis anonymousThis = new AnonymousThis();
        anonymousThis.m2();
    }
}
