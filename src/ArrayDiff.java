import java.util.Arrays;

public class ArrayDiff {
// tbd

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int[] {1,2}, new int[] {1}))); // {2}
        System.out.println(Arrays.toString(arrayDiff(new int[] {1,2,2}, new int[] {1}))); // {2,2}
        System.out.println(Arrays.toString(arrayDiff(new int[] {1,2,2}, new int[] {2}))); // {1}
        System.out.println(Arrays.toString(arrayDiff(new int[] {1,2,2}, new int[] {}))); // {1,2,2}
        System.out.println(Arrays.toString(arrayDiff(new int[] {}, new int[] {1,2}))); // {}
    }
    public static int[] arrayDiff(int[] a, int[] b) {

        int[] arr = new int[];

        return arr;
    }
}
