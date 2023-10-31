package kyu6;

public class BreakCamelCase {

    public static String camelCase(String input) {

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c) && i > 0) {
                res.append(" ");
            }

            res.append(c);
        }

        return res.toString();
    }
}
