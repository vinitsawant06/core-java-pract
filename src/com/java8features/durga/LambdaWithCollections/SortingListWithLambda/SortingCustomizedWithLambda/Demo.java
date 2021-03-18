package com.java8features.durga.LambdaWithCollections.SortingListWithLambda.SortingCustomizedWithLambda;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {

    public static void main(String[] args) {
        ArrayList<Employee> arrayList = new ArrayList<>();
//        arrayList.add(new Employee(100, "Vinit"));
//        arrayList.add(new Employee(700, "Aniket"));
//        arrayList.add(new Employee(600, "Sam"));
//        arrayList.add(new Employee(50, "Rahul"));
        arrayList.add(employeeCalling(100, "Vinit"));
        arrayList.add(employeeCalling(200, "Aniket"));
        arrayList.add(employeeCalling(700, "Sam"));
        arrayList.add(employeeCalling(50, "David"));

        System.out.println(arrayList);
        Collections.sort(arrayList, (e1, e2) -> (e1.Eno<e2.Eno) ? -1:(e1.Eno>e2.Eno)?1:0);
        System.out.println("After sorting: "+arrayList);
    }
    public static Employee employeeCalling(int Enum, String name) {
        return new Employee(Enum, name);
    }
}
