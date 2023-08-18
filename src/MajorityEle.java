import java.util.HashMap;
import java.util.Map;

public class MajorityEle {
  

    static int majorityElement(int a[], int size)
    {
          int val=-1;
        // your code here
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<size; i++){
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i])+1);
            }else{
                map.put(a[i] , 1);
            }
        }

        
        for (int key : map.keySet()) {
            if(map.get(key) > (size/2)){
                val = key;
                break;
            }
        }

        return val;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,6,6};
        int sol = majorityElement(arr ,arr.length);
        System.out.println(sol);
    }
}
