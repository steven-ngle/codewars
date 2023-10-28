package kyu8;

public class FakeBinary {

    public static void main(String[] args) {
        System.out.println(fakeBin("3149"));
    }

    public static String fakeBin(String numberString) {

        char[] ch = numberString.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] < '5') {
                ch[i] = '0';
            } else {
                ch[i] = '1';
            }
        }

        String res = new String(ch);
        return res;
    }
}
