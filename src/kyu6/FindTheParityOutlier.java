package kyu6;

public class FindTheParityOutlier {

    public static int find(int[] integers) {

        int oddCount = 0;
        int evenCount = 0;
        int odd = 0;
        int even = 0;

        for (int num : integers) {
            if (num % 2 == 0) {
                evenCount++;
                even = num;
            } else {
                oddCount++;
                odd = num;
            }

            if (evenCount > 0 && oddCount > 0) {
                if (evenCount > 1) {
                    return odd;
                } else if (oddCount > 1) {
                    return even;
                }
            }
        }

        if (evenCount > 1) {
            return odd;
        } else {
            return even;
        }
    }
}
