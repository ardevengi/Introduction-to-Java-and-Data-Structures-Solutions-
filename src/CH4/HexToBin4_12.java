package CH4;

import java.util.Scanner;

public class HexToBin4_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String hex = input.nextLine();
        char c = hex.charAt(0);
        int dec = Integer.parseInt(hex);
        System.out.println(c);
    }
}
