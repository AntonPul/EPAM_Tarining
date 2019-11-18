package by.javatr.task5.main;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int s = scanner.nextInt();
        if(sum(s)) {
            System.out.println("Число является совершенным");
        } else {
            System.out.println("Число не является совершенным");
        }

        System.out.flush();

    } static boolean sum(int n) {
        int summa =0;
        for(int i=1;i<n;i++) {
            if(n%i==0) summa+=i;
        }
        if(summa==n) return true; else return false;
    }}

