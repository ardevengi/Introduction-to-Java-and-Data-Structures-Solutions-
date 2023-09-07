package CH2;

import java.util.Scanner;

public class ConvertMilesToKilo2_1 {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter Miles : ");

        Double miles = inputScanner.nextDouble();
        Double kilo = miles * 1.6;

        System.out.println(miles + " miles is " + kilo + " kilos");
    }
}
