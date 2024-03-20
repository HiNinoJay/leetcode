package com.ninojay.leetcode.f动态规划.g股票交易;

import com.ninojay.leetcode.util.NinoCreationUtil;
import com.ninojay.leetcode.util.NinoPrintUtil;

/**
 * @author : zengzhongjie
 * @date : 2023/9/13 00:03
 */
public class OneTwoOne121 {
    public static void main(String[] args) {
        int[] prices = NinoCreationUtil.createOneDimensionArray(7,1,5,3,6,4);
        NinoPrintUtil.printAllType(new OneTwoOne121().maxProfit(prices));
    }

    // 本身不难，关键是解法的代码写法思想
    public int maxProfit(int[] prices) {
        int buyMin = Integer.MIN_VALUE;
        int sellGet = 0;
        for(int i = 0; i < prices.length; i++) {
            // 越小的正数，其负数反而越大，所以我们找最大的那个负数，即是我们要的最小的正数
            buyMin = Math.max(buyMin, -prices[i]);
            // 所以 sellGet要么为 0 要么一定是 之前所保存的最小的数，拿当前的数去卖，保留最大的
            // 自然最后要的就是最大的
            sellGet = Math.max(sellGet, prices[i] + buyMin);
        }
        return sellGet;
    }
}
