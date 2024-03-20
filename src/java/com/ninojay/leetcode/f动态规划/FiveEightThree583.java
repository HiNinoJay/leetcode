package com.ninojay.leetcode.f动态规划;

import com.ninojay.leetcode.util.NinoPrintUtil;

/**
 * @author : zengzhongjie
 * @date : 2023/9/13 00:05
 */
public class FiveEightThree583 {
    public static void main(String[] args) {
        String word1 = "sea";
        String word2 = "eat";
        NinoPrintUtil.printAllType(new FiveEightThree583().minDistance(word1, word2));
    }

    public int minDistance(String word1, String word2) {

        // 最长公共子串的变种题
        // 也就是说 先求出最长公共子串的 长度 max
        // 结果即为 word1 - max  + word2 - max
        // 而求最长公共子串可以用dp 1143题已做过
        int max = getMax(word1, word2);
        return word1.length() - max + word2.length() - max;
    }

    private int getMax(String word1, String word2) {

        // dp[2][3] 代表 字符串1 的第2字符 到 字符串2的第3个字符，当前位置最长公共子串的 长度为多少
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];

        for(int i = 1; i <= word1.length(); i++) {
            for(int j = 1; j <= word2.length(); j++) {
                if(word1.charAt(i-1) == word2.charAt(j-1)) {
                    // 相同，则为，两个字符串的上一位置 长度 + 1
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    // 不同，则为，分别看两个字符串上一位置 更长的那个
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }
}
