package Practice.java8;

import java.util.function.Predicate;

public class PreDefinedFuncInterf {
    public static void main(String[] args) {
        int[] x = {2,4,3,7,10};
        Predicate<Integer> predicate = I -> I%2==0;
        for(int value:x) {
            if(predicate.test(value)) {
                System.out.println(value+"Even Number");
            } else {
                System.out.println(value+"Odd number");
            }
        }
    }
}
