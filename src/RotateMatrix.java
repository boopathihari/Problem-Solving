/**
 * RotateMatrix
 */
public class RotateMatrix {

    public static void rotateMatrix(int[][] mat){
        int row = mat.length, col=mat[0].length;
        int top=0,down = row-1, left = 0 , right = col-1;
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col/2; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[i][row-1-j];
                mat[i][row-1-j] = temp;
            }
        }
        


         for(int i=0; i<row; i++){
            for(int j=i; j<col; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }


        // for(int j=0 ; j<row ; j++){
        //     for(int i=top ;i<=down ; i++){
        //         // System.out.println();            
        //         int temp = mat[i][right];
        //         mat[i][right] = mat[right][i];
        //         mat[right][i] = temp;
        // }

        // right -= 1;
        // down -=1;

        // }
        

        for(int i=0; i<row; i++){
            for(int j=0; j<col;j++){
                System.out.print(" "+mat[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        rotateMatrix(matrix);
    }
}

// 68 35 1 70 25 79 59
// 63 65 6 46 82 28 62
// 92 96 43 28 37 92 5 
// 3 54 93 83 22 17 19
// 96 48 27 72 39 70 13
// 68 100 36 95 4 12 23 
// 34 74 65 42 12 54 69

// 59 62 5 19 13 23 69 
// 35 65 96 54 48 100 74 
// 1 6 43 93 27 36 65 
// 70 46 28 83 72 95 42
// 25 82 37 22 39 4 12 
// 79 28 92 17 70 12 54
// 68 63 92 3 96 68 34


// 59 62 5 19 13 23 69 
// 79 28 92 17 70 12 54
// 25 82 37 22 39 4 12
// 70 46 28 83 72 95 42 
// 1 6 43 93 27 36 65
// 35 65 96 54 48 100 74 
// 68 63 92 3 96 68 34