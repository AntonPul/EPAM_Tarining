package by.javatr.pul.task10.data;

import by.javatr.pul.task10.scanner.ScannerTask10;

public class DataTask10 {
    public static double DoteA(){
        double a = ScannerTask10.DataScan();
        return a;
    }public static double DoteB(){
        double b = ScannerTask10.DataScan();
        return b;
    }public static double StepH(){
        double h = ScannerTask10.DataScan();
        return h;
    }public static double Function(){
        double x = 0;
        double f = 0;
        int i = 0;
        while (x<=DoteB()){
            x = DoteA()*i*StepH();
            if (Math.tan(x)==0){
                return x;
            }else {
                f = x / Math.tan(x);
                return f;
            }
        }
    return i++;}
}
