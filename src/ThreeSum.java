import java.util.*;
import java.util.stream.Collectors;

public class ThreeSum {
    // public void threeSum(int[] nums) {

    // LinkedHashSet<LinkedHashSet<Integer> > twodSet
    // = new LinkedHashSet<LinkedHashSet<Integer> >();

    // int n = nums.length;

    // for(int i=0; i<n; i++){
    // for(int j=i; j<n; j++){
    // for(int k=0; k<n; k++){
    // int result = nums[i] + nums[j] + nums[k];
    // if(result == 0){
    // twodSet.add(new
    // LinkedHashSet<Integer>(Arrays.asList(nums[i],nums[j],nums[k])));
    // }
    // }
    // }
    // }
    // System.out.println(twodSet);
    // }

    public static void main(String[] args) {

        int[] nums = { -1, 0, 1, 2, -1, -4 };
        int n = nums.length;
        List<List<Integer>> twodList = new ArrayList<List<Integer>>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int result = nums[i] + nums[j] + nums[k];
                    if (result == 0) {
                        List<Integer> myList = new ArrayList<Integer>();
                        myList.add(nums[i]);
                        myList.add(nums[j]);
                        myList.add(nums[k]);
                        twodList.add(myList);
                    }
                }
            }
        }

        System.out.println(twodList);
    }
}