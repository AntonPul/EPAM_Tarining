package by.javatr.pul.task2.scanner;

import java.util.Scanner;

public class DataScanner {

    public static int enterMonth() {
        Scanner scanner = new Scanner(System.in);
        int month;
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        month = scanner.nextInt();
        return month;
        }
    public static int enterYear(){
        Scanner scanner = new Scanner(System.in);
        int year;
        while (!scanner.hasNextInt()){
            scanner.next();
        }
        year = scanner.nextInt();
        return year;

    }
}