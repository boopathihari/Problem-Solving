import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Next {
    static List<Integer> nextPermutation(int N, int arr[]) {
        // code here
        int ind = -1,flag=0;

        List<Integer> list = new ArrayList<>();
       
        System.out.println();

        for (int i = 0; i < N - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                ind = i-1;
                break;
            }else{
                flag=1;
            }
        }
           
        if(flag==0){
            Arrays.sort(arr);
            list = addList(arr,N,list);
            return list;
        }

        if((ind == -1) && (flag==1)){
            swap(arr,N-2,N-1);
            list = addList(arr,N,list);
            return list;
        }

        for (int j = N - 1; j >= ind + 1; j--) {
            if (arr[ind] < arr[j]) {
                swap(arr, ind, j);
                break;
            }
        }

        Arrays.sort(arr, ind + 1, N);
        list = addList(arr,N,list);
        
        return list;
    }


    public static List<Integer> addList(int[] arr,int N, List<Integer> list){
         for (int i = 0; i < N; i++) {
                list.add(arr[i]);
             }

             return list;
    }

    public static void swap(int[] arr, int ind1, int ind2) {
        int temp = arr[ind2];
        arr[ind2] = arr[ind1];
        arr[ind1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1 };

       List<Integer> list = nextPermutation(3, arr);

        for (int l : list) {
            System.out.println(l);
        }
    }
}
