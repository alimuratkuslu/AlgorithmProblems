package TwoPointer;

public class TwoIntegerSumII {

    public static void main(String[] args){

        int[] nums1 = new int[]{1,2,3,4};
        int[] nums2 = new int[]{1,2,3,4,4,9,56,90};

        System.out.println(twoSum(nums1, 3)); // => 1, 2
        System.out.println(twoSum(nums2, 8)); // => 4, 5
    }

    public static int[] twoSum(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;

        while(l < r) {
            if(nums[l] + nums[r] > target) {
                r--;
                continue;
            }

            if(nums[l] + nums[r] == target) {
                System.out.println("i: " + l + " j: " + r);
                return new int[]{l+1, r+1};
            }

            l++;
        }

        return new int[]{};
    }
}
