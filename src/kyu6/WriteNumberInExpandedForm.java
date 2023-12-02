package kyu6;

public class WriteNumberInExpandedForm {

    public static String expandedForm(int num) {

        String number = String.valueOf(num);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) != 0) {
                if (!result.isEmpty()) {
                    result.append(" + ");
                }
                int digit = Character.getNumericValue(number.charAt(i));
                digit *= (int) Math.pow(10, number.length() - i - 1);
                result.append(digit);
            }
        }

        return result.toString();
    }
}
