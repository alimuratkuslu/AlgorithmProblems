package TwoPointer;

public class TrappingRainWater {

    public static void main(String[] args){

        int[] nums1 = new int[]{0,2,0,3,1,0,1,3,2,1};
        int[] nums2 = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println(trap(nums1)); // => 9
        System.out.println(trap(nums2)); // => 6
    }

    public static int trap(int[] height) {

        int count = 0;
        int l = 0;
        int r = height.length - 1;
        int maxLeft = height[l];
        int maxRight = height[r];

        while(l < r){
            if(maxLeft <= maxRight){
                l++;
                maxLeft = Math.max(maxLeft, height[l]);
                count += maxLeft - height[l];
            }
            else{
                r--;
                maxRight = Math.max(maxRight, height[r]);
                count += maxRight - height[r];
            }
        }

        return count;
    }
}