package Stack;

import java.util.HashMap;
import java.util.Stack;

public class LargestRectangleInHistogram {

    public static void main(String[] args){

        int[] nums1 = new int[]{2,1,5,6,2,3};
        int[] nums2 = new int[]{2,4};

        System.out.println(largestRectangleArea(nums1)); // 10
        System.out.println(largestRectangleArea(nums2)); // 4
    }

    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            int currentHeight = (i == n) ? 0 : heights[i];

            while (!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }

            stack.push(i);
        }

        return maxArea;
    }
}
