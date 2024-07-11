package TwoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args){

        int[] nums1 = new int[]{3,4,5,6};
        int[] nums2 = new int[]{4,5,6};
        int[] nums3 = new int[]{5,5};

        System.out.println(twoSum(nums1, 7)); // => 0, 1
        System.out.println(twoSum(nums2, 10)); // => 0, 2
        System.out.println(twoSum(nums3, 10)); // => 0, 1
    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }

            map.put(complement, i);
        }

        return new int[]{};
    }
}
