package CH2;

import java.util.Scanner;

public class CalculateTips2_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Subtotal and gratuity rate : ");

        double subtotal = input.nextDouble();
        double rate = input.nextDouble();
        rate /= 100;
        subtotal += subtotal * rate;

        System.out.println("total is " + subtotal);

    }
}
