package CH3;

import java.util.Scanner;

public class PalindromeInt3_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter three digit number : ");
        int reverse = 0, y = input.nextInt(), x = y;
        reverse *= 10;
        reverse += x % 10;
        x /= 10;
        reverse *= 10;
        reverse += x % 10;
        x /= 10;
        reverse *= 10;
        reverse += x % 10;
        x /= 10;

        System.out.println(reverse);
        if (reverse == y) {
            System.out.println("palindrome");

        } else {
            System.out.println("NOT");

        }
    }
}
