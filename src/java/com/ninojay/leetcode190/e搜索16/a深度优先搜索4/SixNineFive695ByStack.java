package com.ninojay.leetcode190.e搜索16.a深度优先搜索4;

import com.ninojay.leetcode190.util.NinoCreationUtil;
import com.ninojay.leetcode190.util.NinoPrintUtil;

import java.util.LinkedList;

/**
 * @author zengzhongjie
 * @date 2023/2/17
 */
public class SixNineFive695ByStack {

    public static void main(String[] args) {
        int[][] grid  = NinoCreationUtil.createTwoDimensionArray(
                     "[[0,0,1,0,0,0,0,1,0,0,0,0,0]," +
                        "[0,0,0,0,0,0,0,1,1,1,0,0,0]," +
                        "[0,1,1,0,1,0,0,0,0,0,0,0,0]," +
                        "[0,1,0,0,1,1,0,0,1,0,1,0,0]," +
                        "[0,1,0,0,1,1,0,0,1,1,1,0,0]," +
                        "[0,0,0,0,0,0,0,0,0,0,1,0,0]," +
                        "[0,0,0,0,0,0,0,1,1,1,0,0,0]," +
                        "[0,0,0,0,0,0,0,1,1,0,0,0,0]]");
        NinoPrintUtil.printAllType(maxAreaOfIsland(grid));
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
        int rows = grid.length;
        int columns = grid[0].length;

        int result_count = 0;
        LinkedList<Node> stack = new LinkedList<Node>();

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                if(grid[i][j] == 1) {
                    grid[i][j] = 0;

                    int temp_count = 1;
                    stack.push(new Node(i, j));

                    while(stack.peek() != null) {
                        Node temp = stack.pop();
                        for(int k = 0; k < 4; k++) {
                            int x = temp.i + direction[k];
                            int y = temp.j + direction[k + 1];
                            if(x >=0 && x < rows && y >=0 && y < columns && grid[x][y] == 1) {
                                grid[x][y] = 0;
                                temp_count++;
                                stack.push(new Node(x, y));
                            }
                        }
                    }
                    result_count = Math.max(result_count, temp_count);
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
    public static int learnMaxAreaOfIslandByStackDFS(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;

        // 记录某次岛屿搜索出的数量
        int local_area;
        int result_area = 0;

        // 记录下一个位置
        int x,y;

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j) {

                // 选择可以搜索的开头
                if (grid[i][j] == 1) {

                    local_area = 1;

                    // 设置已经访问
                    grid[i][j] = 0;

                    // 从这个开头的 搜索位置 入栈
                    LinkedList<Node> island = new LinkedList<>();
                    island.push(new Node(i, j));

                    // 开启dfs
                    while (island.peek() != null) {
                        Node temp = island.pop();
                        // 查询四个方向
                        for (int k = 0; k < 4; ++k) {
                            x = temp.i + direction[k];
                            y = temp.j + direction[k+1];
                            if (x >= 0 && x < rows && y >= 0 && y < columns && grid[x][y] == 1) {
                                // 在二维数组的范围，且为1
                                grid[x][y] = 0;
                                ++local_area;
                                // 压入栈
                                island.push(new Node(x, y));
                            }
                        }
                    }
                    result_area = Math.max(result_area, local_area);
                }
            }
        }
        return result_area;
    }

    static class Node {
        int i;
        int j;
        public Node(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
}
