package TwoPointer;

import java.util.HashMap;

public class TwoIntegerSumII {

    public static void main(String[] args){

        int[] nums1 = new int[]{1,2,3,4};

        System.out.println(twoSum(nums1, 3)); // => 1, 2
    }

    public static int[] twoSum(int[] numbers, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < numbers.length; i++){
            int complement = target - numbers[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement) + 1, i + 1};
            }

            map.put(numbers[i], i);
        }

        return new int[]{};
    }
}
