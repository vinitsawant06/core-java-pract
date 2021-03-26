package Acce;

public class Overloading {

    public void m1(int a) {
        System.out.println(a);
    }
    public int m1(long a) {
        System.out.println(a);
        return (int) (a*a);
    }

}
