package leetcode_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Author: Khushbu Kumari
 */

public class ReverseWordsInAString {
    /**
     * Given an input strings, reverse the order of the words.
     * A word is defined as a sequence of non-space characters.
     * The words in s will be separated by at least one space.
     * Return a string of the words in reverse order concatenated by a single space.
     * https://leetcode.com/problems/valid-palindrome/
     *
     * @param str Source words
     * @return reverse words
     */
    public static String reverseWords(String str) {
        if (str == null) {
            return null;
        }
        String s = str.trim();
        String[] arr = Arrays.stream(s.split(" ")).filter(s1 -> !s1.isEmpty()).toArray(String[]::new);
        Collections.reverse(Arrays.asList(arr));
        return String.join(" ", arr);
    }

    public static void main(String[] args) {
        List<String> testcases = new ArrayList<>();
        testcases.add("the sky is blue");
        testcases.add("  hello world  ");
        testcases.add("a good   example");
        testcases.add("  Bob    Loves  Alice   ");
        testcases.add("Alice does not even like bob");
        testcases.add("");
        testcases.add(null);
        for (String testcase : testcases) {
            System.out.printf("Input: %s, Reverse Word in String is: %s%n",
                    testcase,
                    reverseWords(testcase)
            );
        }
    }
}
