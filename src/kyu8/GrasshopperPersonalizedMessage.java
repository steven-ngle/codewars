package kyu8;

public class GrasshopperPersonalizedMessage {

    public static String greet(String name, String owner) {

        if (name.equals(owner)) {
            return "Hello boss";
        } else {
            return "Hello guest";
        }
    }
}
