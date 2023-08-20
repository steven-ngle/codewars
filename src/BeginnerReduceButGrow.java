public class BeginnerReduceButGrow {

    public static int grow(int[] x){

        int prod = 1;

        for (int i = 0; i < x.length; i++) {
            prod *= x[i];
        }
        return prod;
    }
}
