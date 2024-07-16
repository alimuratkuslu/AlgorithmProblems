package TwoPointer;

import java.util.ArrayList;
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

        return resList;
    }
}
