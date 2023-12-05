package kyu7;

import java.util.HashSet;

public class Isograms {

    public static boolean  isIsogram(String str) {

        if (str == null || str.isEmpty()) {
            return true;
        }

        str = str.toLowerCase();
        HashSet<Character> set = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if (set.contains(c)) {
                    return false;
                }
                set.add(c);
            }
        }

        return true;
    }
}
