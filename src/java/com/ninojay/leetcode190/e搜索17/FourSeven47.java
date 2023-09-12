package com.ninojay.leetcode190.e搜索17;

import com.ninojay.leetcode190.util.NinoArrayUtil;
import com.ninojay.leetcode190.util.NinoCollectionUtil;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author zengzhongjie
 * @date 2023/2/20
 */
public class FourSeven47 {

    private static HashSet<String> demo = new HashSet<>();
    private static List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {
        int[] nums = NinoArrayUtil.createOneDimensionArray(1, 2, 3);
        NinoCollectionUtil.printListListInteger(permuteUnique(nums));
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        backTracking(nums, 0);
        return result;
    }

    private static void backTracking(int[] nums, int index) {


        if(index == nums.length - 1) {
            StringBuilder sb = new StringBuilder();
            ArrayList<Integer> temp_result = new ArrayList<>();
            for(int i = 0; i < nums.length; i++) {
                sb.append(nums[i]);
                temp_result.add(nums[i]);
            }
            if(!demo.contains(sb.toString())) {
                demo.add(sb.toString());
                result.add(temp_result);
            }
            return;
        }
        for(int i = index; i < nums.length; i++) {
            swap(nums, i, index);
            backTracking(nums, index + 1);
            swap(nums, i, index);
        }
    }

    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

}
