package Practice.multithreading;

public class ThreadRun {
    public static void main(String[] args) {
        ThreadClass threadClass = new ThreadClass();
        Thread thread = new Thread(threadClass);
        thread.start();
        for(int i=0; i<10;i++) {
            System.out.println("Main Thread"+Thread.currentThread().getName());
        }
    }
}
