package kyu7;

import java.util.ArrayList;
import java.util.List;

public class ListFiltering {

    public static List<Object> filterList(final List<Object> list) {

        List<Object> result = new ArrayList<>();

        for (Object o : list) {
            if (!(o instanceof String)) {
                result.add(o);
            }
        }

        return result;
    }
}
