package com.ninojay.leetcode.e搜索;

import com.ninojay.leetcode.util.NinoArrayUtil;

import java.util.LinkedList;

/**
 *
 * @author zengzhongjie
 * @date 2023/2/18
 */
public class NineThreeFour934 {
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

        System.out.println(shortestBridge(grid));
    }

    private static int[] direction = {-1, 0, 1, 0, -1};

    public static int shortestBridge(int[][] grid) {

        int rows = grid.length;
        int columns = grid[0].length;

        LinkedList<Node> points = new LinkedList<>();
        boolean flipped = false;

        for (int i = 0; i < rows; ++i) {
            if (flipped) {
                break;
            }
            for (int j = 0; j < columns; ++j) {
                if (grid[i][j] == 1) {
                    // dfs寻找第一个岛屿，并把1全部赋值为2
                    dfs(points, grid, rows, columns, i, j);
                    // 说明找到第一个岛屿了
                    flipped = true;
                    break;
                }
            }
        }

        // bfs寻找第二个岛屿，并把过程中经过的0赋值为2
        // points中已经记录了，第一个岛屿的相邻海洋
        int level = 0;
        // points当中全是 代表海洋的0,我们要去填
        while (!points.isEmpty()){

            // 当前填的第几次
            ++level;
            LinkedList<Node> temp_points = new LinkedList<>(points);

            while (!temp_points.isEmpty()) {

                Node point = temp_points.pollFirst();
                grid[point.i][point.j] = 2;

                for (int k = 0; k < 4; ++k) {

                    int x = point.i + direction[k];
                    int y = point.j + direction[k + 1];

                    if (x >= 0 && y >= 0 && x < rows && y < columns) {

                        if (grid[x][y] == 2) {
                            continue;
                        }

                        if (grid[x][y] == 1) {
                            // 说明找到了
                            return level;
                        }
                        if(grid[x][y] == 0) {
                            points.addLast(new Node(x, y));
                            grid[x][y] = 2;
                        }
                    }
                }
            }
        }
        return 0;
    }

    // 辅函数
    private static void dfs(LinkedList<Node> points, int[][] grid, int rows, int columns , int row, int column) {

        // 遇到边界
        if (row < 0 || column < 0 || row == rows || column == columns) {
            return;
        }

        if(grid[row][column] == 2) {
            return;
        }

        // 0 为海洋，也即我们要去寻找过程中的，步骤
        if (grid[row][column] == 0) {
            points.addLast(new Node(row, column));
            return;
        }

        grid[row][column] = 2;
        dfs(points, grid, rows, columns, row - 1, column);
        dfs(points, grid, rows, columns, row + 1, column);
        dfs(points, grid, rows, columns, row, column - 1);
        dfs(points, grid, rows, columns, row, column + 1);
    }

    static class Node {
        public int i;
        public int j;
        public Node(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

}
