public class BeginnerSeriesSumOfNumbers {

// #3
    public int GetSum(int a, int b) {

        int sum = 0;

        if (a == b) {
            return a;
        }

        if (a < b) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        } else {
            for (int i = b; i <= a; i++) {
                sum += i;
            }
        }
        return sum;
    }
}
