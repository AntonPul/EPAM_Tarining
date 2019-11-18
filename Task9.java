package by.javatr.task9.main;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус: ");
        double r = scanner.nextDouble();
        double c = 2 * Math.PI * r;
        double s = Math.PI * Math.pow(r,2);
        System.out.println("Длина окружности = "+ c);
        System.out.println("Площадь круга = "+ s);
    }
}
