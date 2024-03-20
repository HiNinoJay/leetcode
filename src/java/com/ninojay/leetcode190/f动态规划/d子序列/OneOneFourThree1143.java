package com.ninojay.leetcode190.f动态规划.d子序列;

import com.ninojay.leetcode190.util.NinoPrintUtil;

/**
 * @author : zengzhongjie
 * @date : 2023/9/13 00:01
 */
public class OneOneFourThree1143 {
    public static void main(String[] args) {
        NinoPrintUtil.printAllType(new OneOneFourThree1143().longestCommonSubsequence("abcde", "ace"));
    }

    public int longestCommonSubsequence(String text1, String text2) {


        // 使用二维数组来表示，dp[i][j] 表示 到第一个字符串 的第i个位置 到第二个字符串 的 第j个位置的 匹配情况
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];

        for(int i = 1; i <= text1.length(); i++) {
            for(int j = 1; j <= text2.length(); j++) {
                if(text1.charAt(i-1) == text2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }
}
