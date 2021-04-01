package Acce;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class AcceCustomizedException extends RuntimeException {
    AcceCustomizedException(String s) {
        super(s);
    }
}

class ExceptionMain  {
    public static void m1() {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        String name = "Vinit";
        try (BufferedReader be = new BufferedReader(new FileReader("input.txt"))) {

            if(name.equals("Vinit")) {
                String values  = be.toString();
                System.out.println(values);
                throw new AcceCustomizedException("Name is Vinit");
            }
        } catch (AcceCustomizedException | IOException ae) {
            System.out.println(ae.getMessage());
        }


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(5);
        arrayList.add(17);
        arrayList.add(1);
        System.out.println(arrayList);
        Collections.sort(arrayList, (I1, I2) -> I1>I2 ? 1 : I1<I2 ? -1 : 0);
        System.out.println(arrayList);
        Thread thread = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        thread.start();
        Thread thread1 = new Thread(ExceptionMain::m1);
        thread1.start();
        System.out.println(Thread.currentThread().getName());
    }
}
