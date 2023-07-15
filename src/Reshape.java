import java.util.ArrayList;

public class Reshape {
    
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        ArrayList<Integer> list = new ArrayList<>();
        
        if(r*c != row*col){
            return mat;
        }

        int[][] mat2 = new int[r][c];

        
            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    list.add(mat[i][j]);
                }
            }

            int k=0;
            for(int i=0; i<r ; i++){
                for(int j=0 ; j<c; j++){
                    mat2[i][j] = list.get(k++);
                }
            }
            return mat2;
        
        }

}
