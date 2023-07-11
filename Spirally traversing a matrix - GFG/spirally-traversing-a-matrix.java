//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
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
}
