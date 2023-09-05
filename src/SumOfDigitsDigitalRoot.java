public class SumOfDigitsDigitalRoot {

    public static int digital_root(int n) {
        int rest = 0;

        while (n > 9) {
            rest = n % 10;
            n /= 10;
            n += rest;
        }
        return n;
    }
}
