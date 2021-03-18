package com.java8features.durga.MethodReference;

import java.util.Date;
import java.util.function.Supplier;

interface GetDate{
    Date getDate();
}
public class DateCl {
    public static void main(String[] args) {
//        Date myDate = new Date();
//        System.out.println(myDate.toString());
                Supplier<Date> myDate = Date::new;
                System.out.println(myDate.get());

                GetDate getDate = Date::new;
               System.out.println(getDate.getDate());
    }
}
