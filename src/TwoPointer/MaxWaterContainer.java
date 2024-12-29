package TwoPointer;

public class MaxWaterContainer {

    public static void main(String[] args){

        int[] nums1 = new int[]{1,7,2,5,4,7,3,6};
        int[] nums2 = new int[]{2,2,2};

        System.out.println(maxArea(nums1)); // => 36
        System.out.println(maxArea(nums2)); // => 4
    }

    public static int maxArea(int[] heights) {

        int l = 0;
        int r = heights.length - 1;
        int res = 0;

        while(l < r) {
            int tempArea = (r - l) * Math.min(heights[r], heights[l]);
            res = Math.max(res, tempArea);

            if(heights[l] > heights[r]) {
                r--;
            }
            else {
                l++;
            }
        }

        return res;
    }
}
