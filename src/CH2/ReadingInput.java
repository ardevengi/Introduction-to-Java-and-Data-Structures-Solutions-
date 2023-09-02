package CH2;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        Scanner ReadingInput = new Scanner(System.in);
        double radius = ReadingInput.nextDouble();
        final double PI = 3.14;
        int i, j, k;
        i = j = k = 2;
        System.out.println(radius);
        System.out.println(i + j + k);
        byte x = (byte) i;
    }

}