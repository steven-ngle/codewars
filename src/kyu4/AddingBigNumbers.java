package kyu4;

public class AddingBigNumbers {

    public static String add(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            sb.append(sum % 10);
            carry = sum / 10;
        }

        String result = sb.reverse().toString();
        return result.replaceFirst("^0+", "");
    }
}
