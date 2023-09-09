package kyu8;

public class HowGoodAreYouReally {

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {

        int avg = 0;

        for (int i = 0; i < classPoints.length; i++) {
            avg += classPoints[i];
        }

        avg /= classPoints.length;

        if (yourPoints > avg) {
            return true;
        } else {
            return false;
        }
    }
}
