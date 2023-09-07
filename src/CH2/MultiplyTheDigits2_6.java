package CH2;

import java.util.Scanner;

public class MultiplyTheDigits2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number from 0 to 1000 : ");
        int number = input.nextInt();

        int sum = 1;

        sum *= (number % 10) | 1;
        number /= 10;
        sum *= (number % 10) | 1;
        number /= 10;
        sum *= (number % 10) | 1;
        number /= 10;
        System.out.println(sum);

    }
}
