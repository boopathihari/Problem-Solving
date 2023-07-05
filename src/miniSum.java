import java.util.*;

class miniSum {
    public static int minSubArrayLen(int target, int[] nums) {
         int sum=0,k=0;
        int count=0;
        List<Integer> arrlist = new ArrayList<Integer>();

        for(int i=0; i<nums.length; i++){
            count=0;
            sum=0;
            sum = sum + nums[i];
            count++;
            
            if(sum >= target){
                return 1;
            }

            for(int j=i+1;j<nums.length;j++){
                sum = sum + nums[j];
                count++;

                if(sum >= target){
                    arrlist.add(count);
                    break;
                }
            }
        }

       if(arrlist.isEmpty()){
           return 0;
       }

        Collections.sort(arrlist);
        
        int min = arrlist.get(0);
        return min;

    }

    public static void main(String[] args) {
        int[] nums = {1,4,4};
        int target = 4;

        int ans = minSubArrayLen(target,nums);
        System.out.println("The solution is=> "+ans);
    }
}