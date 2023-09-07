package CH2;

import java.util.Scanner;

public class DistanceOfTwoPoints2_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double x1 = input.nextDouble(), y1 = input.nextDouble();
        Double x2 = input.nextDouble(), y2 = input.nextDouble();

        double dis = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println(dis);
    }
}
