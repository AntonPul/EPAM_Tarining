package by.javatr.task3.main;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину стороны квадрата: ");
        double side = scanner.nextDouble();
        double areaOfSquare = Math.pow(side,2);
      //  System.out.println("Площадь квадрата = " + areaOfSquare);
        double radiusOfCircle = side/2;
      //  System.out.println("Радиус вписанной окружности = "+radiusOfCircle);
        double areaOfSquareIn = 2* Math.pow(radiusOfCircle,2);
   //     System.out.println("Площадь вписанного квадрата = "+ areaOfSquareIn);
        double dif = areaOfSquare - areaOfSquareIn;
        System.out.println("Разница площади квадратов = " + dif);
    }
}
