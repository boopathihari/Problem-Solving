//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class GFG
{
    ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        ArrayList<Long> list = new ArrayList<>();
        
        int l=0,r=n-1;
        int mid;


        while (l <= r) {
            mid = (l + r) / 2;

            if(arr[mid] == x){
                int i=mid,j=mid;
                

                while (i>-1 && arr[i] == x) {
                    i--;
                }
                 list.add((long)i+1);

               while (j < n && arr[j] == x) {
                    j++;
                }
                list.add((long)j-1);

                break;
            }

            if(arr[mid] < x){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        if(list.isEmpty())
             list.add((long)-1);
             list.add((long)-1);
        return list;
    }
    
    
    
}



//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int x =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(a1[i]);
            }
            GFG ob = new GFG();
            ArrayList<Long> ans=ob.find(arr,n,x);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}

// } Driver Code Ends