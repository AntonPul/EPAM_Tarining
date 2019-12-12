package by.javatr.pul.task6.data;

import by.javatr.pul.task6.scanner.ScannerTask6;

public class DataTask6 {
    public static int Seconds(){
        int sec = ScannerTask6.DataScanner();
        return sec;
    }public static int Minutes(){
        int minutes = Seconds()/60;
        return minutes;
    }public static int Hours(){
        int hours = Minutes()/60;
        return hours;
    }
}
