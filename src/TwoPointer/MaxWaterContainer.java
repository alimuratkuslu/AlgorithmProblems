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
        int max = Integer.MIN_VALUE;

        while(l < r){
            int tempMax = Integer.MIN_VALUE;
            if(heights[l] > heights[r]){
                tempMax = heights[r] * (r - l);
                r--;
            }
            else {
                tempMax = heights[l] * (r - l);
                l++;
            }
            max = Math.max(max, tempMax);
        }

        return max;
    }
}
