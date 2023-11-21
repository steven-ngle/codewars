package kyu8;

import java.util.Iterator;
import java.util.List;

public class FilteringEvenNumbersBugFixes {

    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {

        Iterator<Integer> iterator = listOfNumbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
        return listOfNumbers;
    }
}

