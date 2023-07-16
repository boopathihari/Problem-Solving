public class FindKth {

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

    public static int kthSmallest(int[][] mat, int n, int k) {
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

    public static void main(String[] args) {
        int[][] mat = {
                { 16, 28, 60, 64 },
                { 22, 41, 63, 91 },
                { 27, 50, 87, 93 },
                { 36, 78, 87, 94 }
        };

       int sol =  kthSmallest(mat, 4, 3);
    }

}
