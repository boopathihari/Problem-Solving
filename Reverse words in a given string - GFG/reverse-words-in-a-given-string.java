//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
     static String reverseWords(String S)
    {
        // code here 
        String reversedStr = "";

        String[] str = S.split("\\.");
        
        for(int i=str.length; i>0; i--){
              if(i-1 == 0){
                reversedStr += str[i-1];
                break;
            }
            reversedStr += str[i-1]+".";
        }
        
        return reversedStr;
    }
}