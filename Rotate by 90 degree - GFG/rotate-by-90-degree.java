//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
         BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            int matrix[][] = new int[n][n];
            String st[] = read.readLine().trim().split("\\s+");
            int k = 0;
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                    matrix[i][j] = Integer.parseInt(st[k++]);
            }
            Solution ob = new Solution();
            ob.rotateby90(matrix, n);
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int mat[][], int n) 
    {
        int row = mat.length, col=mat[0].length;
        int top=0,down = row-1, left = 0 , right = col-1;
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col/2; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[i][row-1-j];
                mat[i][row-1-j] = temp;
            }
        }
        


        for(int j=0 ; j<row ; j++){
            for(int i=top ;i<=down ; i++){
                // System.out.println();            
                int temp = mat[i][right];
                mat[i][right] = mat[right][i];
                mat[right][i] = temp;
        }

        right -= 1;
        down -=1;

        }
        
}
       
}