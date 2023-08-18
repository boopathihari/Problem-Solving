import java.util.ArrayList;

public class Search {
    static ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        ArrayList<Long> list = new ArrayList<>();
        
        
        int f = first(arr,n,x);
        int l = second(arr,n,x);
        
        list.add((long)f);
        list.add((long)l);
        
        return list;
    }
    
    
    static int first(long arr[], int n, int x){
        int l=0,r=n-1;
        int mid,first=-1;
        
        while (l <= r) {
            mid = (l + r) / 2;

            if(arr[mid] == x){
                first = mid;
                r = mid-1;
            }else if(arr[mid] < x){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }`
        
        return first;
    }
    
    static int second(long arr[], int n, int x){
         int l=0,r=n-1;
        int mid,last=-1;
        
        while (l <= r) {
            mid = (l + r) / 2;

            if(arr[mid] == x){
                last = mid;
                l = mid+1;
            }else if(arr[mid] < x){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        
        return last;
    }


    
      public static void main(String[] args) {
      
        int no=9, x=5;
        long arr[] = {1 ,3, 5, 5, 5, 5, 67 ,123 ,125};
        ArrayList<Long> ind = find(arr,no,x);
        // System.out.println(ind);
        for (Long in : ind) {
            System.out.println(in);
        }
      
    }   
}

