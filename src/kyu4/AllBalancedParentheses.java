package kyu4;

import java.util.ArrayList;
import java.util.List;

public class AllBalancedParentheses {

    public static List<String> balancedParens(int n) {
        List<String> result = new ArrayList<>();
        generateParentheses(result, "", n, n);
        return result;
    }

    private static void generateParentheses(List<String> result, String current, int open, int close) {
        if (open == 0 && close == 0) {
            result.add(current);
            return;
        }

        if (open > 0) {
            generateParentheses(result, current + "(", open - 1, close);
        }

        if (close > open) {
            generateParentheses(result, current + ")", open, close - 1);
        }
    }
}
