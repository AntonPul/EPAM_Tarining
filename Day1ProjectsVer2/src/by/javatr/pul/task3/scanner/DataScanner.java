package by.javatr.pul.task3.scanner;

import java.util.Scanner;

public class DataScanner {
    public static double Side() {
        Scanner scanner = new Scanner(System.in);
        double side;
        while (scanner.hasNextInt()){
            scanner.next();}
        side = scanner.nextDouble();
            return side;
        }
    }

