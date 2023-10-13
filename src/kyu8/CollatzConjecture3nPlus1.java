package kyu8;

public class CollatzConjecture3nPlus1 {

    public static int hotpo(int n) {

        int counter = 0;

        while (n != 1) {

            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }

            counter++;
        }

        return counter;
    }
}
