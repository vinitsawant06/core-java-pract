package com.java8features.durga.MethodReference;

import java.lang.invoke.MethodHandle;

interface LengthInterf {
    int getLength(String s);
}

public class MethodRef {
    public static int refMethod(String s) {
        return s.length();
    }
    public static void main(String[] args) {
        MethodRef methodRef = new MethodRef();
        String name = "Vinit";
        LengthInterf lengthInterf = MethodRef::refMethod;
        System.out.println(lengthInterf.getLength(name));

    }
}
