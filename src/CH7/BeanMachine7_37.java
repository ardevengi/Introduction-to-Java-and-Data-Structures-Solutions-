package CH7;

import java.util.Scanner;

public class BeanMachine7_37 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("enter numbers of balls and number of slots : ");
        int balls = iScanner.nextInt(), slotts = iScanner.nextInt();
        int dir = slotts - 1;
        int places[] = new int[balls], table[][] = new int[balls][slotts];

        String dirictions[] = new String[balls];

        for (int i = 0; i < balls; i++) {
            dirictions[i] = "";
        }

        for (int i = 0; i < balls; i++) {
            int place = 0;
            for (int j = 0; j < dir; j++) {
                int d = (int) (Math.random() * 2);
                if (d == 1) {
                    dirictions[i] += "R";
                    place++;
                } else
                    dirictions[i] += "L";

            }
            System.out.println(dirictions[i]);
            places[i] = place - 1;
        }

        for (int i = balls - 1; i >= 0; i--) {
            for (int j = 0; j < slotts; j++) {
                for (int k = 0; k < balls; k++) {
                    if (j == places[k] && places[k] != -1 && table[i][j] == 0) {
                        table[i][j] = 1;
                        places[k] = -1;
                    }

                }
            }

        }

        for (int i = 0; i < balls; i++) {
            for (int j = 0; j < slotts; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }

    }
}
