package com.ninojay.leetcode190.e搜索.c广度优先搜索;

import com.ninojay.leetcode190.util.NinoCreationUtil;
import com.ninojay.leetcode190.util.NinoPrintUtil;

import java.util.LinkedList;

/**
 *
 * @author zengzhongjie
 * @date 2023/2/18
 */
public class NineThreeFour934 {
    public static void main(String[] args) {
        int[][] grid = NinoCreationUtil.createTwoDimensionArray("[" +
                "[1,1,1,1,1], " +
                "[1,0,0,0,1], " +
                "[1,0,1,0,1], " +
                "[1,0,0,0,1], " +
                "[1,1,1,1,1]]");

        int[][] grid1 = NinoCreationUtil.createTwoDimensionArray("[" +
                "[0,1]," +
                "[1,0]]"); // 1

        int[][] grid2 = NinoCreationUtil.createTwoDimensionArray("[" +
                "[0,1,0]," +
                "[0,0,0]," +
                "[0,0,1]]"); // 2

        NinoPrintUtil.printAllType(new NineThreeFour934().shortestBridge(grid));
    }

    private int[] position = new int[]{-1, 0, 1, 0, -1};

    public int shortestBridge(int[][] grid) {


        // 先通过 dfs 将第一座岛屿弄成 2
        // 并且 记录第一外层的 0岛屿 到 队列中
        // 接着就能通过 bfs 一层层往外找

        LinkedList<Node> queue = new LinkedList<>();

        int rows =  grid.length;
        int columns =  grid[0].length;
        boolean findFirstIsland = false;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                if(grid[i][j] == 1) {
                    // 说明找到了第一座岛屿的开头
                    dfs(queue, grid, i, j);
                    findFirstIsland = true;
                    break;
                }
            }
            if(findFirstIsland) {
                break;
            }
        }

        // 代表层数
        int result = 0;
        while(!queue.isEmpty()) {
            result++;
            int levelCount = queue.size();
            while(levelCount-- > 0) {
                Node tempNode = queue.pollFirst();
                // 注意这里要先置为2，可以减少时间消耗
                grid[tempNode.i][tempNode.j] = 2;
                for(int k = 0; k < 4; k++) {
                    int m = tempNode.i + position[k];
                    int n = tempNode.j + position[k+1];
                    if(m >=0 && m < grid.length && n >=0 && n < grid[0].length) {
                        if(grid[m][n] == 2) {
                            continue;
                        }

                        if(grid[m][n] == 1) {
                            return result;
                        }
                        queue.addLast(new Node(m, n));
                        // 这里也可以先置为2，可以减少时间消耗
                        grid[m][n] = 2;
                    }
                }
            }

        }
        return result;
    }

    private void dfs(LinkedList<Node> queue,  int[][] grid, int i, int j) {

        if(grid[i][j] == 2) {
            return;
        }
        if(grid[i][j] == 0)  {
            queue.addLast(new Node(i, j));
            return;
        }

        grid[i][j] = 2;

        for(int k = 0; k < 4; k++) {
            int m = i + position[k];
            int n = j + position[k +1];

            if(m >= 0 && m < grid.length && n >=0 && n < grid[0].length) {
                dfs(queue, grid, m, n);
            }
        }


    }

    class Node{

        int i;
        int j;

        public Node(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }

        public int getJ() {
            return j;
        }

        public void setJ(int j) {
            this.j = j;
        }
    }

}
