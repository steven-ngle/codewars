package kyu4;

public class SumOfIntervals {

    public static int sumIntervals(int[][] intervals) {

        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        for (int i = 0; i < intervals.length; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[i][0] > intervals[j][0]) {
                    int[] temp = intervals[i];
                    intervals[i] = intervals[j];
                    intervals[j] = temp;
                }
            }
        }

        int sum = 0;
        int[] currentInterval = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= currentInterval[1]) {
                if (currentInterval[1] < intervals[i][1]) {
                    currentInterval[1] = intervals[i][1];
                }
            } else {
                sum += currentInterval[1] - currentInterval[0];
                currentInterval = intervals[i];
            }
        }

        sum += currentInterval[1] - currentInterval[0];

        return sum;
    }
}
