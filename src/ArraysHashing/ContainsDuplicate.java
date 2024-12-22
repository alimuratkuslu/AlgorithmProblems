package ArraysHashing;


import java.util.HashMap;

public class ContainsDuplicate {

    public static void main(String[] args){
        int[] nums1 = new int[]{1, 2, 3, 3};
        int[] nums2 = new int[]{1, 2, 3, 4};

        System.out.println(hasDuplicate(nums1)); // => true
        System.out.println(hasDuplicate(nums2)); // => false
    }

    public static boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        return map.values().stream().anyMatch(value -> value != 1);
    }
}
