package leetcode_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Khushbu Kumari
 */
public class TransposeMatrix {

    /**
     * Transpose a matrix
     * @param matrix Source Matrix
     * @return Transposed Matrix
     */
    public static int[][] transpose(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return null;
        }
        int colLength = matrix[0].length;
        int[][] resultMatrix = new int[colLength][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < colLength; j++) {
                resultMatrix[j][i] = matrix[i][j];
            }
        }
        return resultMatrix;
    }

    /**
     * Help print the String representation of a Matrix
     * @param matrix Source matrix
     * @return String representation
     */
    static String toString(int [][]matrix) {
        if (matrix == null) {
            return "[]";
        }
        String[] results = new String[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            results[i] = Arrays.toString(matrix[i]);
        }
        return "[" + String.join(", ", results) + "]";
    }

    public static void main(String[] args) {
        List<int[][]> testcases = new ArrayList<>();
        testcases.add(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        testcases.add(new int[][]{{1,2,3},{4,5,6}});
        testcases.add(new int[][]{});
        for (int[][] testcase : testcases) {
            System.out.println("input:" + toString(testcase));
            int[][] resultMatrix = transpose(testcase);
            System.out.println("output" + toString(resultMatrix));
        }
    }
}

