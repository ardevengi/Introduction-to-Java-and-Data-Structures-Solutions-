package CH5;

public class DisplayPatterns5_18 {
    public static void main(String[] args) {
        final int N = 6;

        System.out.println("Pattern A");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Pattern B");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Pattern C");
        int spaces = N * 2;
        for (int i = 0; i < N; i++) {
            for (int k = i; k < spaces - i - 2; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Pattern D");
        for (int i = 0; i < N; i++) {
            for (int k = spaces - i * 2; k < spaces; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < N - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
