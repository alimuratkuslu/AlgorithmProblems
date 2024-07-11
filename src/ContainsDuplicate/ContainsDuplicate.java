package ContainsDuplicate;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public static void main(String[] args){
        int[] nums1 = new int[]{1, 2, 3, 3};
        int[] nums2 = new int[]{1, 2, 3, 4};

        System.out.println(hasDuplicate(nums1)); // => true
        System.out.println(hasDuplicate(nums2)); // => false
    }

    public static boolean hasDuplicate(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> set : map.entrySet()) {
            if(set.getValue() != 1){
                return true;
            }
        }

        return false;
    }
}
