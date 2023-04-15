package com.ninojay.leetcode.e搜索;

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
        System.out.println(findCircleNum(isConnected));
    }

    public static int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int result_count = 0;
        for(int i = 0;i < isConnected.length; i++) {
            if(!visited[i]) {
                dfs(isConnected, i, visited);
                result_count++;
            }
        }
        return result_count;
    }

    private static void dfs(int[][] isConnected, int i, boolean[] visited) {
        visited[i] = true;
        for(int j = 0; j < isConnected[0].length; j++) {
            if(isConnected[i][j] == 1 && !visited[j]) {
                dfs(isConnected, j, visited);
            }
        }
    }


}
