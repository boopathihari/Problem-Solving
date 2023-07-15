/**
 * RowMax1
 */
public class RowMax1 {

    public static int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int i, right=m-1, max=Integer.MIN_VALUE,row=0;
        
        for(i=0; i<n; i++){
            if(arr[i][right] == 1) {
                int count=0;

                for(int j=right; j>=0; j--){
                    if(arr[i][j] != 0){
                        count++;
                    }else{
                        break;
                    }
                }

                   if(count > max){
                            max = count;
                            row = i;
                    }
                // System.out.println(count);
            }
        }

        return row;
    }


    public static void main(String[] args) {
        int[][] Arr = {{0, 0}, {1, 1}};

        int sol = rowWithMax1s(Arr,2,2);
        System.out.println(sol);
    }
}