//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[][] arr = new int[n][m];
            inputLine = br.readLine().trim().split(" ");
        
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(inputLine[i * m + j]);
                }
            }
            int ans = new Solution().rowWithMax1s(arr, n, m);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
         int i, right=m-1, max=Integer.MIN_VALUE,row=-1;
        
        for(i=0; i<n; i++){
            if(arr[i][right] == 1) {
                int count=0;

                for(int j=right; j>=0; j--){
                    if(arr[i][j] != 0){
                        count++;
                    }else{
                        break;
                    }
                }

                   if(count > max){
                            max = count;
                            row = i;
                    }
                // System.out.println(count);
            }
        }

        return row;
        
    }
}