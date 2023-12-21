package kyu8;

public class SentenceSmash {

    public static String smash(String... words) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word);
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}
