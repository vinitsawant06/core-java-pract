package Practice.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(2);
        al.add(5);
        al.add(20);
        al.add(4);

        List<Integer> evenList = al.stream().filter(I->I%2==0).collect(Collectors.toList());
        List<Integer> oddList = al.stream().filter(I->I%2!=0).collect(Collectors.toList());
        System.out.println(evenList);
        System.out.println(oddList);
        List<Integer> multipliedList = al.stream().map(I->I*2).collect(Collectors.toList());
        System.out.println(multipliedList);

        int[] a = {1,2,3,4,5};
        ArrayList<Integer> alist = new ArrayList<>();

        for(int value:a) {
            alist.add(value);
        }
        System.out.println(alist);
        String s="hello";
        String s1=new String("hello");
        System.out.println(s==s1);

    }
}
