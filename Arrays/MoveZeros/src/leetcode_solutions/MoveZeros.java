package leetcode_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Khushbu Kumari
 */
public class MoveZeros {
    /**
     * Given an integer array nums,
     * move all0's to the end of it while maintaining the relative order of the non-zero elements.
     * Note: that you must do this in-place without making a copy of the array.
     * https://leetcode.com/problems/move-zeroes/
     * @param nums Input Array
     */
    public static void moveZeroes(int[] nums) {
        if(nums == null) {
            return;
        }
        int reader;
        int writer = 0;

        for(reader = 0 ; reader < nums.length ; reader++) {
            if(nums[reader]!=0) {
                nums[writer++] = nums[reader];
            }
        }
        for(; writer<nums.length; writer++) {
            nums[writer] = 0;
        }
    }

    public static void main(String[] args) {
        List<int[]> testcases = new ArrayList<>();
        testcases.add(new int[]{0, 1, 0, 3, 12});
        testcases.add(new int[]{0, 1, 0, 5, 0, 5, 5, 0, 3, 12});
        testcases.add(new int[]{0});
        testcases.add(new int[0]);
        for(int[] testcase: testcases) {
            int[] input = Arrays.copyOf(testcase, testcase.length);
            moveZeroes(input);
            System.out.printf("Input is %s and Output = %s%n", Arrays.toString(testcase), Arrays.toString(input));
        }


    }
}
