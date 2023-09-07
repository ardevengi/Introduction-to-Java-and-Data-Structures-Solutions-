package CH3;

import java.util.Scanner;

public class SolveQuadraticEquation3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();
        Double r1 = (-b + Math.pow(((b * b) - (4 * a * c)), 0.5));
        Double r2 = (-b - Math.pow(((b * b) - (4 * a * c)), 0.5));

        if (((b * b) - 4 * a * c) > 0) {
            System.out.println("2 roots : " + r1 + " " + r2);
        } else if (((b * b) - 4 * a * c) == 0) {
            System.out.println("1 roots : " + r1);
        } else {
            System.out.println("0 roots : ");
        }
    }
}
