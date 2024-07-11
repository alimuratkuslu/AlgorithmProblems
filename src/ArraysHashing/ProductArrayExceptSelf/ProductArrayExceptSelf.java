package ArraysHashing.ProductArrayExceptSelf;

import java.util.ArrayList;
import java.util.List;

public class ProductArrayExceptSelf {

    public static void main(String[] args){

        int[] nums1 = new int[]{1,2,4,6};
        int[] nums2 = new int[]{-1,0,1,2,3};

        System.out.println(productExceptSelf(nums1)); // => 48,24,12,8
        System.out.println(productExceptSelf(nums2)); // => 0,-6,0,0,0
    }

    public static int[] productExceptSelf(int[] nums) {

        List<Integer> resList = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            int res = 1;
            for(int j = 0; j < nums.length; j++){
                if(i != j){
                    res = res * nums[j];
                }
            }

            resList.add(res);
        }

        int[] resArray = new int[resList.size()];

        for(int i = 0; i < resList.size(); i++){
            resArray[i] = resList.get(i);
        }

        return resArray;
    }
}
