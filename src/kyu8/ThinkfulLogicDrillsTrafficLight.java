package kyu8;

public class ThinkfulLogicDrillsTrafficLight {

    public static String updateLight(String current) {

        switch(current) {
            case "green":
                return "yellow";
            case "yellow":
                return "red";
            case "red":
                return "green";
        }
        return "";
    }
}
