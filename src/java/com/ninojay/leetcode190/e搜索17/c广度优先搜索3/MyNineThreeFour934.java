package com.ninojay.leetcode190.e搜索17.c广度优先搜索3;

import com.ninojay.leetcode190.util.NinoArrayUtil;

import java.util.LinkedList;

/**
 *
 * @author zengzhongjie
 * @date 2023/2/18
 */
public class MyNineThreeFour934 {
    public static void main(String[] args) {
        int[][] grid = NinoArrayUtil.createTwoDimensionArray("[" +
                "[1,1,1,1,1], " +
                "[1,0,0,0,1], " +
                "[1,0,1,0,1], " +
                "[1,0,0,0,1], " +
                "[1,1,1,1,1]]");

        int[][] grid1 = NinoArrayUtil.createTwoDimensionArray("[" +
                "[0,1]," +
                "[1,0]]"); // 1

        int[][] grid2 = NinoArrayUtil.createTwoDimensionArray("[" +
                "[0,1,0]," +
                "[0,0,0]," +
                "[0,0,1]]"); // 2

        System.out.println(shortestBridge(grid2));
    }

    private static int[] direction = {-1, 0, 1, 0, -1};

    public static int shortestBridge(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;
        LinkedList<int[]> queue = new LinkedList<int[]>();

        boolean found_one_land = false;
        // 使用dfs把第一座岛全置为 2，同时将这座岛的 邻近0 放入队列
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                if(found_one_land) {
                    break;
                }
                if(grid[i][j] == 1) {
                    dfs(grid, i, j, rows, columns, queue);
                    found_one_land = true;
                    break;
                }
            }
        }

        int level = 0;
        while(!queue.isEmpty()) {
            level++;
            LinkedList<int[]> temp_queue = new LinkedList<>(queue);
            while(!temp_queue.isEmpty()) {
                int[] location = temp_queue.pollFirst();
                grid[location[0]][location[1]] = 2;

                for(int i = 0; i < 4; i ++) {
                    int x = location[0] + direction[i];
                    int y = location[1] + direction[i + 1];

                    if(x >= 0 && x < rows && y >= 0 && y < columns) {

                        if(grid[x][y] == 2) {
                            continue;
                        }
                        if(grid[x][y] == 1) {
                            return level;
                        }
                        queue.addLast(new int[]{x, y});
                        // 这里必须加上
                        grid[x][y] = 2;
                    }
                }
            }
        }
        return level;
    }

    private static void dfs(int[][] grid, int row, int column, int rows, int columns, LinkedList<int[]> queue) {
        if(row < 0 || row >= rows || column < 0 || column >= columns) {
            return;
        }
        if(grid[row][column] == 2) {
            return;
        }
        if(grid[row][column] == 0) {
            queue.addLast(new int[]{row, column});
            return;
        }

        grid[row][column] = 2;
        dfs(grid, row + 1, column, rows, columns, queue);
        dfs(grid, row - 1, column, rows, columns, queue);
        dfs(grid, row, column + 1, rows, columns, queue);
        dfs(grid, row, column - 1, rows, columns, queue);
    }
}
