public class L1SetAlarm {

    public static boolean setAlarm(boolean employed, boolean vacation) {

        if (employed && !vacation) {
            return true;
        } else {
            return false;
        }
    }
}
