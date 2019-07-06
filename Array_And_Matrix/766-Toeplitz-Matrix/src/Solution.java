/**
 * @author Dell
 * @create 2019-06-25 19:18
 */
public class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            if (!check(matrix, matrix[0][i], 0, i))
                return false;
        }

        for (int i = 1; i < matrix.length; i++) {
            if (!check(matrix, matrix[i][0], i, 0))
                return false;
        }
        return true;
    }

    private boolean check(int[][] matrix, int expectValue, int row, int col) {
        if (row >= matrix.length || col >= matrix[0].length)
            return true;
        if (matrix[row][col] != expectValue)
            return false;

        return check(matrix, expectValue, row + 1, col + 1);
    }
}
