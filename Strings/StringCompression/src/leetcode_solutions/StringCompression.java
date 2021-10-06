package leetcode_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Khushbu Kumari
 */
public class StringCompression {

    /**
     * Given an array of characters chars,
     * compress it using the following algorithm:Begin with an empty strings.
     * For each group of consecutive repeating characters in chars:
     * • If the group's length is1, append the character tos.
     * • Otherwise, append the character followed by the group's length.
     * The compressed strings should not be returned separately, but instead,
     * be stored in the input character array chars.
     * Note that group lengths that are10or longer will be split into multiple characters in chars.After you are done
     * modifying the input array, return the new length of the array.
     * You must write an algorithm that uses only constant extra space.
     * https://leetcode.com/problems/string-compression/
     *
     * @param chars Characater Array
     * @return compreesed Array length
     */
    public static int compress(char[] chars) {
        int readPointer = 0;
        int writePointer = 0;
        if (chars == null) {
            return 0;
        }

        while (readPointer < chars.length) {
            char currentCharacterFound = chars[readPointer];
            int counter = 0;
            while (readPointer < chars.length && currentCharacterFound == chars[readPointer]) {
                readPointer++;
                counter++;
            }
            chars[writePointer++] = currentCharacterFound;
            if (counter > 1) {
                for (char value : String.valueOf(counter).toCharArray()) {
                    chars[writePointer++] = value;
                }
            }
        }
        return writePointer;
    }

    public static void main(String[] args) {
        List<char[]> testcases = new ArrayList<>();
        testcases.add(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'});
        testcases.add(new char[]{'a'});
        testcases.add(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'});
        testcases.add(new char[]{'a', 'a', 'a', 'b', 'b', 'a', 'a'});
        testcases.add(new char[]{});

        for (char[] testcase : testcases) {
            System.out.printf("Input: %s, ", Arrays.toString(testcase));
            int resultLength = compress(testcase);
            System.out.printf("Compressed String length is %s, output is: %s%n",
                    resultLength, Arrays.toString(Arrays.copyOf(testcase, resultLength))
            );

        }
    }

}
