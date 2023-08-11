import java.util.ArrayList;

public class Search {
    static ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        ArrayList<Long> sol = search(arr,n,x);
        
        return sol;
    }
    
    
    static ArrayList<Long> search(long arr[], int n, int x){
        int l=0,r=n-1;
        int mid;
        ArrayList<Long> list = new ArrayList<>();

        
        while (l <= r) {
            mid = (l + r) / 2;

            if(arr[mid] == x){
                int i=mid,j=mid;
                

                while (i>-1 && arr[i] == x) {
                    i--;
                }
                 list.add((long)i+1);

               while (j < n && arr[j] == x) {
                    j++;
                }
                list.add((long)j-1);

                break;
            }

            if(arr[mid] < x){
                l = mid+1;
            }else{
                r = mid;
            }
        }

        return list;
    }


    
      public static void main(String[] args) {
      
        int no=30, x=10;
        long arr[] = {1 ,1, 1, 1 ,2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5, 6, 7, 7, 7, 8, 8, 8, 8, 10, 10, 10};
        ArrayList<Long> ind = find(arr,no,x);
        // System.out.println(ind);
        for (Long in : ind) {
            System.out.println(in);
        }
      
    }   
}

