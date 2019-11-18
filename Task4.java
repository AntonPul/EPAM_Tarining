package by.javatr.task4.main;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        boolean x = (a%2==0 | b%2==0 & c%2==0 | d%2==0);
            System.out.println(x);



    }
}
