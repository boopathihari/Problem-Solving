import java.util.*;

public class minSwap {
    // Function for finding maximum and value pair
    public static int SwapMethod (int arr[], int k,int n) {
        //Complete the function
        
       int count=0,swap=0;
       int minval=Integer.MAX_VALUE;
       
       for(int i=0; i<n;i++){
        if(arr[i] <= k){
            count++;
        }    
       }
       
         for(int i=0; i<=n-count;i++){
             for(int j=i; j<count+i; j++){
               

                 if(arr[j] > k){
                     swap++;
                 }
                }
                
             minval = Math.min(swap,minval);
             swap=0;
         }
         
         return minval;
        
        
    }

    public static void main(String[] args) {
        int[] arr = { 10, 12, 20, 20, 5, 19, 19, 12, 1, 20, 1 };
        int n = arr.length;
        int count = SwapMethod(arr, 1, n);
        System.out.println("Output=>" + count);
    }
}
