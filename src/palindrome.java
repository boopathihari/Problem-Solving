/**
 * palindrome
 */
public class palindrome {

public static int palindromeOrNor(int[] a, int n)
    {
        int count=0;
        for(int i=0; i<n; i++){
            int rev=0;
            int dup = a[i];

            while (a[i] > 0) {
                int rem = a[i] % 10;
                rev = (rev * 10) + rem;
                a[i] = a[i] / 10;
            }

            if(dup == rev){
                count++;
            }
        }

        if(count == n){
            return 1;
        }else{
            return 0;
        }

        
    }
    
    public static void main(String[] args) {
            int[] arr = {121, 131, 20 };                     
            int ans = palindromeOrNor(arr, 3);
            System.out.println("Ans=>"+ans);
        }
    
    
}
