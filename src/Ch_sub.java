import java.util.Scanner;

public class Ch_sub {
    public static void main(String[] args) {
        // CH 1
        System.out.println("Hello java");

        // CH 2
        Scanner inputScanner = new Scanner(System.in);
        // int age = inputScanner.nextInt();
        int age = 19;
        System.out.println("age = " + age);

        // CH 3
        if (age <= 18)
            System.out.println("too young");
        else if (age > 18)
            System.out.println("OK ");
        int rand = (int) (1 + Math.random() * 20);
        System.out.println(rand);

        // CH 7
        double d[] = new double[30];
        double[] b = new double[30];
        char c[] = new char[40];
        char x[] = { '2', '3' };
        name(4.5, 4, 5, 7, 8);
    }

    public static void name(double x, int... nums) {

    }
}