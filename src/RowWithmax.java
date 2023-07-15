public class RowWithmax {
    public static int[] rowAndMaximumOnes(int[][] arr) {
        int m=arr[0].length ,n=arr.length;
        System.out.println(" "+m+" "+n+"");

        int i, right=m-1, max=Integer.MIN_VALUE,row=-1;
        int[] val = new int[2];
        
        for(i=0; i<n; i++){
            
                int count=0;

                for(int j=right; j>=0; j--){
                    if(arr[i][j] != 0){
                        count++;
                    }
                }

                   if(count > max){
                            max = count;
                            row = i;
                    }
               
        }

        

        val[0] = row;
        val[1] = max;
        return val;
    }

    public static void main(String[] args) {
        int[][] mat = {{0,0,0},{0,1,1}};
        int[] arr = rowAndMaximumOnes(mat);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
