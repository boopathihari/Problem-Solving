import java.util.ArrayList;

public class spirally {
    public static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c) {
        System.out.println("=>"+matrix.length);
        int dir = 0, top = 0, down = r - 1, right = c - 1, left = 0;
        // code here
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        while (top <= down && left <= right) {

            if (dir == 0) {
                for (int i = left; i <= right; i++) {
                    arrList.add(matrix[top][i]);
                }
                top = top + 1;
            }

            if (dir == 1) {
                for (int i = top; i <= down; i++) {
                    arrList.add(matrix[i][right]);
                }
                right = right - 1;
            }

            if (dir == 2) {
                for (int i = right; i >= left; i--) {
                    arrList.add(matrix[down][i]);
                }
                down = down - 1;

                for (int i = down; i >= top; i--) {
                    arrList.add(matrix[i][left]);
                }
                left = left + 1;
            }

            dir = (dir + 1) % 4;
        }
        return arrList;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                 };

        ArrayList<Integer> arrList = spirallyTraverse(matrix, 3, 4);
        System.out.println(arrList);
    }
}
