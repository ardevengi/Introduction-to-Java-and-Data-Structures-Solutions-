package CH6;

public class Emirp6_27 {
    public static void main(String[] args) {
        int count = 0, i = 2;
        while (count < 120) {
            if (prime(i) && prime(reverse(i))) {
                count++;
                System.out.print(i + " ");
            }
            i++;
        }
    }

    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    public static boolean prime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
