package com.generics;

public class GenClass <T> {
    T obj;
    GenClass(T obj) {
        this.obj = obj;
    }
    public void Show(){
        System.out.println("Obj is of type: "+ obj.getClass().getName());
    }
    public T getObj() {
        return obj;
    }
}

class Test {
    public static void main(String[] args) {
        GenClass<String> genClass = new GenClass<>("Vinit");
        genClass.Show();
        System.out.println(genClass.getObj());

        GenClass<Integer> genClass1 = new GenClass<>(10);
        genClass1.Show();
        System.out.println(genClass1.getObj());

    }
}
