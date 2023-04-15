package com.ninojay.leetcode.e搜索;

import com.ninojay.leetcode.util.NinoArrayUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/17
 */
public class SixNineFive695ByRecursion {

    public static void main(String[] args) {
        int[][] grid  = NinoArrayUtil.createTwoDimensionArray(
                     "[[0,0,1,0,0,0,0,1,0,0,0,0,0]," +
                        "[0,0,0,0,0,0,0,1,1,1,0,0,0]," +
                        "[0,1,1,0,1,0,0,0,0,0,0,0,0]," +
                        "[0,1,0,0,1,1,0,0,1,0,1,0,0]," +
                        "[0,1,0,0,1,1,0,0,1,1,1,0,0]," +
                        "[0,0,0,0,0,0,0,0,0,0,1,0,0]," +
                        "[0,0,0,0,0,0,0,1,1,1,0,0,0]," +
                        "[0,0,0,0,0,0,0,1,1,0,0,0,0]]");
        System.out.println(maxAreaOfIsland(grid));

    }


    /**
     * 相邻两个数 用来表示 上下左右
     * 比如 坐标 x = 3，y = 4
     * x + (-1) , y + 0 ：上
     * x + 0, y + 1; 右
     * x + 1, y + 0; 下
     * x + 0, y + (-1); 左
     */
    public static int[] direction = {-1, 0, 1, 0, -1};


    public static int maxAreaOfIsland(int[][] grid) {
        if(grid == null || grid[0].length == 0) {
            return 0;
        }
        int result_count = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j< grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    result_count = Math.max(result_count, dfs(grid, i, j));
                }
            }
        }
        return result_count;
    }





    /**
     * 通过栈来实现dfs
     * 这种做法 最后的结果是 该二维数组变为了全0
     * @param grid
     * @return
     */
    public static int dfs(int[][] grid, int i, int j) {
        if(grid[i][j] == 0) {
            return 0;
        }
        grid[i][j] = 0;
        int temp_count = 1;
        for(int k = 0; k < 4; k++) {
            int x = i + direction[k];
            int y = j + direction[k + 1];
            if(x >=0 && x < grid.length && y >=0 && y < grid[0].length && grid[x][y] == 1) {
                temp_count = temp_count + dfs(grid, x, y);
            }
        }
        return temp_count;
    }

}
