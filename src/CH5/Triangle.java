package CH5;

/**
 * Triangle
 */
public class Triangle {

    public static void main(String[] args) {
        final int NUM = 4;
        for (int i = 0; i < NUM; i++) {

            for (int j = 0; j < NUM - i - 1; j++) {
                System.out.print("   ");
            }

            int n = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(n + "  ");
                n *= 3;
            }

            n /= 9;
            for (int j = 0; j < i; j++) {
                System.out.print(n + "  ");
                n /= 3;
            }
            System.out.println();

        }
    }

}