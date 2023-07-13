import java.util.*;

public class RemoveDup {

    public static int removeDuplicates(int[] nums) {
        int no = nums.length;

        // Set<Integer> set = new HashSet<>();
        TreeMap<Integer,Integer> map= new TreeMap<>();
    

        for(int i=0; i<no; i++){
            // set.add(nums[i]);
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }

        System.out.println(map);
        // System.out.println(set);

        int j=0,sum=0;

        for(Integer key : map.keySet()){
            // System.out.println(map.get(key));
            if(map.get(key) >= 2){
                int count=1;
                while(count <=2 ){
                    nums[j] = key;
                    j++;
                    count++;
                }
                sum += count-1;
            }else{
                nums[j] = key;
                j++;
                sum += 1;
            }
        }

        // for(int i=0; i<no; i++){
        //     System.out.print(" "+nums[i]);
        // }
        return sum;
        // System.out.println(" => "+sum);


    }


    public static void main(String[] args) {
        int[] num = {-3,-1,0,0,0,3,3};
        int sol = removeDuplicates(num);
        System.out.println(sol);
    }
}
