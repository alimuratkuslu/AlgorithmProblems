package ArraysHashing;

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
        int counter = 0;
        int[] res = new int[k];

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        for(Map.Entry<Integer, Integer> set : list) {
            if(k == counter) {
                break;
            }

            res[counter] = set.getKey();
            counter++;
        }

        return res;
    }
}
