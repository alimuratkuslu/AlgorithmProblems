package SlidingWindow;

public class BuyAndSellCrypto {

    public static void main(String[] args){

        int[] nums1 = new int[]{10,1,5,6,7,1};
        int[] nums2 = new int[]{10,8,7,5,2};

        System.out.println(maxProfit(nums1)); // => 6
        System.out.println(maxProfit(nums2)); // => 0
    }

    public static int maxProfit(int[] prices) {

        int res = 0;
        int minVal = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minVal){
                minVal = prices[i];
            }
            if(prices[i] - minVal > res){
                res = prices[i] - minVal;
            }
        }

        return res;
    }
}
