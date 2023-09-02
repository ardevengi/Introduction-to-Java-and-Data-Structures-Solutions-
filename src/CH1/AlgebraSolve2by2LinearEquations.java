package CH1;

public class AlgebraSolve2by2LinearEquations {
    public static void main(String[] args) {
        System.out.println("eq1: 3.4x + 50.2y = 44.5");
        System.out.println("eq2: 2.1x + 0.55y = 5.9");

        double x = ((44.5 * .55 - 50.2 * 5.9) / (3.4 * .55 - 50.2 * 2.1));
        double y = ((3.4 * 5.9 - 44.5 * 2.1) / (3.4 * .55 - 50.2 * 2.1));

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
