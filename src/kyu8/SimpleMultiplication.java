package kyu8;

public class SimpleMultiplication {

    public static int simpleMultiplication(int n) {

        if (n % 2 == 0) {
            return n *= 8;
        } else {
            return n *= 9;
        }
    }
}
