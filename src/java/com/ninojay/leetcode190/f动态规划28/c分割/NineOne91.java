package com.ninojay.leetcode190.f动态规划28.c分割;

import com.ninojay.leetcode190.util.NinoPrintUtil;

import java.util.Arrays;

/**
 * todo 没学会
 * @author zengzhongjie
 * @date 2023/2/23
 */
public class NineOne91 {

    public static void main(String[] args) {
        String s = "226";
        NinoPrintUtil.printAllType(new NineOne91().numDecodings(s));
    }


    public int numDecodings(String s) {

        if(s.length() == 0) return 0;

        char[] ch = s.toCharArray();

        // 先把 prev 置为 第一个数
        int prev = ch[0] - '0';

        // 开头为 0 直接返回 0
        if(prev == 0) {
            return 0;
        }

        // 长度为1 直接返回1
        if(s.length() == 1) {
            return 1;
        }

        // 动态规划 数组 首先全置为1
        int[] dp =  new int[s.length()+1];
        Arrays.fill(dp, 1);

        for(int i = 2 ; i <= s.length(); i++) {
            // 得到当前的数字
            int cur = ch[i-1] - '0';
            if((prev == 0 || prev > 2) && cur == 0) {
                // 00 不行 30 40 50... 直接不行
                return 0;
            }

            if((prev == 1) || (prev == 2 && cur < 7)) {
                //可以划分两个数字
                if(cur != 0) {
                    // 11到26（排除20）
                    // 这个位置可以划分两位数，也可以划分一位数
                    dp[i] = dp[i-2] + dp[i-1];
                } else {
                    // 10 或者 20
                    // 则这个 位置只能两位数划分，所以和 dp[i] 和 dp[i-2]相同
                    dp[i] = dp[i-2];
                }
            } else {
                // 只能划分一个数字
                dp[i] = dp[i-1];
            }
            // 当前设置为前一位数
            prev = cur;
        }
        return dp[s.length()];
    }



}
