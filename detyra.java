package ushtrime;
import java.text;

public class Detyra1{
     public static void main(String[] args) {
        
        Decimalformat a = new Decimalformat("0.00");
        integer km= integer.valueOf(args[0]);
        double x = Double.valueOf(args[1]);
        double miles = km * x;
        System.out.println(a.format(miles));

    }
}