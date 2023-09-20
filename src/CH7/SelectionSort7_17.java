package CH7;

import java.util.Scanner;

public class SelectionSort7_17 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        System.out.println("Number of students : ");
        int n = iScanner.nextInt();

        String names[] = new String[n];
        int socres[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Name Score");
            names[i] = iScanner.next();
            socres[i] = iScanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " : " + socres[i]);
        }
        sortStudents(socres, names);
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " : " + socres[i]);
        }

    }

    public static void sortStudents(int[] scores, String[] names) {
        for (int i = 0; i < scores.length; i++) {

            for (int j = i + 1; j < scores.length; j++) {
                if (scores[i] < scores[j]) {
                    int temp = scores[i];
                    scores[i] = scores[j];
                    scores[j] = temp;

                    String name = names[i];
                    names[i] = names[j];
                    names[j] = name;
                }
            }
        }
    }
}
