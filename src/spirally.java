import java.util.ArrayList;

public class spirally {
    public static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        
    }


    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
           {5, 6, 7, 8},
           {9, 10, 11, 12},
           {13, 14, 15,16}};

        ArrayList<Integer>  sol =  spirallyTraverse(matrix,4,4);
    }
}
