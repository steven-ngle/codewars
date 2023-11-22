package kyu7;

public class ReverseWords {

    public static String reverseWords(final String original) {

        if (original.trim().isEmpty()) {
            return original;
        }

        String[] words = original.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (String word : words) {
            reversed.append(new StringBuilder(word).reverse().toString()).append(" ");
        }

        return reversed.toString().trim();
    }
}
