package com.ninojay.leetcode190.e搜索16.b回溯法4;

import com.ninojay.leetcode190.util.NinoPrintUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zengzhongjie
 * @date 2023/2/18
 */
public class SevenSeven77 {

    static List<List<Integer>> result = new ArrayList<>();
    static List<Integer> temp_result = new ArrayList<>();

    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        NinoPrintUtil.printAllType(new SevenSeven77().combine(n, k));
    }

    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tempResult = new ArrayList<>();

        int tempCount = 0;
        backTracking(result, tempResult, tempCount, 1, n, k);
        return result;
    }

    private void backTracking(List<List<Integer>> result, List<Integer> tempResult,
                              int tempCount, int startN, int n, int k) {

        if(tempCount == k) {
            result.add(new ArrayList<Integer>(tempResult));
            return;
        }
        for(int i = startN; i <= n; i++) {
            tempResult.add(i);
            tempCount++;
            backTracking(result, tempResult, tempCount, i + 1, n, k);
            tempCount--;
            tempResult.remove(tempCount);
        }
    }

}
