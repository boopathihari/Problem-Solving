//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
    int[] ar = new int[2];
        int flag=0,j=n;

        Arrays.sort(arr);

        // for(int i=0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        for (int i=0;i<n;i++) {
            // Duplicate number
            if(i+1<n&&arr[i] == arr[i+1]){
                ar[0]=arr[i];
                if(flag==1)
                    break;
                if(arr[i]!=i+1)
                {
                    ar[1]=i+1;
                    break;
                }
                i++;
                flag=1;
            }

            // Missing number
            if(flag==0&&arr[i]!=i+1)
            {
                ar[1]=i+1;
                flag=1;
            }
            else if(flag==1&&arr[i]==i+1)
            {
                ar[1]=i;
                break;
            }
        }
        if(ar[1]==0)
            ar[1]=n;
        // System.out.println(j);



        return ar;
    }
}