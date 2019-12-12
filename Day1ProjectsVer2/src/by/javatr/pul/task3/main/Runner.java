package by.javatr.pul.task3.main;

import by.javatr.pul.task3.data.DataTask3;
import by.javatr.pul.task3.scanner.DataScanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите длину стороны квадрата: ");
        double side = DataScanner.Side();
        System.out.println(DataTask3.Dif());

    }
}
