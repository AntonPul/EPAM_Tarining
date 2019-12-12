package by.javatr.pul.task2.data;

import by.javatr.pul.task2.scanner.DataScanner;

import java.util.GregorianCalendar;

public class DataTask2 extends DataScanner {
    public static boolean isLeapYear(int year) {
        GregorianCalendar calendar = new GregorianCalendar();
        if (calendar.isLeapYear(year)) {
            return true;
        }
        return false;
    }

    public static int DayInMonth(int month) {
        int a = 30;
        int b = 29;
        int c = 28;
        int d = 31;
        GregorianCalendar calendar = new GregorianCalendar();
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println(a);
        } else {
            if (month == 2 && calendar.isLeapYear(enterYear())) {
                System.out.println(b);
            } else {
                if (month == 2) {
                    System.out.println(c);
                } else {
                    System.out.println(d);
                }
            }
        }
    return 0;}
}
