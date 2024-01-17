package com.ninojay.leetcode190.f动态规划28.b二维3;

import com.ninojay.leetcode190.util.NinoCreationUtil;
import com.ninojay.leetcode190.util.NinoPrintUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/22
 */
public class FiveFourTwo542 {
    public static void main(String[] args) {
        int[][] mat = NinoCreationUtil.createTwoDimensionArray("[[0,0,0],[0,1,0],[0,0,0]]");
        int[][] mat1 = NinoCreationUtil.createTwoDimensionArray("[[0,0,0],[0,1,0],[1,1,1]]");
        NinoPrintUtil.printAllType(new FiveFourTwo542().updateMatrix(mat1));
    }


    public int[][] updateMatrix(int[][] mat) {
        if(mat == null) {
            return null;
        }
        int rows = mat.length;
        int columns = mat[0].length;
        int[][] dp = new int[rows][columns];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                dp[i][j] = 10000;
            }
        }


        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                if(mat[i][j] == 0) {
                    dp[i][j] = 0;
                } else {
                    if(j > 0) {
                        dp[i][j] = Math.min(dp[i][j], dp[i][j - 1] + 1);
                    }
                    if(i > 0) {
                        dp[i][j] = Math.min(dp[i][j], dp[i - 1][j] + 1);
                    }
                }
            }
        }
        for(int i = rows - 1; i >= 0; i--) {
            for(int j = columns - 1; j >= 0; j--) {
                if(mat[i][j] != 0) {
                    if(j < columns - 1) {
                        dp[i][j] = Math.min(dp[i][j], dp[i][j + 1] + 1);
                    }
                    if(i < rows - 1) {
                        dp[i][j] = Math.min(dp[i][j], dp[i + 1][j] + 1);
                    }
                }
            }
        }
        return dp;
    }

    public static int[][] learnupdateMatrix(int[][] mat) {

        if(mat == null) {
            return null;
        }

        int rows = mat.length;
        int columns = mat[0].length;

        int[][] dp = new int[rows][columns];

        // 将dp所有的数设置为最大
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j ++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        // 从左上角，往右下角判断
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j) {
                if (mat[i][j] == 0) {
                    // 如果就是0，说明位置为0
                    dp[i][j] = 0;
                } else {
                    // 说明不是0，则至少和0相隔1
                    if (j > 0) {
                        // 并不是第一列,将（当前位置 和 前一列+1）探索最小
                        dp[i][j] = Math.min(dp[i][j], dp[i][j-1] + 1);
                    }
                    if (i > 0) {
                        // 并不是第一行,将（当前位置 和 上一行+1）探索最小
                        dp[i][j] = Math.min(dp[i][j], dp[i-1][j] + 1);
                    }
                }
            }
        }

        // 从右下角，往左上角判断
        for (int i = rows - 1; i >= 0; --i) {
            for (int j = columns - 1; j >= 0; --j) {
                if (mat[i][j] != 0) {
                    if (j < columns - 1) {
                        // 当前位置 和 下一列 + 1
                        dp[i][j] = Math.min(dp[i][j], dp[i][j+1] + 1);
                    }
                    if (i < rows - 1) {
                        // 当前位置 和 下一行 + 1
                        dp[i][j] = Math.min(dp[i][j], dp[i+1][j] + 1);
                    }
                }
            }
        }
        return dp;
    }
}
