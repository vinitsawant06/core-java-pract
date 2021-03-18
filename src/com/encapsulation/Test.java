package com.encapsulation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        Encapsulate encapsulate = new Encapsulate();
        encapsulate.setName("Vinit");
        encapsulate.setAge(26);

        System.out.println("Name is: "+encapsulate.getName()+" and "+"Age is: "+encapsulate.getAge());

        HashMap<String, String> myHashMap = new HashMap<>();
        myHashMap.put("Name","Vinit");
        myHashMap.put("Name1","Ravi");
        System.out.println(myHashMap);
        String myFirstName = myHashMap.get("Name");
        System.out.println(myFirstName);
        for(HashMap.Entry<String, String> hashMapEntry : myHashMap.entrySet()) {
            System.out.println(hashMapEntry.getKey()+" "+hashMapEntry.getValue());
        }
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Vinit");
        hashSet.add("VinIt");
        hashSet.add("Ravi");
        for (String value: hashSet) {
            System.out.println(value);
        }

        //Reverse a string
        String mystring = "vinit";
        String reverstring = "";
        char[] myCharArray = mystring.toCharArray();
        for(int i=myCharArray.length-1; i>=0; i--) {
            reverstring = reverstring + myCharArray[i];
        }
        System.out.println(reverstring);

        //Reverse Number
        int firstNum = 12345;
        int reverseNum = 0;
        while (firstNum > 0) {
            int rem = firstNum%10;
            reverseNum = reverseNum*10 + rem;
            firstNum = firstNum/10;
        }
        System.out.println(reverseNum);

        //Fibonassi series
        long firstValue = 1;
        long secondValue = 2;
        int count = 10;

        System.out.print(firstValue+" "+secondValue);
        while (count > 0) {
            long tempNum = firstValue * secondValue;
            firstValue = secondValue;
            secondValue = tempNum;
            System.out.print(" "+tempNum);
            count--;
        }

        //Anagram String
        String firstString = "listen";
        String secondString = "silent";
        char[] firstChar = firstString.toCharArray();
        char[] secondChar = secondString.toCharArray();

        Arrays.sort(firstChar);
        Arrays.sort(secondChar);

        if(Arrays.equals(firstChar, secondChar)) {
            System.out.println("Anagram string");
        } else {
            System.out.println("Not anagram string");
        }
        int[] x;
        x = new int[2];
        x[0] = 2;

        Encapsulate encapsulate2; // declaration
        encapsulate2 = new Encapsulate(); //initialization


    }
}

class MyTestOverride {
    public void m1(int i) {

    }
}

class OverridenClass extends MyTestOverride {
    public void m1(int i) {
        System.out.println(i);
    }
}
