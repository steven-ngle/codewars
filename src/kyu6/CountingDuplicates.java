package kyu6;

import java.util.HashMap;

public class CountingDuplicates {

    public static int duplicateCount(String text) {

        text = text.toLowerCase();
        int counter = 0;
        HashMap<Character, Integer> hm = new HashMap<>();

        for (char c : text.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
            if (hm.get(c) == 2) {
                counter++;
            }
        }

        return counter;
    }
}
