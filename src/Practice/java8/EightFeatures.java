package Practice.java8;

interface FunctInterf {
    void m1(int i);

}

public class EightFeatures {
    public static void main(String[] args) {
        FunctInterf fi = a -> System.out.println("lambda"+a);
        fi.m1(10);

        Runnable runnable = () -> {
            for(int i=0; i<10; i++) {
                System.out.println("Child thread"+Thread.currentThread().getName());
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
