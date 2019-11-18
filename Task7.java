package by.javatr.task7.main;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты точек А и В ");
        double x1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        if (x1-x2<0 & y1-y2<0){
            System.out.println("Точка В находится дальше");
        }else{
            if (x1-x2>0 & y1-y2>0){
                System.out.println("Точка А находится дальше");
            }
        }


    }
}
