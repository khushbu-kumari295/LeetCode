package leetcode_solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Author: Khushbu Kumari
 */
public class IsomorphicString {
    /**
     * Given two strings s and t,determine if they are isomorphic.
     * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
     * All occurrences of a character must be replaced with another character while preserving the order of characters.
     * No two characters may map to the same character, but a character may map to itself.
     * https://leetcode.com/problems/isomorphic-strings/
     *
     * @param s First String
     * @param t Second String
     * @return Boolean indicating whether they are isomorphic or not
     */
    public static boolean isIsomorphic(String s, String t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> sToT = new HashMap<>();
        HashMap<Character, Character> tToS = new HashMap<>();
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        for (int i = 0; i < s1.length; i++) {
            if (!sToT.containsKey(s1[i]) && !tToS.containsKey(t1[i])) {
                sToT.put(s1[i], t1[i]);
                tToS.put(t1[i], s1[i]);
            }
            if (!sToT.containsKey(s1[i]) || !tToS.containsKey(t1[i])
                    || !(t1[i] == sToT.get(s1[i])
                    && tToS.get(t1[i]) == s1[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        List<String[]> testcases = new ArrayList<>();
        testcases.add(new String[]{"egg", "add"});
        testcases.add(new String[]{"foo", "bar"});
        testcases.add(new String[]{"paper", "title"});
        testcases.add(new String[]{"baba", "daba"});
        testcases.add(new String[]{"", null});
        testcases.add(new String[]{null, null});

        for (String[] testcase : testcases) {
            System.out.printf("input s = %s and t = %s, Output= %s \n", testcase[0], testcase[1], isIsomorphic(testcase[0], testcase[1]));
        }

    }

}
