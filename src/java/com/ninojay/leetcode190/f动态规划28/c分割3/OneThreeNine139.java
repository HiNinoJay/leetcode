package com.ninojay.leetcode190.f动态规划28.c分割3;

import java.util.Arrays;
import java.util.List;

/**
 * @author : zengzhongjie
 * @date : 2023/9/13 00:00
 */
public class OneThreeNine139 {
    public static void main(String[] args) {

        String s = "applepenapple";
        List<String> wordDict = Arrays.asList("apple", "pen");
        System.out.println(new OneThreeNine139().wordBreak(s,  wordDict));
    }


    public boolean wordBreak(String s, List<String> wordDict) {

		int n = s.length();
        // 这里的动态规划数组 代表的含义是 当前位置能不能划分
        boolean[] dp = new boolean[n+1];
        // 先让 0 位置能够被划分
        dp[0] = true;
        for(int i = 1; i <= n; i++) {
            // i 是作为 匹配到的数 的坐标下一位
            for(String word : wordDict) {
                // 集合中的每个字符串 都进行匹配
                int len = word.length();
                if(i >= len && s.substring(i - len, i).equals(word)) {
                    // 一旦匹配上，注意，开始的坐标是 i-len 可以为 0 ， i作为截取的右端，是下一个字符串的起点
                    // 所以 dp[i-len] 的含义即是 能不能划分，如果上一个为true,则说明这一个地方能划分
                    dp[i] = dp[i] || dp[i - len];
                }
            }
        }
        return dp[n];
    }
    
}
