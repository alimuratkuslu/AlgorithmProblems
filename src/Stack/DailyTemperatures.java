package Stack;

import java.util.Stack;

public class DailyTemperatures {

    public static void main(String[] args){

        int[] nums1 = new int[]{73,74,75,71,69,72,76,73};
        int[] nums2 = new int[]{30,40,50,60};
        int[] nums3 = new int[]{30,60,90};
        int[] nums4 = new int[]{55,38,53,81,61,93,97,32,43,78};

        System.out.println(dailyTemperatures(nums1)); // [1,1,4,2,1,1,0,0]
        System.out.println(dailyTemperatures(nums2)); // [1,1,1,0]
        System.out.println(dailyTemperatures(nums3)); // [1,1,0]
        System.out.println(dailyTemperatures(nums4)); // [3,1,1,2,1,1,0,1,1,0]
    }

    public static int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> stack = new Stack<>();
        int[] res = new int[temperatures.length];
        res[res.length - 1] = 0;

        for(int i = 0; i < temperatures.length; i++) {
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                res[stack.peek()] = i - stack.peek();
                stack.pop();
            }

            stack.push(i);
        }

        return res;
    }
}

/*
Time Limit Exceeded
for(int i = 1; i < temperatures.length; i++){
    for(int j = i; j < temperatures.length; j++) {
        if(stack.peek() < temperatures[j]) {
            res[i - 1] = counter;
            stack.pop();
            stack.push(temperatures[i]);
            counter = 1;
            break;
        }

        counter++;

        if(counter == (temperatures.length - i + 1)) {
            stack.clear();
            counter = 1;
            stack.push(temperatures[i]);
        }
    }
}
*/