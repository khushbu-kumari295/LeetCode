package leetcode_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Khushbu Kumari
 */
public class RotateImage {
    static void transposeMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    static void reverseRows(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++)
            for (int j = 0, k = matrix[0].length - 1;
                 j < k; j++, k--) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
            }
    }

    /**
     * You are given an n x n 2D matrix
     * representing an image,
     * rotate the image by 90 degrees (clockwise).
     * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
     * DO NOT allocate another 2D matrix and do the rotation.
     * https://leetcode.com/problems/rotate-image/
     *
     * @param matrix Input Matrix
     */
    static void rotateClockwise90(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }
        transposeMatrix(matrix);
        reverseRows(matrix);
    }

    static String toString(int[][] matrix) {
        String[] results = new String[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            results[i] = Arrays.toString(matrix[i]);
        }
        return "[" + String.join(", ", results) + "]";
    }

    public static void main(String[] args) {
        List<int[][]> testcases = new ArrayList<>();
        testcases.add(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        testcases.add(new int[][]{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}});
        testcases.add(new int[][]{{1}});
        testcases.add(new int[][]{{1, 2}, {3, 4}});
        testcases.add(new int[][]{});
        for (int[][] testcase : testcases) {
            System.out.println("input:" + toString(testcase));
            rotateClockwise90(testcase);
            System.out.println("output" + toString(testcase));
        }
    }

}
