package by.javatr.task10.main;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double h = scanner.nextDouble();
        double x = 0;
        int i = 0;
        double F = 0;
        while (x<=b){
            x=a + i*h;
            if (Math.tan(x)==0){
                System.out.println(x+ "на 0 делить нельзя");}
            else {
                F=x/Math.tan(x);
                System.out.println(x+ " "+F);
            }
            i++;
        }
    }
}
