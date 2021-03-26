package Acce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TPshah {
    public static void main(String[] args) {
//        int a = (int) (Math.random() * 25);
//        System.out.println(a);

        List<Integer> list = Arrays.asList(1, 2, 3);
        List<Integer> list1 = Arrays.asList(4, 5, 6);
        List<Integer> list2 = Arrays.asList(7, 8, 9);
        List<List<Integer>> mergedList = Arrays.asList(list, list1, list2);
        System.out.println(mergedList);

        List<Integer> myList = mergedList.stream().flatMap(s -> s.stream()).collect(Collectors.toList());
        System.out.println(myList);



    }
}
