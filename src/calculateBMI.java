public class calculateBMI {

    public static void main(String[] args) {
        System.out.println(bmi(80, 1.80));
    }
    public static String bmi(double weight, double height) {

        double i = weight / (height * height);

        if (i <= 18.5) {
            return "Underweight";
        } else if (i <= 25.0) {
            return "Normal";
        } else if (i <= 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
