public class BeginnerSeries2Clock {

    public static int Past(int h, int m, int s) {
        int sum = 0;

        h = h * 60 * 60 * 1000;
        m = m * 60 * 1000;
        s *= 1000;

        sum = h + m + s;

        return sum;
    }
}
