package kyu6;

import java.util.HashMap;
import java.util.Map;

public class CountCharactersInYourString {

    public static Map<Character, Integer> count(String str) {

        Map<Character, Integer> hm = new HashMap<>();

        for (Character c : str.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        return hm;
    }
}
