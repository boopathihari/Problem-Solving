/**
 * countSqrt
 */
public class countSqrt {

    
    static int countSquares(int N) {
        // code here
            double srt  = Math.sqrt(N);
            int ans = (int)Math.ceil(srt);
            int sol = ans - 1;
            return sol;
    }


    public static void main(String[] args) {
        int sol = countSquares(20148714);
        System.out.println(sol);
    }
}