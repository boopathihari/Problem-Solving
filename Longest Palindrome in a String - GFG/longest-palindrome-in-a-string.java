//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    
    static String subString(String str, int start, int end){
        return str.substring(start, end);
    }
    
    static String longestPalin(String str){
       int start=0,low=0;
        int n = str.length();
        int[][] table = new int[n][n];
        
        int maxlength = 1;
        for(int i=0; i<n; i++){
            table[i][i] = 1;
        }

        int flag=0,count=0;
        for(int i=0; i<n-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                table[i][i+1] = 1;
                start = i;
                maxlength=2;
                flag++;
                count++;
            }
            
            if(flag == 1 && count==1){
                 low = i;
                 flag=0;
            }
        }

       

        for(int k=3 ; k<=n; k++){

            for(int i=0; i<n-k+1; i++){

                int j = i+k-1;

                if( table[i+1][j-1] == 1 && str.charAt(i) == str.charAt(j)){
                        table[i][j] = 1;

                        if(k > maxlength){
                            start = i;
                            maxlength = k;
                        }
                }
            }
        }

if(maxlength == 2){
    String sol = subString(str,low,low+maxlength);
    return sol;
}

        String sub = subString(str,start,start+maxlength);

       return sub;
    }
    
}