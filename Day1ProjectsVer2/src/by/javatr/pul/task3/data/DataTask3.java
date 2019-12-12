package by.javatr.pul.task3.data;

import by.javatr.pul.task3.scanner.DataScanner;

public class DataTask3{
    public static double Area(){
        double sideOfSquare = DataScanner.Side();
        double areaOfSquare = Math.pow(sideOfSquare,2);
        return areaOfSquare;
    }public static double RadiusOfCircle(){
        double radiusOfCircle = Area()/2;
        return radiusOfCircle;
    } public static double AreaOfSquareIn(){
        double areaOfSquareIn = 2* Math.pow(RadiusOfCircle(),2);
        return areaOfSquareIn;
    }public static double Dif(){
        double dif = Area() - AreaOfSquareIn();
        return dif;
    }


}
