package kyu6;

import java.util.ArrayList;
import java.util.List;

public class CountTheSmileyFaces {

    public static int countSmileys(List<String> arr) {

        int counter = 0;
        String eyes = ":;";
        String nose = "-~";
        String mouth = ")D";

        for (String s : arr) {
            if (s.length() == 2 || s.length() == 3) {
                if (eyes.contains(Character.toString(s.charAt(0))) &&
                        mouth.contains(Character.toString(s.charAt(s.length() - 1)))) {
                    if (s.length() == 3 && !nose.contains(Character.toString(s.charAt(1)))) {
                        continue;
                    }
                    counter++;
                }
            }
        }

        return counter;
    }
}
