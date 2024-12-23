package ArraysHashing;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args){

        int[] nums1 = new int[]{1,2,4,6};
        int[] nums2 = new int[]{-1,0,1,2,3};

        System.out.println(productExceptSelf(nums1)); // => 48,24,12,8
        System.out.println(productExceptSelf(nums2)); // => 0,-6,0,0,0
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int[] leftProducts = new int[nums.length];
        int[] rightProducts = new int[nums.length];

        leftProducts[0] = 1;
        rightProducts[nums.length - 1] = 1;

        for(int i = 1; i < nums.length; i++) {
            leftProducts[i] = leftProducts[i-1] * nums[i-1];
        }

        for(int i = nums.length - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i+1] * nums[i+1];
        }

        for(int i = 0; i < nums.length; i++) {
            res[i] = leftProducts[i] * rightProducts[i];
        }

        return res;
    }
}
