package com.practice;

public class VarArgMethod {
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(10));
        System.out.println(sum(10,20,30,40,50));
        int[] a ={10,20,30,40};
        int[] b ={50,60,70};
        m1(a,b);
    }
    public static int sum(int... a) {
        int total = 0;
        for(int number: a) {
            total = total + number;
        }
        return total;
    }
    public static void m1(int[]... x) {
        for(int[] x1: x) {
            System.out.println(x1[0]);
        }
    }
}
