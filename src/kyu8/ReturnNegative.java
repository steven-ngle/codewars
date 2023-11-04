package kyu8;

public class ReturnNegative {

    public static int makeNegative(final int x) {

        int i = 0;
        if (x > -1) {
            i = x *-1;
            return i;
        } else {
            return x;
        }
    }
}
