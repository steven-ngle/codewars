package kyu6;

import java.util.ArrayList;
import java.util.HashMap;

public class DeleteOccurrencesOfAnElementIfItOccursMoreThanNTimes {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {

        HashMap<Integer, Integer> countMap = new HashMap<>();
        ArrayList<Integer> temp = new ArrayList<>();

        for (Integer num : elements) {
            int count = countMap.getOrDefault(num, 0);
            if (count < maxOccurrences) {
                temp.add(num);
                countMap.put(num, count + 1);
            }
        }

        int[] result = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            result[i] = temp.get(i);
        }

        return result;
    }
}
