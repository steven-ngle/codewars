public class RemovingElements {

    public static Object[] removeEveryOther(Object[] arr) {

        Object[] result = new Object[(arr.length + 1 )/2];

        for (int i = 0, j = 0; i < arr.length; i += 2, j++) {
            result[j] = arr[i];
        }
        return result;
    }
}
