package com.ninojay.leetcode.i位运算10.c二进制特性3;

import com.ninojay.leetcode.util.NinoPrintUtil;

/**
 * @author : zengzhongjie
 * @date : 2023/9/13 00:13
 */
public class ThreeThreeEight338 {
    public static void main(String[] args) {
        NinoPrintUtil.printAllType(new ThreeThreeEight338().countBits(5));
    }
    public int[] countBits(int n) {

        int[] ans = new int[n + 1];
        ans[0] = 0;

        for(int i = 1; i <= n; i++) {
            int count = 0;
            int tempN = i;
            while(tempN != 0) {
                count++;
                // 去除掉末位1
                tempN = (tempN & (tempN-1));
            }
            ans[i] = count;
        }
        return ans;
    }

    /**
     * 也可以用dp
     * @param n
     * @return
     */
    public int[] dpCountBits(int n) {

        //dp含义是 dp[2] 2 中含有1的个数
        int[] dp = new int[n+1];
        for(int i = 1; i <= n; i++) {
            dp[i] = ((i & 1) == 1) ? dp[i-1] + 1 : dp[i>>1];
        }
        return dp;
    }
}
