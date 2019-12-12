package by.javatr.pul.task7.data;

import by.javatr.pul.task7.scanner.ScannerTask7;

public class DataTask7 {
    public static double CoordinateX1() {
        double x1 = ScannerTask7.DataScan();
        return x1;
    }

    public static double CoordinateX2() {
        double x2 = ScannerTask7.DataScan();
        return x2;
    }

    public static double CoordinateY1() {
        double y1 = ScannerTask7.DataScan();
        return y1;
    }

    public static double CoordinateY2() {
        double y2 = ScannerTask7.DataScan();
        return y2;
    }

    public static boolean Coordinates() {

        if (CoordinateX1() - CoordinateX2() <= CoordinateY1() - CoordinateY2()) {
            return true;
        } else {
            if (CoordinateX1() - CoordinateX2() >= CoordinateY1() - CoordinateY2()) {
                return false;
            }
        }
    return Coordinates();
    }
}
