package TopKFrequentElements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {

    public static void main(String[] args){

        int[] nums1 = new int[]{1,2,2,3,3,3};
        int[] nums2 = new int[]{7,7};
        int[] nums3 = new int[]{3,0,1,0};

        System.out.println(topKFrequent(nums1, 2)); // => 2, 3
        System.out.println(topKFrequent(nums2, 1)); // => 7
        System.out.println(topKFrequent(nums3, 1)); // => 0
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i], 1);
            }
        }

        List<Integer> resList = new ArrayList<>();
        int toBeAdded = 0;

        while(k != 0){
            int max = Integer.MIN_VALUE;
            for(Map.Entry<Integer, Integer> set : map.entrySet()){
                if(set.getValue() > max){
                    max = set.getValue();
                    toBeAdded = set.getKey();
                }
            }

            resList.add(toBeAdded);
            map.remove(toBeAdded);
            k--;
        }

        int[] resArray = new int[resList.size()];

        for(int i = 0; i < resList.size(); i++){
            resArray[i] = resList.get(i);
        }

        return resArray;
    }
}
