package by.javatr.task6.main;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество секунд: ");
        int sec = scanner.nextInt();
        int min = sec / 60;
        System.out.println("Количество минут = "+ min);
        int hours = min / 60;
        System.out.println("Количество часов = "+ hours);



    }
}
