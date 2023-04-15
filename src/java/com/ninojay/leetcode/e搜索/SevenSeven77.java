package com.ninojay.leetcode.e搜索;

import com.ninojay.leetcode.util.NinoCollectionUtil;

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
        int n = 1;
        int k = 1;
        NinoCollectionUtil.printListListInteger(combine(n, k));
    }

    public static List<List<Integer>> combine(int n, int k) {
        backTracking(1, n, k);
        return result;
    }

    private static void backTracking(int current, int n, int k) {
        if(temp_result.size() + (n - current + 1) < k) {
            return;
        }

        if(temp_result.size() == k) {
            result.add(new ArrayList<>(temp_result));
            return;
        }

        temp_result.add(current);
        backTracking(current + 1, n, k);
        temp_result.remove(temp_result.size() - 1);

        // 考虑不选择当前位置
        backTracking(current + 1, n, k);


    }

}
