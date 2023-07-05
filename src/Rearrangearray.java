import java.util.*;

public class Rearrangearray {

    public static void Rearrangearray(int[] arr) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int ar : arr) {
            if (ar < 0) {
                list2.add(ar);
            } else {
                list1.add(ar);
            }
        }

        int l1 = list1.size();
        int l2 = list2.size();
        int size,k=0; 

        if(l1 < l2){
            size = l2;
        }else{
            size = l1;
        }


      
        for (int i = 0; i < size; i++) {
            if(i < list1.size()){
                arr[k] = list1.get(i);
                k++;
            }

            if(i< list2.size()){
                arr[k] = list2.get(i);
                k++;
            }

        }

        for(int i=0; i<arr.length; i++){
            System.out.println("=>"+arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};

        Rearrangearray(arr);

    }
}
