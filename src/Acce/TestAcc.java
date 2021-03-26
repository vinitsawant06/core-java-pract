package Acce;


import java.util.*;

public class TestAcc {
    public static void main(String[] args) {
        List<String> al = Arrays.asList("a", "b", "c", "d", "e");

        al.forEach(System.out::print);

        al.parallelStream().forEach(System.out::print);

        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(100, "Vinit");
        map.put(104, "ABC");
        map.put(107, "CED");
        map.put(101, "DEF");

        for(Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }



    }
}
