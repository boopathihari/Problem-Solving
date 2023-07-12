//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int mat[][] = new int[n][m];
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < m; j++)
                  mat[i][j] = sc.nextInt();
            }
            
            int x = sc.nextInt();
            
            System.out.println (new Sol().matSearch(mat, n, m, x));
        }
        
    }
}
// } Driver Code Ends


class Sol
{
    public static int matSearch(int matrix[][], int row, int right, int target)
    {
       int left = 0;

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
               
            }
        }
        
        return 0;

    }
}