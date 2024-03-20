package com.ninojay.leetcode190.f动态规划28.g股票交易;

import com.ninojay.leetcode190.util.NinoCreationUtil;
import com.ninojay.leetcode190.util.NinoPrintUtil;

/**
 * @author : zengzhongjie
 * @date : 2023/9/13 00:04
 */
public class ThreeZeroNine309 {
    public static void main(String[] args) {
        int[] prices = NinoCreationUtil.createOneDimensionArray(1,2,3,0,2);
        NinoPrintUtil.printAllType(new ThreeZeroNine309().maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n == 0) {
            return 0;
        }

        // bug[2],s1[2] 都代表 购入当前 股票的 最大收益
        int[] buy = new int[n];
        int[] s1 = new int[n];
        // sell[2],s2[2] 都代表 售出当前 股票的 最大收益
        int[] sell = new int[n];
        int[] s2 = new int[n];

        // 首先购入第一个股票， 自然 购入当前 股票的 最大收益为 -price[0]
        buy[0] = -prices[0];
        s1[0] = -prices[0];
        // 当前手上没有股票，自然 售出当前 股票的 最大收益为 0
        sell[0] = 0;
        s2[0] = 0;

        // 之所以有上一次的 是因为 要间隔一天 ！
        for(int i = 1; i < n; i++) {
            // buy[i]: s2 作为之前的本金，来购入当前股票
            buy[i] = s2[i-1] - prices[i];
            // 上一次的还没有利用到：所以 s1 存储上一次的 buy和s1数组购入的 最大收益
            s1[i] = Math.max(buy[i-1], s1[i-1]);

            // sell[i]: 售卖当前股票，自然是 之前的 最大收益 加上 当前股票
            sell[i] = s1[i] + prices[i];
            // 上一次的还没有利用到：所以 s2 存储上一次的 sell和s2数组售出的 最大收益
            s2[i] = Math.max(s2[i-1], sell[i-1]);
        }
        return Math.max(sell[n-1], s2[n-1]);
    }
}
