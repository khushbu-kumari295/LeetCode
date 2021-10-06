package leetcode_solutions;

import java.util.*;

/**
 * Author name: Khushbu Kumari
 */
public class AddStrings {

    /**
     * Given two non-negative integers,num1 and num2 represented as string,
     * return the sum of num1 and num2 as a string.
     * You must solve the problem without using any built-in library for handling large integers (such asBigInteger).
     * You must also not convert the inputs to integers directly.
     * https://leetcode.com/problems/add-strings/
     * @param num1 in String
     * @param num2 in String
     * @return sum of num1 and num2 in String
     */
    public static String addStrings(String num1, String num2) {
        if (num1 == null && num2 == null) {
            return null;
        }
        if (num1 == null) {
            return num2;
        } else if (num2 == null) {
            return num1;
        }

        StringBuilder sb = new StringBuilder();
        String s1 = num1.length() > num2.length() ? num1 : num2;
        String s2 = num1.length() > num2.length() ? num2 : num1;

        int lengthOfData = s1.length() - s2.length();
        sb.append("0".repeat(lengthOfData));
        sb.append(s2);
        s2 = sb.toString();
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        for (int i = s1.length() - 1; i >= 0; i--) {
            int sum = (s1.charAt(i) - '0') + (s2.charAt(i) - '0') + carry;
            ans.append((char) (sum % 10 + '0'));
            carry = sum / 10;
        }
        if (carry > 0) {
            ans.append((char) (carry + '0'));
        }
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        // write your code here
        List<List<String>> testcases = new ArrayList<>();
        testcases.add(Arrays.asList("11", "123"));
        testcases.add(Arrays.asList("456", "77"));
        testcases.add(Arrays.asList("456999", "0"));
        testcases.add(Arrays.asList("456998234834738478374837483748374837827392849824982974928429", "2"));
        testcases.add(Arrays.asList("0", "0"));
        testcases.add(Arrays.asList(null, null));
        testcases.add(Arrays.asList("0", null));
        testcases.add(Arrays.asList(null, "0"));

        for (List<String> testcase : testcases) {
            System.out.printf("Sum of %s and %s is %s%n",
                    testcase.get(0),
                    testcase.get(1),
                    addStrings(testcase.get(0), testcase.get(1))
            );
        }

    }
}
