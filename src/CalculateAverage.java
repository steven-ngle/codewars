public class CalculateAverage {

    public static double find_average(int[] array){

        double avg = 0;

        if (array.length == 0) {
            return avg;
        } else {
            for (int i = 0; i < array.length; i++) {
                avg += array[i];
            }
            avg /= array.length;
            return avg;
        }
    }
}
