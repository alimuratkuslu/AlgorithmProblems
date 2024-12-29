package TwoPointer;

public class TrappingRainWater {

    public static void main(String[] args){

        int[] nums1 = new int[]{0,2,0,3,1,0,1,3,2,1};
        int[] nums2 = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println(trap(nums1)); // => 9
        System.out.println(trap(nums2)); // => 6
    }

    public static int trap(int[] height) {
        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];

        int maxLeftVal = 0;
        for(int i = 0; i < height.length; i++) {
            if(height[i] > maxLeftVal) {
                maxLeftVal = height[i];
            }

            maxLeft[i] = maxLeftVal;
        }

        int maxRightVal = 0;
        for(int i = height.length - 1; i >= 0; i--) {
            if(height[i] > maxRightVal) {
                maxRightVal = height[i];
            }

            maxRight[i] = maxRightVal;
        }

        int res = 0;
        for(int i = 0; i < height.length; i++) {
            res += Math.min(maxLeft[i], maxRight[i]) - height[i];
        }

        return res;
    }
}