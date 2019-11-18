package by.javatr.task8.main;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        double x = scanner.nextDouble();
        double F = 0;
        if (x < 3 & x!=3) {
            F = 1 / (Math.pow(x, 3) - 6);
            {
                System.out.println(F);
            }

        } else {
            F =  x*3 + 9 - Math.abs(Math.pow(x, 2));
            System.out.println(F);
        }
    }
}