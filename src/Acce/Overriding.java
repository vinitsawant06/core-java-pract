package Acce;

public class Overriding {
    public void m1() {
        System.out.println("M1 of parent");
    }
}

class B extends Overriding {
    public void m1() {
        System.out.println("M1 of child");
    }
}

class Test {
    public static void main(String[] args) {
        Overriding overriding = new B();
        overriding.m1();
        Overriding overriding1 = new Overriding();
        overriding1.m1();
    }
}
