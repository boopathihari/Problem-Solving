//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            int n = Integer.parseInt(read.readLine());
            
            

            Solution ob = new Solution();
            
            System.out.println(ob.lookandsay(n));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String lookandsay(int n) {
         String temp = "1";
        String tmp = "";

        if(n == 1){
            return temp;
            
        }

        for(int i=1; i<n; i++){
            int count=1;
            int len = temp.length();
            for(int j=0 ;j<len; j++){
                if(j != (temp.length()-1) && temp.charAt(j) == temp.charAt(j+1)){
                    count++;
                }else{
                    tmp += count + String.valueOf(temp.charAt(j));
                    count=1;
                }
            }
            temp = tmp;
            tmp = "";
          
        }

        return temp;
    }
}
