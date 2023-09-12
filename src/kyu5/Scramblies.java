package kyu5;

import java.util.HashMap;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {

        int[] count = new int[26];

        for (char c : str1.toCharArray()) {
            int index = c - 'a';
            count[index]++;
        }

        for (char c : str2.toCharArray()) {
            int index = c - 'a';
            if (count[index] == 0) {
                return false;
            }
            count[index]--;
        }

        return true;
    }
}
