package Practice;

abstract class Test1 {
    public abstract void myM();
}

public class Test {
    public int x = 10;
    public static int y = 20;

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.x);
        System.out.println(y);
        System.out.println(Test.y);
        test.m1();
        test.m2(10);
        test.m2(10,20,30);
        test.m2(10,20,40,50);

        byte b =10;
        int a = b;
        int c = 5;
        byte d = (byte) c;

    }

    public void m1() {
        System.out.println(y);
        System.out.println(Test.y);
        System.out.println(x);
    }

    public void m2(int... num) {
        for(int numb:num) {
            System.out.println("Num"+numb);
        }
    }
}
