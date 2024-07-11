package ArraysHashing.LongestConsSequence;

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
        int longest = 0;

        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        for(int i = 0; i < nums.length; i++){
            if(!set.contains(nums[i] - 1)){
                int length = 0;
                while(set.contains(nums[i] + length)){
                    length += 1;
                }
                longest = Math.max(length, longest);
            }
        }

        return longest;
    }
}
