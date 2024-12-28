package ArraysHashing;

import java.util.HashSet;

public class LongestConsSequence {

    public static void main(String[] args){

        int[] nums1 = new int[]{2,20,4,10,3,4,5};
        int[] nums2 = new int[]{0,3,2,5,4,6,1,1};

        System.out.println(longestConsecutive(nums1)); // => 4
        System.out.println(longestConsecutive(nums2)); // => 7
    }

    public static int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        int counter = 0;

        for(int num : nums) {
            set.add(num);
        }

        for(int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int tempCounter = 1;

            while(set.contains(currentNum + 1)) {
                currentNum++;
                tempCounter++;
            }

            counter = Math.max(counter, tempCounter);
        }

        return counter;
    }
}
