package com.operators;

public class Operator {
    public static void main(String[] args) {
        int x=10;
        int y=15;
        singleAnd(x,y);
        doubleAnd(x,y);
        singleParallel(x,y);
        doubleParallel(x,y);
    }
    public static void singleAnd(int a, int b) {
        if(++a<10 & ++b>15) {
            a++;
        } else {
            b++;
        }
        System.out.println("With & operator");
        System.out.println("x is: "+a+" and y is: "+b);
    }
    public static void doubleAnd(int a, int b) {
        if(++a<10 && ++b>15) {
//            if a++ then it will compare first then it will increment
//            so if a++<11 then it will compare a i.e. 10 with 11 and then it will increment
            a++;
        } else {
            b++;
        }
        System.out.println("With && operator");
        System.out.println("x is: "+a+" and y is: "+b);
    }
    public static void singleParallel(int a, int b) {
        if(++a<10 | ++b>15) {
            a++;
        } else {
            b++;
        }
        System.out.println("With & operator");
        System.out.println("x is: "+a+" and y is: "+b);
    }
    public static void doubleParallel(int a, int b) {
        if(++a<10 || ++b>15) {
            a++;
        } else {
            b++;
        }
        System.out.println("With & operator");
        System.out.println("x is: "+a+" and y is: "+b);
    }
}
