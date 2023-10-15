package kyu7;

public class GrowthOfAPopulation {

    public static int nbYear(int p0, double percent, int aug, int p) {
        int counter = 0;
        int population = p0;

        while (population < p) {
            population = (int) (population + population * (percent / 100) + aug);
            counter++;
        }

        return counter;
    }
}
