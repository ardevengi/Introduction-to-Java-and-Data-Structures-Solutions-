package CH5;

import java.util.*;

public class DecToHex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int decimal = input.nextInt();
        int tempDecimal = decimal;
        String hex = "";
        while (tempDecimal != 0) {
            int hexValue = tempDecimal % 16;

            char hexChar = (hexValue >= 0 && hexValue <= 9) ? (char) (hexValue + '0') : (char) (hexValue - 10 + 'A');

            hex += hexChar;
            tempDecimal /= 16;
        }
        System.out.println(decimal + " in deciaml is " + hex + " in hexdecimal");

    }

}