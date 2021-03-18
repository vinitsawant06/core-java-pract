package Practice.java8;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TimePass {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(5);
        al.add(5);
        al.add(2);

//        List l = al.stream().map(I->I*2).collect(Collectors.toList());
//        List l = al.stream().filter(I->I%2==0).collect(Collectors.toList());
//        System.out.println(l);
        Map<Integer,Long> map = al.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    }
}
