package com.ninojay.leetcode.e搜索.b回溯法;

import com.ninojay.leetcode.util.NinoCreationUtil;
import com.ninojay.leetcode.util.NinoPrintUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zengzhongjie
 * @date 2023/2/18
 */
public class FourSix46 {

    public static void main(String[] args) {
        int[] nums = NinoCreationUtil.createOneDimensionArray(1, 2, 3);
        NinoPrintUtil.printAllType(new FourSix46().permute(nums));
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backTracking(nums, 0, result);
        return result;
    }

    private void backTracking(int[] nums, int level, List<List<Integer>> result) {
        if(level == nums.length - 1) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int num : nums) {
                temp.add(num);
            }
            result.add(temp);
            return;
        }

        for(int i = level; i < nums.length; i++) {
            swap(nums, i, level);
            backTracking(nums, level + 1, result);
            swap(nums, i, level);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
