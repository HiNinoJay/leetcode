package com.ninojay.leetcode190.f动态规划28.b二维3;

import com.ninojay.leetcode190.util.NinoCreationUtil;
import com.ninojay.leetcode190.util.NinoPrintUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/22
 */
public class TwoTwoOne221 {

    public static void main(String[] args) {
        char[][] matrix = NinoCreationUtil.createTwoDimensionCharArray("[[\"0\",\"1\"],[\"1\",\"0\"]]");
        char[][] matrix1 = NinoCreationUtil.createTwoDimensionCharArray("[[\"1\",\"0\",\"1\",\"0\",\"0\"],[\"1\",\"0\",\"1\",\"1\",\"1\"],[\"1\",\"1\",\"1\",\"1\",\"1\"],[\"1\",\"0\",\"0\",\"1\",\"0\"]]");
        NinoPrintUtil.printAllType(new TwoTwoOne221().maximalSquare(matrix1));
    }


    public int maximalSquare(char[][] matrix) {
        if(matrix == null) {
            return -1;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] dp = new int[rows + 1][columns + 1];
        int mat_side = 0;

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= columns; j++) {
                if(matrix[i - 1][j - 1] == '1') {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], dp[i][j - 1]);
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j]);
                    dp[i][j] += 1;
                }
                mat_side = Math.max(mat_side, dp[i][j]);
            }
        }

        return mat_side * mat_side;
    }
}
