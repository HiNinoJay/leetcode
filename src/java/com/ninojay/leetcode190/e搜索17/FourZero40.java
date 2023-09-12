package com.ninojay.leetcode190.e搜索17;

import com.ninojay.leetcode190.util.NinoArrayUtil;
import com.ninojay.leetcode190.util.NinoCollectionUtil;

import java.util.*;

/**
 * todo
 * @author zengzhongjie
 * @date 2023/2/20
 */
public class FourZero40 {

    static List<Integer> path=new ArrayList<>();
    static List<List<Integer>> res=new ArrayList<>();




    public static void main(String[] args) {
        int[] candidates = NinoArrayUtil.createOneDimensionArray(10,1,2,7,6,1,5);
        int[] candidates1 = NinoArrayUtil.createOneDimensionArray(2,5,2,1,2);

        // 1 1 2 2 2 3 4 4 4
        int[] candidates2 = NinoArrayUtil.createOneDimensionArray(4,4,2,1,4,2,2,1,3);
        int[] candidates3 = NinoArrayUtil.createOneDimensionArray(14,6,25,9,30,20,33,34,28,30,16,12,31,9,9,12,34,16,25,32,8,7,30,12,33,20,21,29,24,17,27,34,11,17,30,6,32,21,27,17,16,8,24,12,12,28,11,33,10,32,22,13,34,18,12);



        int target = 8;
        int target1 = 5;
        int target2 = 6;
        int target3 = 27;
        List<List<Integer>> lists = combinationSum2(candidates3, target3);

        NinoCollectionUtil.printListListInteger(lists);
    }


    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        // 这一步排序很关键
        Arrays.sort(candidates);
        backTracking(candidates,target,0,0);
        return res;

    }

    private static void backTracking(int[] candidates, int target, int sum, int startindex) {

        if(sum > target) {
            return;
        }

        if(sum == target){
            res.add(new ArrayList(path));
        }

        for(int i = startindex; i < candidates.length; i++){

            // 可以避免相同的情况筛选两次（一次原生For循环，一次是递归）
            if(i > 0 && candidates[i] == candidates[i - 1] && i > startindex) {
                continue;
            }

            path.add(candidates[i]);

            backTracking(candidates, target, sum + candidates[i], i + 1);
            // 回溯，回到这个状态
            path.remove(path.size() - 1);
        }

    }

}
