import java.util.*;

public class Rabin {

    static void search(String S, String pat) {

        ArrayList<Integer> list = new ArrayList<>();

        Map<Character, Integer> map = new TreeMap<>();
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm','n','o','p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y' ,'z'};

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i + 1);
        }

        // 
        System.out.println(map);
        // your code here
        int m = S.length();
        int n = pat.length();
        int k = map.size();
        long Sum = 0,patternSum = 0;

        for (int i = 0; i < n; i++) {
            patternSum += map.get(pat.charAt(i)) * Math.pow(k, n-1-i);

            if (i != n - 1) {
                Sum += map.get(S.charAt(i)) * Math.pow(k, n - 2 - i);
            }
        }


        int i=n-1;
        while(i < m){
            Sum *=  k;
            Sum += map.get(S.charAt(i));

           
            if(Sum == patternSum){
                list.add(i+1-n+1);
                Sum -= map.get(S.charAt(i+1-n)) * Math.pow(k,n-1);

            }else{
                Sum -= map.get(S.charAt(i+1-n)) * Math.pow(k,n-1);
            }

            i++;
        }

       
        System.out.println(list);
        
    }

    public static void main(String[] args) {
        String text = "hqghumeaylnlfdxfircvscxggbwkfnqduxwfnfozvsr";
        String pattern = "scxggbwk";

        search(text, pattern);
    }
}
