package by.javatr.task2.main;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату в формате MM: " + " YYYY:");
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        GregorianCalendar cal = new GregorianCalendar();
        int d = 30;
        int d1 = 29;
        int d2 = 28;
        int d3 = 31;
        if (month==4 || month==6 || month==9 || month==11) {
            System.out.println(d);
        }
        else {
            if (month==2 && cal.isLeapYear(year)){
                System.out.println(d1);
            }else {
                if (month==2){
                    System.out.println(d2);
                }else{
                    System.out.println(d3);
            }
        }
        }
        if(cal.isLeapYear(year)){
            System.out.println("Год високосный");
        }
        else{
            System.out.println("Год не високосный");
        }
    }
}
