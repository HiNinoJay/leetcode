package com.ninojay.leetcode190.f动态规划.g股票交易;

import com.ninojay.leetcode190.util.NinoPrintUtil;

import java.util.Arrays;

/**
 * @author : zengzhongjie
 * @date : 2023/9/13 00:04
 */
public class OneEightEight188 {
    public static void main(String[] args) {
        int k = 2;
        int[] prices = {2,4,1};
        NinoPrintUtil.printAllType(new OneEightEight188().maxProfit(k, prices));
    }

    public int maxProfit(int k, int[] prices) {

        int days = prices.length;
        if(days < 2) {
            // 两天都不足，那当然直接返回0
            return 0;
        }
        if(k * 2 >= days) {
            // 可买卖的次数超过一半了，只要增长就可以售卖
            return getMostProfit(prices);
        }

        // bugMin[2] 代表 购买第2次 的 最大收益（就是 包含本金的 当前往前的最小值）
        int[] bugMin = new int[k+1];
        Arrays.fill(bugMin, Integer.MIN_VALUE);

        // sell[2] 代表 售卖第2次的 最大收益
        int[] sell = new int[k+1];
        Arrays.fill(sell, 0);

        for(int i = 0; i < days; i++) {
            for(int j = 1; j <= k; j++) {
                // 就是针对每一天的股市价格，去获得之前最小价格，如果售卖，当前最大价格
                // 且有意思的在于 buyMin是 包含了 之前的 本金的 最小价格
                bugMin[j] = Math.max(bugMin[j], sell[j-1] - prices[i]);
                sell[j] = Math.max(sell[j], prices[i] + bugMin[j]);
            }
        }
        return sell[k];
    }

    private int getMostProfit(int[] price) {
        int result = 0;
        for(int i = 1 ; i < price.length; i++) {
            if(price[i] > price[i-1]) {
                result = result + (price[i]-price[i-1]);
            }
        }
        return result;
    }
}
