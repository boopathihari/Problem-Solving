import java.util.*;
class div{

    public static int find_median(int[] v)
    {
        // Code here
        int n = v.length;
        
        Arrays.sort(v);
        System.out.println(n%2);
        if(n == 2){
            return ( v[0] + v[1] )/ 2;   
        }else if((n%2) == 0){
            return ( v[(n/2)-1] + v[n/2] ) / 2;
        }else{
            return v[n/2];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 17, 3, 19, 3, 8, 17, 1, 12, 19 };
          int sol = find_median(arr);
            System.out.println(sol);
        }

}