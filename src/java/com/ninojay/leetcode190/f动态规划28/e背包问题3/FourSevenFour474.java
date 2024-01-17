package com.ninojay.leetcode190.f动态规划28.e背包问题3;

import com.ninojay.leetcode190.util.NinoCreationUtil;
import com.ninojay.leetcode190.util.NinoPrintUtil;

/**
 * @author : zengzhongjie
 * @date : 2023/9/13 00:02
 */
public class FourSevenFour474 {
    public static void main(String[] args) {

        String[] strings = NinoCreationUtil.createOneStringDimension("10", "0001", "111001", "1", "0");
        NinoPrintUtil.printAllType(new FourSevenFour474().findMaxForm(strings, 5, 3));
    }

    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(String str : strs) {
            Node temp = Node.getNodeInfo(str);
            for(int i = m; i >= temp.count0; i--) {
                for(int j = n; j >= temp.count1; j--) {
                    dp[i][j] = Math.max(dp[i][j], 1 + dp[i - temp.count0][j - temp.count1]);
                }
            }
        }
        return dp[m][n];
    }
    static class Node {
        int count0;
        int count1;
        public static Node getNodeInfo(String str) {
            Node node = new Node();
            node.count0 = str.length();
            for(Character c : str.toCharArray()) {
                if(c == '1') {
                    node.count0--;
                    node.count1++;
                }
            }
            return node;
        }
    }
}
