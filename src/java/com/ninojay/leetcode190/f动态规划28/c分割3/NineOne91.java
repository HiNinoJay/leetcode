package com.ninojay.leetcode190.f动态规划28.c分割3;

/**
 * todo 没学会
 * @author zengzhongjie
 * @date 2023/2/23
 */
public class NineOne91 {

    public static void main(String[] args) {
        String s = "226";
        System.out.println(numDecodings(s));
    }

    public static int numDecodings(String s) {
        int n = s.length();

        if (n == 0) {
            return 0;
        }
        // s.charAt 有可能是0 ～ 9
        int prev = s.charAt(0) - '0';

        if (prev == 0) {
            // 开头为0，必不可能解码
            return 0;
        }

        if (n == 1) {
            // 长度为1 ，直接返回，只可能解码为1个字母
            return 1;
        }

        int[] dp = new int[n + 1];
        for(int i = 0; i < dp.length; i++) {
            dp[i] = 1;
        }

        for (int i = 2; i <= n; ++i) {

            int cur = s.charAt(i-1) - '0';

            if ((prev == 0 || prev > 2) && cur == 0) {
                // 出现了00， 或者 30 40 50...那必不可能解码了
                return 0;
            }

            if ((prev < 2 && prev > 0) || prev == 2 && cur < 7) {
                // prev + cur 必然在 26个字母的范围
                if (cur != 0) {
                    dp[i] = dp[i-2] + dp[i-1];
                } else {
                    dp[i] = dp[i-2];
                }
            } else {
                // 只能cur构成可能的解码
                dp[i] = dp[i-1];
            }
            prev = cur;
        }

        return dp[n];
    }

}
