package CH1;

public class PopulationProjection1_11 {
    public static void main(String[] args) {
        long currentPopulation = 312032486;

        long seconds = 365 * 60 * 60 * 24;

        long increaceInAYear = (seconds / 7) + (seconds / 45) - (seconds / 13);

        System.out.println("first year : " + (currentPopulation += increaceInAYear));
        System.out.println("second year : " + (currentPopulation += increaceInAYear));
        System.out.println("third year : " + (currentPopulation += increaceInAYear));
        System.out.println("forth year : " + (currentPopulation += increaceInAYear));
        System.out.println("fifth year : " + (currentPopulation += increaceInAYear));

    }
}
