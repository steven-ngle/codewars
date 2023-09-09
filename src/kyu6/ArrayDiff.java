package kyu6;

import java.util.ArrayList;
import java.util.List;

public class ArrayDiff {

    public static int[] arrayDiff(int[] a, int[] b) {

        List<Integer> result = new ArrayList<>();

        for (int num : a) {
            boolean shouldAdd = true;
            for (int val : b) {
                if (num == val) {
                    shouldAdd = false;
                    break;
                }
            }
            if (shouldAdd) {
                result.add(num);
            }
        }

        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }
}
