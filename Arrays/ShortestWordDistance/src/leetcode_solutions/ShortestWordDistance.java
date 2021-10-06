package leetcode_solutions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Khushbu Kumari
 */
public class ShortestWordDistance {
    /**
     * Given an array of stringswordsDictand two different strings that already exist in the array word1
     * and word2, return
     * the shortest distance between these two words in the list.
     * https://leetcode.com/problems/shortest-word-distance/
     * @param wordsDict Word Dictionary
     * @param word1 Word1
     * @param word2 Word2
     * @return shortest distance
     */
    public static int shortestDistance(String[] wordsDict, String word1, String word2) {
        if (wordsDict == null || wordsDict.length == 0 || word1 == null || word2 == null) {
            return 0;
        }

        int word1Index = -1;
        int word2Index = -1;
        int shortestDistance = wordsDict.length;
        for (int i = 0; i < wordsDict.length; i++) {
            if (wordsDict[i].equals(word1)) {
                word1Index = i;
            } else if (wordsDict[i].equals(word2)) {
                word2Index = i;
            }
            if (word1Index != -1 && word2Index != -1) {
                shortestDistance = Math.min(shortestDistance, Math.abs(word1Index - word2Index));
            }
        }
        return shortestDistance;
    }

    public static void main(String[] args) {
        List<ShortestDistInput> testcases = new ArrayList<>();
        testcases.add(new ShortestDistInput(new String[]{"practice", "makes", "perfect", "coding", "makes"}, "coding", "practice"));
        testcases.add(new ShortestDistInput(new String[]{"practice", "makes", "perfect", "coding", "makes"}, "makes", "coding"));
        testcases.add(new ShortestDistInput(new String[]{"aabb"}, "a", "b"));
        testcases.add(new ShortestDistInput(new String[]{""}, "", ""));
        testcases.add(new ShortestDistInput(new String[]{}, null, ""));
        for (ShortestDistInput testcase : testcases) {
            System.out.printf("wordsDict: %s, word1: %s, word2: %s and output = %s%n",
                    Arrays.toString(testcase.getWordsDict()),
                    testcase.getWord1(),
                    testcase.getWord2(),
                    shortestDistance(testcase.wordsDict, testcase.word1, testcase.word2));
        }
    }
}

