//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
        static List<Integer> nextPermutation(int N, int arr[]) {
        // code here
        List<Integer> list = new ArrayList<>();
        int ind = -1;
        
        for(int i= N-2; i>=0 ; i--){
            if(arr[i] < arr[i+1]){
                ind = i;
                break;
            }
        }
        
        if(ind == -1){
            Arrays.sort(arr);
            list = addList(arr,N,list);
            return list;
        }
        
        
        for(int i=N-1; i>ind; i--){
            if(arr[ind] < arr[i]){
                swap(arr,ind, i);
                break;
            }
        }
        
        Arrays.sort(arr,ind+1, N);
        list = addList(arr,N,list);
        return list;
    }


    public static List<Integer> addList(int[] arr,int N, List<Integer> list){
         for (int i = 0; i < N; i++) {
                list.add(arr[i]);
             }
             return list;
    }

    public static void swap(int[] arr, int ind1, int ind2) {
        int temp = arr[ind2];
        arr[ind2] = arr[ind1];
        arr[ind1] = temp;
    }
}