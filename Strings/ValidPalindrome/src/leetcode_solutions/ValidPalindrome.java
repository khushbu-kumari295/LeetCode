package leetcode_solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Author name: Khushbu Kumari
 */
public class ValidPalindrome {
    /**
     * Given a strings, determine if it is a palindrome,
     * considering only alphanumeric characters and ignoring cases.
     * https://leetcode.com/problems/valid-palindrome/
     * @param s input
     * @return is palindrome true or false
     */
    public static boolean validatePalindrome(String s) {
        if( s == null) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currentCharacter = s.charAt(i);

            if (Character.isDigit(currentCharacter) || Character.isAlphabetic(currentCharacter)) {
                sb.append(currentCharacter);
            }
        }
        String toCheck = sb.toString().toLowerCase();
        for(int i=0, j= toCheck.length()-1; i<=j; i++,j-- ) {
            if(toCheck.charAt(i) != toCheck.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<String> testcases = new ArrayList<>();
        testcases.add("A man, a plan, a canal: Panama");
        testcases.add("race a car");
        testcases.add("");
        testcases.add(null);
        for( String testcase : testcases) {
            System.out.printf("Input: %s, Is palindrome: %s%n",
                    testcase,
                    validatePalindrome(testcase));
        }

    }

}