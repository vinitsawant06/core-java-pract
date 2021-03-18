package Acce;

class MyThread implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
public class ABC {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();
        System.out.println(Thread.currentThread().getName());
    }
}
