package com.java8features.durga.lambdafirsteg;

public class Test implements FunctiInterfService {

    public void m1(int value1, int value2) {
        System.out.println(value1+value2);
    }
    public static void main(String[] args) {
        FunctiInterfService fi = new Test();
        fi.m1(10, 20);

    }
}
