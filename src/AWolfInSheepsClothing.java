import java.util.Arrays;

public class AWolfInSheepsClothing {
    public static String warnTheSheep(String[] array) {

        int position = array.length - 1 - Arrays.asList(array).indexOf("wolf");

        if (position == 0) {
            return "Pls go away and stop eating my sheep";
        } else {
            return "Oi! Sheep number " + position + "! You are about to be eaten by a wolf!";
        }
    }
}
