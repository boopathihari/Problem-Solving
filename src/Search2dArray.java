/**
 * Search2dArray
 */
public class Search2dArray {

    public static int searchMatrix(int[][] matrix, int target) {
        int left = 0, right = matrix[0].length, row = matrix.length;

        if (row == 1 && right == 1) {
            if (target == matrix[0][0]) {
                return 1;
            } else {
                return 0;
            }
        }

        for (int i = 0; i < row; i++) {
            if (target > matrix[i][right - 1]) {
                continue;
            } else {
                for (int j = right - 1; j >= left; j--) {

                    if (matrix[i][j] == target) {
                        return 1;
                    }
                }
                return 0;
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        int[][] matrix = { { 10, 20, 30, 40, 15, 25, 35, 45, 27, 29, 37, 48, 32, 33, 39, 50 } };

        int sol = searchMatrix(matrix, 37);
        System.out.println(sol);
    }
}