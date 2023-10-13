package kyu7;

public class NumberOfDecimalDigits {

    public static int Digits(long n) {

        int counter = 1;

        while (n > 9) {
            n /= 10;
            counter++;
        }

        return counter;
    }
}
