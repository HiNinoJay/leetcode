package com.ninojay.leetcode190.f动态规划28.b二维3;

import com.ninojay.leetcode190.util.NinoCreationUtil;
import com.ninojay.leetcode190.util.NinoPrintUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/22
 */
public class SixFour64 {

    public static void main(String[] args) {
        int[][] grid = NinoCreationUtil.createTwoDimensionArray("[[1,3,1],[1,5,1],[4,2,1]]");
        NinoPrintUtil.printAllType(minPathSum(grid));
    }

    public static int minPathSum(int[][] grid) {

        int[][] dp = new int[grid.length][grid[0].length];

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(i == 0 && j == 0) {
                    dp[i][j] = grid[i][j];
                    continue;
                }
                if(i == 0) {
                    dp[i][j] = dp[i][j-1] + grid[i][j];
                    continue;
                }
                if(j == 0) {
                    dp[i][j] = dp[i - 1][j] + grid[i][j];
                    continue;
                }
                dp[i][j] = Math.min(dp[i - 1][j] + grid[i][j], dp[i][j - 1] + grid[i][j]);
            }
        }
        return dp[grid.length - 1][grid[0].length - 1];
    }
}
