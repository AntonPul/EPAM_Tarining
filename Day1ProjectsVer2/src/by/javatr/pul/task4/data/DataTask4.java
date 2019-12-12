package by.javatr.pul.task4.data;

import by.javatr.pul.task4.scanner.ScannerTask4;

public class DataTask4 {
    public static int Number(){
        int a = ScannerTask4.Number();
    return a;}
        public static int SecondNumber(){
        int b = ScannerTask4.Number();
    return b;}
        public static int ThirdNumber(){
        int c = ScannerTask4.Number();
    return c;}
    public static int FourNumber(){
        int d = ScannerTask4.Number();
        return d;
    }public static boolean EvenNumber(){
        boolean x = (Number()%2==0 | SecondNumber()%2==0 & ThirdNumber()%2==0 | FourNumber()%2==0);
        return x;
    }
}
