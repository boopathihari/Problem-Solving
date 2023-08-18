import java.util.Arrays;

public class Repeat {
    static int[] findTwoElement(int arr[], int n) {
        // code here
        int[] ar = new int[2];
        int flag1=0,flag2=0,j=n;

        Arrays.sort(arr);

        // for(int i=0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        for (int i = n-1; i > 0; i--) {
            // Duplicate number
            if(arr[i] == arr[i-1]){
                ar[0] = arr[i];
                i--;  
                flag1=1;
            }

            // Missing number
            if(flag2 == 0 && j != arr[i]){
                ar[1] = j;
                flag2=1;
            }else{
                j--;
            }
        }
        // System.out.println(j);


        if(flag2 != 1){
            if(arr[0] != 1){
                ar[1] = 1; 
            }else{
                ar[1] = j;
            }
        }

        return ar;

    }


    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,5,7}; 
        int[] sol = findTwoElement(arr,arr.length);

        for (int i = 0; i < sol.length; i++) {
            System.out.println(sol[i]);
        }
    }
}
