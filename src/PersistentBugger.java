public class PersistentBugger {

    public static int persistence(long n) {

        int count = 0;

        while(n >= 10) {
            int m = 1;

            while (n > 0) {
                m *= (n % 10);
                n /= 10;
            }
            n = m;
            count += 1;
        }
        return count;
    }
}
