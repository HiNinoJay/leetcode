package com.ninojay.leetcode190.f动态规划.f字符串编辑;

import com.ninojay.leetcode190.util.NinoPrintUtil;

/**
 * @author : zengzhongjie
 * @date : 2023/9/13 00:02
 */
public class SevenTwo72 {
    public static void main(String[] args) {
        NinoPrintUtil.printAllType(new SevenTwo72().minDistance("horse", "ros"));
    }

    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i = 0; i <= m; i++) {
            for(int j = 0; j <= n; j++) {
                if(i == 0) {
                    dp[i][j] = j;
                } else if(j == 0) {
                    dp[i][j] = i;
                } else {
                    int changeFlag = (word1.charAt(i-1) == word2.charAt(j-1)) ? 0 : 1;
                    dp[i][j] = Math.min(dp[i-1][j-1] + changeFlag,
                            Math.min(dp[i-1][j] + 1, dp[i][j-1] + 1));
                }
            }
        }
        return dp[m][n];
    }
}
