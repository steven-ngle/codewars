package kyu7;

public class OddOrEven {

    public static String oddOrEven (int[] array) {

        int sum = 0;

        for (int i : array) {
            sum += i;
        }

        if (sum % 2 == 0) {
            return "even";
        }

        return "odd";
    }
}
