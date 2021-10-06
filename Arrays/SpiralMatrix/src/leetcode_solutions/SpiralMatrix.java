package leetcode_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Khushbu Kumari
 */
public class SpiralMatrix {

    /**
     * Given anm x nmatrix, return all elements of the matrix in spiral order.
     * https://leetcode.com/problems/spiral-matrix/
     * @param matrix Input Matrix
     * @return Spiral Order
     */
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> resultList = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return resultList;
        }
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        int rowMax = rowCount;
        int colMax = colCount;
        int rowMin = 1;
        int colMin = 0;
        int row = 0, col = 0;
        while (colMax > colMin && rowMax >= rowMin) {
            // traverse left to right
            for (; col < colMax; col++) {
                resultList.add(matrix[row][col]);
            }

            //traverse downward
            col--;
            row++;
            for (; row < rowMax; row++) {
                resultList.add(matrix[row][col]);
            }
            //traverse left
            row--;
            col--;
            if (rowMin < rowMax) {
                for (; col >= colMin; col--) {
                    resultList.add(matrix[row][col]);
                }
            }
            //traverse upward
            col++;
            row--;
            if (colMin < colMax - 1) {
                for (; row >= rowMin; row--) {
                    resultList.add(matrix[row][col]);
                }
            }
            row++;
            col++;


            colMax--;
            rowMax--;
            colMin++;
            rowMin++;
        }
        return resultList;
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
        testcases.add(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}});
        testcases.add(new int[][]{{1}});
        testcases.add(new int[][]{{1, 2}, {3, 4}});
        testcases.add(new int[][]{});
        for (int[][] testcase : testcases) {
            System.out.println("input:" + toString(testcase));
            System.out.println("output" + spiralOrder(testcase));
        }
    }
}
