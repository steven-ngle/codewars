package kyu7;

public class FindTheStrayNumber {

    public static int stray(int[] numbers) {

        for (int i = 0; i < numbers.length - 2; i++) {
            if (numbers[i] != numbers[i + 1] && numbers[i] != numbers[i + 2]) {
                return numbers[i];
            }
        }
        return numbers[numbers.length - 1];
    }
}
