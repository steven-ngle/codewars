import java.util.Arrays;

public class FindTheUniqueNumber {

    public static double findUniq(double arr[]) {

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[0] != arr[1]) {
                return arr[0];
            } else {
                return arr[arr.length - 1];
            }
        }
        return arr[0];
    }
}
