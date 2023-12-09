package kyu7;

public class HighestAndLowest {

    public static String highAndLow(String numbers) {
        String[] numbersArray = numbers.split(" ");
        int max = Integer.parseInt(numbersArray[0]);
        int min = Integer.parseInt(numbersArray[0]);
        for (String number : numbersArray) {
            int currentNumber = Integer.parseInt(number);
            if (currentNumber > max) {
                max = currentNumber;
            }
            if (currentNumber < min) {
                min = currentNumber;
            }
        }
        return max + " " + min;
    }
}
