import java.util.*;

public class nextPermutation {
    public static List<Integer> nextPermutation(int N, int arr[]){
        // code here
        List<Integer> list = new ArrayList<>();
        // if(arr == null || arr.length <= 1){
        //     return list.addAll(Arrays.asList(arr));;
        // }
        
        int i=arr.length-2;
        
        while(i>=0 && arr[i] >= arr[i+1]){
            i--;
        }
        
        if(i>=0){
            int j=arr.length-1;
            while(arr[j] <= arr[i]){
             j--;
            }   

            
            swap(arr,i,j);
        }
        
        reverse(arr,i+1,arr.length-1);
        
        for(int k=0;k<arr.length;k++){
            list.add(arr[k]);
        }
       
        return list;
    }
    
    
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
    }
    
    public static void reverse(int[] arr,int i,int j){
        while(i<j) swap(arr,i++,j--);
    }

    public static void main(String[] args) {
        int[] arr = {1,2, 3, 6, 5, 4};
        List<Integer> listRes = nextPermutation(6, arr);
        System.out.println(listRes);
    }
}
