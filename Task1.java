package by.javatr.task1.runner;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        double num = in.nextDouble();
        double n = num %10;
        int a = 2;
        Math.pow(n,a);
        double n2= Math.pow(n,a)%10;
        System.out.print("Последняя цифра квадрата последней цифры введеного числа равняется = " + n2);



    }
}
