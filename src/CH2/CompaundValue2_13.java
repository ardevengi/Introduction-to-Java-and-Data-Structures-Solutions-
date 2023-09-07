package CH2;

import java.util.Scanner;

public class CompaundValue2_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("monthley saved money and interest rate : ");

        Double monthleySavedMoney = input.nextDouble();
        Double intrestRate = input.nextDouble();
        intrestRate /= 100;

        Double monthleyRate = intrestRate / 12;

        Double month1 = monthleySavedMoney * (1 + monthleyRate);
        Double month2 = (monthleySavedMoney + month1) * (1 + monthleyRate);
        Double month3 = (monthleySavedMoney + month2) * (1 + monthleyRate);
        Double month4 = (monthleySavedMoney + month3) * (1 + monthleyRate);
        Double month5 = (monthleySavedMoney + month4) * (1 + monthleyRate);
        Double month6 = (monthleySavedMoney + month5) * (1 + monthleyRate);

        System.out.println();
        System.out.println(month1);
        System.out.println(month2);
        System.out.println(month3);
        System.out.println(month6);

    }
}
