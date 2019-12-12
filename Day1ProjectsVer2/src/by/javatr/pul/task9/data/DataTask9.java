package by.javatr.pul.task9.data;

import by.javatr.pul.task9.scanner.ScannerTask9;

public class DataTask9 {
    public static double Radius(){
        double r = ScannerTask9.DataScan();
        return r;
    }public static double Circuit(){
        double c = 2*Math.PI * Radius();
        return c;
    }public static double Square(){
        double s = Math.PI*Math.pow(Radius(),2);
        return s;
    }
}
