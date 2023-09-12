package com.ninojay.leetcode.e搜索.a深度优先搜索;

import com.ninojay.leetcode.util.NinoArrayUtil;
import com.ninojay.leetcode.util.NinoCollectionUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zengzhongjie
 * @date 2023/2/18
 */
public class FourOneSeven417 {

    public static void main(String[] args) {
        int[][] heights = NinoArrayUtil.createTwoDimensionArray("" +
                "[[1,2,2,3,5]," +
                "[3,2,3,4,4]," +
                "[2,4,5,3,1]," +
                "[6,7,1,4,5]," +
                "[5,1,1,2,4]]");
        List<List<Integer>> lists = pacificAtlantic(heights);
        NinoCollectionUtil.printListListInteger(lists);
    }

    public static int[] direction = {-1, 0, 1, 0, -1};

    public static List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows = heights.length;
        int columns = heights[0].length;

        boolean[][] reach_pacific = new boolean[rows][columns];
        boolean[][] reach_atlantic = new boolean[rows][columns];

        List<List<Integer>> result = new ArrayList<>();

        // 上下方向
        for(int i = 0; i < columns; i++) {
            dfs(heights, reach_pacific, 0, i);
            dfs(heights, reach_atlantic, rows - 1, i);
        }

        for(int i = 0; i < rows; i++) {
            dfs(heights, reach_pacific, i, 0);
            dfs(heights, reach_atlantic, i, columns - 1);
        }

        for(int i = 0; i < heights.length; i++) {
            for(int j = 0; j < heights[0].length; j++) {
                if(reach_pacific[i][j] && reach_atlantic[i][j]) {
                    ArrayList<Integer> locations = new ArrayList<>();
                    locations.add(i);
                    locations.add(j);
                    result.add(locations);
                }
            }
        }
        return result;
    }

    private static void dfs(int[][] heights, boolean[][] flag, int i, int j) {
        if(flag[i][j]) {
            return;
        }
        flag[i][j] = true;

        for(int k = 0; k < 4; k++) {
            int x = i + direction[k];
            int y = j + direction[k+1];
            if(x >=0 && x < heights.length && y >= 0 && y < heights[0].length && heights[x][y] >= heights[i][j]) {
                dfs(heights, flag, x, y);
            }
        }

    }


}
