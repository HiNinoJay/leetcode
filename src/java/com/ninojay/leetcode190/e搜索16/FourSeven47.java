package com.ninojay.leetcode190.e搜索16;

import com.ninojay.leetcode190.util.NinoCreationUtil;
import com.ninojay.leetcode190.util.NinoPrintUtil;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author zengzhongjie
 * @date 2023/2/20
 */
public class FourSeven47 {


    public static void main(String[] args) {
        int[] nums = NinoCreationUtil.createOneDimensionArray(1, 1, 2);
        NinoPrintUtil.printAllType(new FourSeven47().permuteUnique(nums));
    }


    private List<List<Integer>> result = new ArrayList<>();

    private HashSet<String> theOne = new HashSet<>();

    public List<List<Integer>> permuteUnique(int[] nums) {

        if(nums == null) {
            return result;
        }
        backTracking(nums,  0);
        return  result;
    }

    private void backTracking(int[] nums, int index) {

        if(index >= nums.length) {
            return;
        }


        if(index == nums.length - 1) {
            List<Integer> tempResult = new ArrayList<>();
            StringBuilder tempOne = new StringBuilder();
            for(Integer num : nums) {
                tempResult.add(num);
                tempOne.append(num + ",");
            }
            if(!theOne.contains(tempOne.toString())) {
                theOne.add(tempOne.toString());
                result.add(tempResult);
            }
            return;
        }

        for(int i = index; i < nums.length; i++) {
            swap(nums, i, index);
            backTracking(nums, index + 1);
            swap(nums, i, index);
        }

    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }


}
