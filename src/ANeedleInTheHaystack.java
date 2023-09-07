public class ANeedleInTheHaystack {

    public static String findNeedle(Object[] haystack) {

        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == null) {
                continue;
            }
            if (haystack[i].equals("needle")) {
                return "found the needle at position " + i;
            }
        }
        return "nothing found";
    }
}
