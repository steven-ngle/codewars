public class PersistentBugger {
// muss noch geändert werden
    public static void main(String[] args) {
        System.out.println(persistence(999));
    }

    public static int persistence(long n) {
        int num = (int)n;
        int rest = 0;
        int count = 0;

        while (num > 9) {
            rest = num % 10;
            num /= 10;
            num *= rest;
            count++;
        }
        return count;
    }
}
