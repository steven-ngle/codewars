package kyu7;

public class RegexpBasicsIsItALetter {
    public static boolean isLetter(String s) {

        return s.matches("[a-zA-Z]");
    }
}