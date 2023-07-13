public class spiralarray2 {

        public static int[][] generateMatrix(int n) {
            int dir=0,top=0,down=n-1,left=0,right=n-1,no=0;
            int arr[][] = new int[n][n];

            while(top<=down && left<=right ){
                if(dir == 0 ){
                    for(int i=left;i<=right; i++){
                        no++;

                        arr[top][i] = no;

                    }
                    top = top+1;
                }

                if(dir == 1 ){
                    for(int i=top;i<=down; i++){
                        no++;
                        System.out.println("=>"+i);
                        System.out.println("=>"+right);

                        arr[i][right] = no;

                    }
                    right = right-1;
                }

                if(dir == 2 ){
                    for(int i=right;i>=left; i--){
                        no++;

                        arr[down][i] = no;

                    }
                    down = down - 1;
                }

                if(dir == 3 ){
                    for(int i=down;i>=top; i--){
                        no++;

                        arr[i][left] = no;

                    }
                    left = left+1;
                }
                dir = (dir + 1)%4;
            }
            return arr;
        }

        public static void main(String[] args) {
            int[][] arr = generateMatrix(3);
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    System.out.println("i =>"+i+" j=>"+j+" "+arr[i][j]);
                }
            }
        }
}
