package com.ninojay.leetcode.a贪心;

/**
 * @author zengzhongjie
 * @date 2023/2/10
 */
public class OneTwoTwo122 {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int[] prices1 = {1,2,3,4,5};
        int[] prices2 = {7,6,4,3,1};
        System.out.println(maxProfit(prices2));
    }

    public static int maxProfit(int[] prices) {
        int result = 0;
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i-1]) {
                result = result + (prices[i] - prices[i-1]);
            }
        }
        return result;
    }
}
