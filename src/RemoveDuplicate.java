public class RemoveDuplicate {
     public static void removeDuplicates(int[] nums) {
        int count=1,sum=0;

        int no = nums.length;
            for(int i=0; i<no; i++){
                if(nums[i] == nums[i+1]){
                    count++;

                    if(count > 2){
                        
                        count=1;
                    }

                }else{
                     sum =+ count;
                     count = 1;
                    continue;
                }
            }
        }

    public static void main(String[] args) {
     int[] nums = {0,0,1,1,1,1,2,3,3};

      removeDuplicates(nums);
       

        

    }
}
