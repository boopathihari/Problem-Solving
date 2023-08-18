public class Stickler {
    public static int FindMaxSum(int arr[], int n)
    {
        // Your code here
        if(n < 2){
            return arr[0];
        }

        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = arr[1];

        
       
        if(n < 4){
            dp[0] = arr[0];
            dp[1] = Math.max(dp[0], arr[1]);
            dp[2] = Math.max(dp[1],arr[2]);
            return dp[n-1];
        }

        for (int i = 2; i < n; i++) {
             dp[i] = Math.max(dp[i-2] + arr[i], dp[i-1]);
            System.out.println(dp[i]);
        }

        return dp[n-1];
        
    
    }
 

    public static void main(String[] args) {
        int[] arr = {200,3,140,20,10};

        int max = FindMaxSum(arr,arr.length);

        // System.out.println(max);
    }
}
