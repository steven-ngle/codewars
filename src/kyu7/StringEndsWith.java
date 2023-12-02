package kyu7;

public class StringEndsWith {

    public static boolean solution(String str, String ending) {

        if (str.length() < ending.length()) {
            return false;
        }

        int index = str.length() - ending.length();

        for (int i = 0; i < ending.length(); i++) {
            if (str.charAt(index + i) != ending.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
