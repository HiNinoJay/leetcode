package com.ninojay.leetcode190.e搜索16;

import com.ninojay.leetcode190.util.NinoArrayUtil;

/**
 * @author : zengzhongjie
 * @date : 2023/9/12 23:00
 */
public class ThreeSeven37 {
    public static void main(String[] args) {

        char[][] board = NinoArrayUtil.createTwoDimensionCharArray("[[\"5\",\"3\",\".\",\".\",\"7\",\".\",\".\",\".\",\".\"],[\"6\",\".\",\".\",\"1\",\"9\",\"5\",\".\",\".\",\".\"],[\".\",\"9\",\"8\",\".\",\".\",\".\",\".\",\"6\",\".\"],[\"8\",\".\",\".\",\".\",\"6\",\".\",\".\",\".\",\"3\"],[\"4\",\".\",\".\",\"8\",\".\",\"3\",\".\",\".\",\"1\"],[\"7\",\".\",\".\",\".\",\"2\",\".\",\".\",\".\",\"6\"],[\".\",\"6\",\".\",\".\",\".\",\".\",\"2\",\"8\",\".\"],[\".\",\".\",\".\",\"4\",\"1\",\"9\",\".\",\".\",\"5\"],[\".\",\".\",\".\",\".\",\"8\",\".\",\".\",\"7\",\"9\"]]");
        NinoArrayUtil.printTwoDimensionCharArray(board);
        new ThreeSeven37().solveSudoku(board);
        NinoArrayUtil.printTwoDimensionCharArray(board);
    }

    public void solveSudoku(char[][] board) {
        // 关键点是要记录 行 、 列 、3x3  这三块对于一个数 是否被使用的状态
        // 二维数组，三维数组 可以派上用场
        int rows = board.length;
        int cols = board[0].length;

        // rowUserd[2][3] 代表 第 (2+1)3 行的 数字3 已经被使用
        boolean[][] rowUsed = new boolean[rows][10];
        boolean[][] colUsed = new boolean[cols][10];

        // boxUsed[2/3][3/3][3] 代表 第二个 3*3 里的 数字 3 已经被使用
        boolean[][][] boxUsed = new boolean[rows][cols][10];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                int num = board[i][j] - '0';
                if(1 <= num && num <= 9) {
                    // 去设置好已经存在的状态
                    rowUsed[i][num] = true;
                    colUsed[j][num] = true;
                    boxUsed[i/3][j/3][num] = true;
                }
            }
        }


        backTracking(board, rowUsed, colUsed, boxUsed, 0, 0);
    }

    private boolean backTracking(char[][] board,
                                 boolean[][] rowUsed, boolean[][] colUsed, boolean[][][] boxUsed,
                                 int row, int col) {

        if(col == board[0].length) {
            // 一列到头了
            col = 0;
            row++;
            if(row == board.length) {
                // 行列都到头了
                return true;
            }
            return backTracking(board, rowUsed, colUsed, boxUsed, row, col);
        }

        if(board[row][col] == '.') {

            // 尝试去填写
            for(int i = 1; i <= 9; i++) {

                if(!rowUsed[row][i] && !colUsed[col][i] && !boxUsed[row/3][col/3][i]) {
                    board[row][col] = (char)(i+'0');
                    rowUsed[row][i] = true;
                    colUsed[col][i] = true;
                    boxUsed[row/3][col/3][i] = true;

                    if(backTracking(board, rowUsed, colUsed, boxUsed, row, col + 1)) {
                        return true;
                    }

                    board[row][col] = '.';
                    rowUsed[row][i] = false;
                    colUsed[col][i] = false;
                    boxUsed[row/3][col/3][i] = false;
                }
            }

        } else {
            return backTracking(board, rowUsed, colUsed, boxUsed, row, col+1);
        }

        return false;
    }

//runtime:2 ms
//memory:39 MB

}
