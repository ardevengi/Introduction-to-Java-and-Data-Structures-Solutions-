package CH5;

public class PerfectNumber {

    public static void main(String[] args) {
        for (int i = 2; i < 100000; i++) {
            if (isItPerfect(i))
                System.out.println(i + " is a perfect number");

        }
    }

    public static boolean isItPerfect(int num) {

        int sum = 1;
        int sqrt = (int) Math.sqrt(num);

        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                sum += i;
                if (num / i != i)
                    sum += num / i;
            }
        }

        return sum == num;
    }

}
