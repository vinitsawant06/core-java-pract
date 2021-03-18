package com.java8features;

import java.util.ArrayList;

public class JavaPrac {

//    public static void myFirstMethod(String myString) {
//        System.out.println("String: "+myString);
//    }
//    public static void myFirstMethod(String[] myStringArray) {
//        System.out.println("String Array"+myStringArray);
//    }
    public static void main(String[] args) {
//        myFirstMethod(null);

        ArrayList myArrayList = new ArrayList();
        myArrayList.add("Vinit");
        myArrayList.add("Aniket");

        myArrayList.add(0, "VIgnesh");
        System.out.println(myArrayList);
        System.out.println(myArrayList.indexOf("Vinit")+" "+myArrayList.indexOf("Aniket"));
        myArrayList.add(1, "Random");
        System.out.println(myArrayList);
        String name = "abd";
        StringBuilder sb = new StringBuilder(name);
        sb.append("ef");
        System.out.println(sb);



    }
}
