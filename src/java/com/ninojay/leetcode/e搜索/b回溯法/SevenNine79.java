package com.ninojay.leetcode.e搜索.b回溯法;

import com.ninojay.leetcode.util.NinoArrayUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/18
 */
public class SevenNine79 {

    static boolean result = false;

    public static void main(String[] args) {
        char[][] board = NinoArrayUtil.createTwoDimensionCharArray("[" +
                "[\"A\",\"B\",\"C\",\"E\"]," +
                "[\"S\",\"F\",\"C\",\"S\"]," +
                "[\"A\",\"D\",\"E\",\"E\"]]");
        String word = "ABCB";
        System.out.println(exist(board, word));
    }

    public static boolean exist(char[][] board, String word) {
        int rows = board.length;
        int columns = board[0].length;

        boolean[][] visited = new boolean[rows][columns];

        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                 dfs(board, i, j, word, 0, visited);
            }
        }
        return result;

    }

    private static void dfs(char[][] board, int row, int column, String word, int postion, boolean[][] visited) {

        // 遇到边界
        if(row < 0 || row >= board.length || column < 0 || column >= board[0].length) {
            return;
        }

        if(!visited[row][column] && board[row][column] == word.charAt(postion)) {
            visited[row][column] = true;

            if(postion == word.length() - 1)  {
                result = true;
                return;
            }
            dfs(board, row - 1 , column, word, postion + 1, visited);
            dfs(board, row + 1, column, word, postion + 1, visited);
            dfs(board, row , column - 1, word, postion + 1, visited);
            dfs(board, row , column + 1, word, postion + 1, visited);
            visited[row][column] = false;
        }

    }

}
