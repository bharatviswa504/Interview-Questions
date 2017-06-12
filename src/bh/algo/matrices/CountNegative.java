package bh.algo.matrices;

/**
 * Created by bharatviswanadham on 6/11/17.
 */

//Program to Count Negative Integers in Row/Column-Wise Sorted Matrix
//Considered matrix is n*n

public class CountNegative {

    public static void main(String args[]) throws Exception {
        int size = 3;
        int[][] matrix = new int[][]{{-3, -2, 1},
                {1, 0, 2},
                {2, 0, 3}};

        int negativeCount = countNegative(matrix, size);
        System.out.println("Negtaive numbers count: " + negativeCount);
    }

    public static int countNegative(final int matrix[][], final int size) {
        int negativeCount = 0;

        int row = 0;
        int col = size - 1;

        while (col >= 0 && row < size) {
            if (matrix[row][col] >= 0) {
                col--;
            } else {
                negativeCount += col + 1;
                row++;
            }
        }


        return negativeCount;
    }
}
