package com.ninojay.leetcode.e搜索;

import com.ninojay.leetcode.util.NinoArrayUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/20
 */
public class OneThreeZero130 {

    public static void main(String[] args) {

        char[][] board = NinoArrayUtil.createTwoDimensionCharArray("[" +
                "[\"X\",\"X\",\"X\",\"X\"]," +
                "[\"X\",\"O\",\"O\",\"X\"]," +
                "[\"X\",\"X\",\"O\",\"X\"]," +
                "[\"X\",\"O\",\"X\",\"X\"]]");
        char[][] board1 = NinoArrayUtil.createTwoDimensionCharArray("[[\"X\"]]");
        char[][] board2 = NinoArrayUtil.createTwoDimensionCharArray("[[\"O\",\"O\"],[\"O\",\"O\"]]");
        solve(board);
        NinoArrayUtil.printTwoDimensionCharArray(board2);
    }
    public static void solve(char[][] board) {

        int rows = board.length;
        int columns = board[0].length;

        for(int i = 0; i < rows; i++) {
            dfs(board, i, 0, rows, columns);
            dfs(board, i, columns - 1, rows, columns);
        }
        for(int i = 0; i < columns; i++) {
            dfs(board, 0, i, rows, columns);
            dfs(board, rows - 1, i, rows, columns);
        }

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                if(board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
                if(board[i][j] == '-') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private static void dfs(char[][] board, int row, int column, int rows, int columns) {
        if(row < 0 || row >= rows || column < 0 || column >= columns || board[row][column] == 'X') {
            return;
        }
        if(board[row][column] == 'X' || board[row][column] == '-') {
            return;
        }
        board[row][column] = '-';
        dfs(board, row + 1, column, rows, columns);
        dfs(board, row - 1, column, rows, columns);
        dfs(board, row, column + 1, rows, columns);
        dfs(board, row, column - 1, rows, columns);
    }
}
