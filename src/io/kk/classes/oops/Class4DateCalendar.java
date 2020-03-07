package io.kk.classes.oops;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.util.Calendar.DATE;

public class Class4DateCalendar {
    public static void main(String[] args) {

        try {
            GregorianCalendar cal = new GregorianCalendar();
            String months[] = {"Jan", "Feb", "Mar", "Apr"};
            int year;
            System.out.println("Date is "+ months[cal.get(Calendar.MONTH)]);
            System.out.println("Date is "+ months[cal.get(Calendar.MONTH)] + " - "+ cal.get(DATE) + " - "+ cal.get(Calendar.YEAR));
        }catch (Exception e){
        }


    }
}
