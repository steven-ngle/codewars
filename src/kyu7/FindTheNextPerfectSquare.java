package kyu7;

public class FindTheNextPerfectSquare {

    public static long findNextSquare(long sq) {

        for (long l = 0; l < 1000000; l++) {
            if (l * l == sq) {
                return (l + 1) * (l + 1);
            }
        }
        return -1;
    }
}
