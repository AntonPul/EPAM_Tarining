package by.javatr.pul.task2.main;
import by.javatr.pul.task2.data.DataTask2;
import by.javatr.pul.task2.scanner.DataScanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter month number ");
        int m = DataScanner.enterMonth();
        System.out.println("Enter year twice");
        int y = DataScanner.enterYear();
        System.out.println(DataTask2.DayInMonth(m));
        System.out.println("It's a Leap year " + DataTask2.isLeapYear(y));



    }
}
