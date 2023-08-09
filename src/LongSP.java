import java.util.*;

public class LongSP {

    static int lps(String s) {
        // code here
         int n = s.length();
        int[] arr = new int[n];
        
        int i = 0;
        int j = 1;
    

    while (j < n) {
        if (s.charAt(i) == s.charAt(j)) {
            i++;
            arr[j] = i;
            j++;
        } else {
            if (i != 0) {
                i = arr[i-1];
            } else {
                arr[j] = 0;
                j++;
            }
        }
    }

    return arr[n-1];
    }

    public static void main(String[] args) {
       int sol = lps("abbcefabbeabc");
        System.out.println(sol);
    }
}
