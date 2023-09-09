package kyu8;

public class WillYouMakeIt {

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {

        double requiredFuel = distanceToPump / mpg;

        return fuelLeft >= requiredFuel;
    }
}
