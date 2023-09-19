package CH5;

public class Bits {
    public static void main(String[] args) {
        final int NUM = 5;
        for (int i = 7; i >= 0; i--) {
            System.out.print((NUM >> i) + " ");
            System.out.println((NUM >> i) & 1);
        }
        for (int i = 7; i >= 0; i--) {
            int bit = (NUM >> i) & 1;
            System.out.print(bit);
        }
    }
}
