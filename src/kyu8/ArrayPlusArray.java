package kyu8;

public class ArrayPlusArray {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {

        int sum1 = 0;
        int sum2 = 0;

        for (int i : arr1) {
            sum1 += i;
        }

        for (int i : arr2) {
            sum2 += i;
        }

        return sum1 + sum2;
    }
}
