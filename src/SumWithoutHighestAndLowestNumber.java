import java.util.Arrays;

public class SumWithoutHighestAndLowestNumber {

    public static int sum(int[] numbers) {

        if (numbers == null) {
            return 0;
        }

        int sum = 0;
        Arrays.sort(numbers);

        for (int i = 1; i < numbers.length - 1; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
