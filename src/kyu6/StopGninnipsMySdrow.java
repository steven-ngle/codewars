package kyu6;

public class StopGninnipsMySdrow {

    public String spinWords(String sentence) {

        String[] sentences = sentence.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String s : sentences) {
            if (s.length() >= 5) {
                String reverse = new StringBuffer(s).reverse().toString();
                sb.append(reverse);
            } else {
                sb.append(s);
            }
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}
