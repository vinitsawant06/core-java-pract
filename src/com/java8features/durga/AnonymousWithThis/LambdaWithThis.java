package com.java8features.durga.AnonymousWithThis;

interface InterfNew {
    void m1();
}

public class LambdaWithThis {
    int x = 888;
    public void m2() {
        InterfNew interfNew = () -> {
            int x =999;
            System.out.println(this.x);
        };
        interfNew.m1();
    }

    public static void main(String[] args) {
        LambdaWithThis withThis = new LambdaWithThis();
        withThis.m2();
    }
}
