package TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeIntegerSum {

    public static void main(String[] args){

        int[] nums1 = new int[]{-1,0,1,2,-1,-4};
        int[] nums2 = new int[]{0,1,1};
        int[] nums3 = new int[]{0,0,0};

        System.out.println(threeSum(nums1)); // => [[-1,-1,2],[-1,0,1]]
        System.out.println(threeSum(nums2)); // => []
        System.out.println(threeSum(nums3)); // => [[0,0,0]]
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> resList = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int l = i + 1;
            int r = nums.length - 1;

            while(l < r) {
                int threeSum = nums[i] + nums[l] + nums[r];
                if(threeSum > 0) {
                    r--;
                } else if(threeSum < 0) {
                    l++;
                } else {
                    List<Integer> tempList = new ArrayList<>();
                    tempList.add(nums[l]);
                    tempList.add(nums[r]);
                    tempList.add(nums[i]);
                    resList.add(tempList);

                    l++;
                    while(nums[l] == nums[l-1] && l < r) {
                        l++;
                    }
                }
            }
        }

        return resList;
    }
}
