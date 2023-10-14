package com.ninojay.leetcode190.e搜索16.b回溯法4;

import com.ninojay.leetcode190.util.NinoCreationUtil;
import com.ninojay.leetcode190.util.NinoPrintUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/18
 */
public class SevenNine79 {


    public static void main(String[] args) {
        char[][] board = NinoCreationUtil.createTwoDimensionCharArray("[" +
                "[\"A\",\"B\",\"C\",\"E\"]," +
                "[\"S\",\"F\",\"C\",\"S\"]," +
                "[\"A\",\"D\",\"E\",\"E\"]]");
        String word = "ABC";
        NinoPrintUtil.printAllType(new SevenNine79().exist(board, word));
    }

    private int[] position = new int[]{-1, 0, 1, 0, -1};
    private boolean result = false;

    public boolean exist(char[][] board, String word) {

        int currentIndex = 0;
        char[] words = word.toCharArray();

        int rows = board.length;
        int columns = board[0].length;
        boolean[][] visited = new boolean[rows][columns];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                if(board[i][j] == words[0]) {
                    dfs(visited, board, i, j, words, currentIndex);
                }
            }
        }
        return result;
    }

    private void dfs(boolean[][] visited, char[][] board, int i, int j, char[] words, int currentIndex) {

        if(currentIndex == words.length - 1) {
            if(board[i][j] == words[currentIndex]) {
                result = true;
            }
        }

        if(board[i][j] != words[currentIndex]) {
            return;
        }
        visited[i][j] = true;
        // 来到这里就说明当前字符相同，找下一个相同字符
        for(int k = 0; k < 4; k++) {
            int m = i + position[k];
            int n = j + position[k+1];
            if(m >= 0 && m < board.length && n >=0 && n < board[0].length
                    && !visited[m][n]
                    && (currentIndex + 1 < words.length) && words[currentIndex + 1] == board[m][n]) {
                dfs(visited, board, m, n, words, currentIndex + 1);
            }
        }
        visited[i][j] = false;
    }



}
