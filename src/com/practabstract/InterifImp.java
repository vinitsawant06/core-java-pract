package com.practabstract;

public class InterifImp implements Interif {
    public void m1() {
        System.out.println("M1");
    }
    public static void main(String[] args) {
        int x = 777;
        System.out.println(x);
        int y = Interif.x;
        System.out.println(y);
        InterifImp interifImp = new InterifImp();
        interifImp.m1();
        Interif.m2();
    }
}
