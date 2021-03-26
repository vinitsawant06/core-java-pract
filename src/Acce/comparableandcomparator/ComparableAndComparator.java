package Acce.comparableandcomparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableAndComparator {
    public static void main(String[] args) {
        List<Laptop> laps = new ArrayList<>();
        laps.add(new Laptop("Dell", 12, 500));
        laps.add(new Laptop("HP", 8, 800));
        laps.add(new Laptop("Lenovo", 12, 700));

        Comparator<Laptop> comparator = (o1, o2) -> {
            if(o1.getRam() > o2.getRam()) {
                return 1;

            } else if(o1.getRam() < o2.getRam()) {
                return -1;
            }
            return 0;
        };

        Collections.sort(laps, comparator);
        for(Laptop laptop:laps) {
            System.out.println(laptop);
        }

    }

}
