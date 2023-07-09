import java.util.*;

public class min2array {

    static double medianOfArrays(int a[], int b[]) {
        // Your Code Here

        List<Integer> list = new ArrayList<Integer>();

        int m = a.length;
        int n = b.length;

        int no = m + n;
       
        // System.out.println(no);

        if(m != 0 && n != 0){
        if(no == 2){
        double s = a[0] + b[0];

        return s/2;

        }
        }

        for (int i = 0; i < m; i++) {
            list.add(a[i]);

        }

        for (int i = 0; i < n; i++) {
            list.add(b[i]);
        }

       

        Collections.sort(list);

        // System.out.println(list);
        // System.out.println(list.get(no/2 - 1));

        if(no % 2 == 0){

            if(m != 0 && n != 0){
                if(list.get(no/2 - 1) == list.get(no/2)){
                return list.get(no/2 - 1);
                }else if(list.get(no/2 - 1) + 2 == list.get(no/2)){
                                       

                return list.get(no/2 - 1)+1;
                }
            }
            // System.out.println(list.get(no/2 - 1));
            // System.out.println(list.get(no/2));
            System.out.println((double)(list.get(no/2 - 1) + list.get(no/2)) / 2);

            return (double)(list.get(no/2 - 1) + list.get(no/2)) / 2;

        }else{

        return list.get(no/2);
        }

    }

    public static void main(String[] args) {
        int[] arr1 = {1,2};

        int[] arr2 = {3,4};
       double sol =  medianOfArrays(arr1, arr2);
        System.out.println(sol);
    }
}
