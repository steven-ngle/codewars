public class CountByX {

    public static int[] countBy(int x, int n){

        int[] arr = new int[n];
        arr[0] = x;

        for (int i = 1; i < n; i++) {
            arr[i] = x * (i+1);
        }

        return arr;
    }
}
