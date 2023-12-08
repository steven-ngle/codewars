package kyu4;

public class NextBiggerNumberWithTheSameDigits {

    public static long nextBiggerNumber(long n) {

        char[] s = String.valueOf(n).toCharArray();
        int i, j;

        for (i = s.length - 2; i >= 0; i--) {
            if (s[i] < s[i + 1]) {
                break;
            }
        }

        if (i < 0) {
            return -1;
        }

        for (j = s.length - 1; j > i; j--) {
            if (s[j] > s[i]) {
                break;
            }
        }

        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;

        for (int a = i + 1, b = s.length - 1; a < b; a++, b--) {
            temp = s[a];
            s[a] = s[b];
            s[b] = temp;
        }

        return Long.parseLong(new String(s));
    }
}
