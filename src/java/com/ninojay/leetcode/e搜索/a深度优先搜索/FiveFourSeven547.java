package com.ninojay.leetcode.e搜索.a深度优先搜索;

import com.ninojay.leetcode.util.NinoArrayUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/18
 */
public class FiveFourSeven547 {

    public static void main(String[] args) {
        int[][] isConnected = NinoArrayUtil.createTwoDimensionArray("" +
                "[[1,1,0]," +
                "[1,1,0]," +
                "[0,0,1]]");
        System.out.println(new FiveFourSeven547().findCircleNum(isConnected));
    }

    public int findCircleNum(int[][] isConnected) {

        int personNum = isConnected.length;
        // 对称数组，一维数组即可表达 是否被访问过
        boolean[] personVisited = new boolean[personNum];
        int result = 0;
        for(int i = 0; i < personNum; i++) {
            if(!personVisited[i]) {
                // 如果没有被访问过，即为一个开始，自然加一
                result++;
                // 开始找相邻
                dfs(isConnected, i, personVisited);
            }
        }
        return result;
    }

    private void dfs(int[][] isConnected, int i, boolean[] personVisited) {
        // 置为 访问过 这个人的状态，这个人已经被纳入了一个朋友圈
        personVisited[i] = true;
        // 直接去 找这个人 挨着的人
        for(int k = 0; k < isConnected.length; k++) {
            if(isConnected[i][k] == 1 && !personVisited[k]) {
                // 如果是有连接状态，并且 连接的对象 本身还没有被访问过
                // 那么可以进一步dfs
                dfs(isConnected, k, personVisited);
            }
        }
    }


}
