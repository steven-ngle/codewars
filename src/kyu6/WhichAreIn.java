package kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {
        List<String> result = new ArrayList<>();

        for (String str1 : array1) {
            for (String str2 : array2) {
                if (str2.contains(str1) && !result.contains(str1)) {
                    result.add(str1);
                }
            }
        }

        String[] resultArray = result.toArray(new String[0]);
        Arrays.sort(resultArray);

        return resultArray;
    }
}
