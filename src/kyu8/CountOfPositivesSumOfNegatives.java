package kyu8;

public class CountOfPositivesSumOfNegatives {

    public static int[] countPositivesSumNegatives(int[] input) {

        int[] arr = new int[2];
        int pos = 0;
        int neg = 0;

        if (input == null || input.length == 0) {
            return new int[]{};
        }

        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                pos++;
            } else {
                neg += input[i];
            }
        }

        arr[0] = pos;
        arr[1] = neg;

        return arr;
    }
}
