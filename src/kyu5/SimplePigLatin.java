package kyu5;

public class SimplePigLatin {

    public static String pigIt(String str) {

        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) {
                sb.append(word.substring(1));
                sb.append(word.substring(0, 1));
                sb.append("ay ");
            } else {
                sb.append(word);
                sb.append(" ");
            }
        }

        return sb.toString().trim();
    }
}
