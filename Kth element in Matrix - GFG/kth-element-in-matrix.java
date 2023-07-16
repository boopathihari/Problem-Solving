//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
class KthSmallestElement{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=Integer.parseInt(sc.next());
		while(t>0)
		{
			int n=Integer.parseInt(sc.next());
			int[][] a=new int[n][n];
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
    				a[i][j]=Integer.parseInt(sc.next());
    		
			int k=Integer.parseInt(sc.next());
		    Solution ob = new Solution();
		    System.out.println(ob.kthSmallest(a,n,k));
		    
		    t--;
		}
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    public static int lowerBound(int[] mat, int mid) {
        int LB = 0;

        for (int i = 0; i < mat.length; i++) {
            if (mat[i] < mid) {
                LB++;
            } else {
                return LB;
            }
        }
        return LB;
    }
    
	public static int kthSmallest(int[][]mat,int n,int k)
	{
	    
	    
        if(n == 1){
            return mat[0][0];
        }
        
         // code here.
        int low = mat[0][0];
        int high = mat[n - 1][n - 1];

        while (low < high) {
            int mid = (low + high) / 2;

            int smallest = 0;

            for (int i = 0; i < n; i++) {
                smallest += lowerBound(mat[i], mid);
            }
            
            if(smallest >= k){
                high = mid;
            }else if(smallest < k){
                low = mid+1;
            }
        }

        return low-1;
        
    }
}