package by.javatr.pul.task8.data;

import by.javatr.pul.task8.scanner.ScannerTask8;

public class DataTask8 {
    public static double Function(){
        double x = ScannerTask8.DataScan();
        double f = 0;
        if (x < 3 & x!=3){
            f = 1 / (Math.pow(x, 3) - 6);
            return f;
        }else {
            f = x * 3 + 9 - Math.abs(Math.pow(x, 2));
            return f;
        }
    }
}
