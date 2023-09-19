package CH3;

import java.util.Scanner;

public class SortThreeDigits3_8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int temp, x1 = input.nextInt(), x2 = input.nextInt(), x3 = input.nextInt();
        if (x1 > x2) {
            temp = x1;
            x1 = x2;
            x2 = temp;
        }
        if (x2 > x3) {
            temp = x3;
            x3 = x2;
            x2 = temp;
        }
        if (x1 > x2) {
            temp = x1;
            x1 = x2;
            x2 = temp;
        }
        System.out.println(x1 + " " + x2 + " " + x3);
    }

}
