package com.ninojay.leetcode190.m树29;

import com.ninojay.leetcode190.struct.TreeNode;
import com.ninojay.leetcode190.util.NinoPrintUtil;

import java.util.ArrayList;

/**
 * @author zengzhongjie
 * @date 2023/2/26
 */
public class FiveThreeZero530 {
    public static void main(String[] args) {
        TreeNode root = TreeNode.createBinarySearchTreeByInteger(4, 2, 6, 1, 3);
        NinoPrintUtil.printAllType(getMinimumDifference(root));

    }
    public static int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> nums = new ArrayList<>();
        helper(root, nums);

        int result = Integer.MAX_VALUE;
        for(int i = 0; i + 1 < nums.size(); i++) {
            int temp = Math.abs(nums.get(i) - nums.get(i + 1));
            if(result > temp) {
                result = temp;
            }
        }
        return result;
    }

    private static void helper(TreeNode root, ArrayList<Integer> nums) {
        if(root == null) return;
        helper(root.left, nums);
        nums.add(root.val);
        helper(root.right, nums);
    }
}
