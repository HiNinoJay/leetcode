package com.ninojay.leetcode190.e搜索16.b回溯法4;

import com.ninojay.leetcode190.util.NinoPrintUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : zengzhongjie
 * @date :  2023/09/12 22:57
 */
public class FiveOne51 {

    public static void main(String[] args) {
        NinoPrintUtil.printAllType(new FiveOne51().solveNQueens(4));
    }


    private List<List<String>> result = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        // 题目暗含了一个信息，每行最终只会有一个皇后
        // 所以我们就由每行来进行遍历
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        backTracking(board, 0, n);
        return result;
    }

    private void backTracking(char[][] board, int row, int n) {
        if(row == n) {
            List<String> tempResult = new ArrayList<>();
            Arrays.stream(board).forEach(a -> {
                tempResult.add(new String(a));
            });
            result.add(tempResult);
            return;
        }

        for(int col = 0; col < n; col++) {
            if(isValid(board, row, col, n)) {
                board[row][col] = 'Q';
                backTracking(board, row + 1, n);
                board[row][col] = '.';
            }
        }
    }

    private boolean isValid(char[][] board, int row, int col, int n) {

        // 判断该列有没有皇后
        for(int i = 0; i < n; i++) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }
        // 判断左上角有没有皇后
        for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--,j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        // 判断右上角有没有皇后
        for(int i = row-1, j = col + 1; i>=0&&j<n; i--,j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
}
