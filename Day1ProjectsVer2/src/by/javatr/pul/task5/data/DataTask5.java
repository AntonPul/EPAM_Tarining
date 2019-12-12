package by.javatr.pul.task5.data;


import by.javatr.pul.task5.scanner.ScannerTask5;

public class DataTask5 {
    public static int PerfectNumber() {
        int p = ScannerTask5.DataScanner();
        if (sum(p)) {
            return PerfectNumber();
        } else {
            return p;
        }
    }

    static boolean sum(int n) {
        int summa = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) summa += i;
        }
        if (summa == n) return true;
        else return false;
    }
}
