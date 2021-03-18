package com.practice;


import com.practabstract.Interif;

import java.util.ArrayList;
import java.util.Collections;

public class PracticeMain extends Intimp {
    public static void main(String[] args) {
        Intimp in = new Intimp();
        in.method(20);
        int[] myArray = {10,30,1,99,22,9};
        int length = myArray.length-1;
        int minValue = myArray[0];
        int maxValue = myArray[0];
        for(int i=0; i<=length; i++) {
            if(maxValue<myArray[i]) {
                maxValue = myArray[i];
            } else if(minValue>myArray[i]){
                minValue=myArray[i];
            }
        }
        System.out.println("min num "+minValue+" and "+" max num "+maxValue );
        int value = myMethod();
        System.out.println(value);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Vinit");
        arrayList.add("Ravi");

        Collections.sort(arrayList);
     }
}

class Intimp implements myFirstInterface {
    @Override
    public void method(int num) {
        System.out.println("THis is interface!"+num);
    }
    public static int myMethod() {
        return 10;
    }
}
