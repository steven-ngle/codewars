package kyu8;

public class GrasshopperArrayMean {

    public static int findAverage(int[] nums) {

        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        return sum / nums.length;
    }
}
