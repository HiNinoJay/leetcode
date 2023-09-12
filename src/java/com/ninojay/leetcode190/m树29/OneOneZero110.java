package com.ninojay.leetcode190.m树29;

import com.ninojay.leetcode190.struct.TreeNode;

/**
 * @author zengzhongjie
 * @date 2023/2/23
 */
public class OneOneZero110 {
    public static void main(String[] args) {
        TreeNode root = TreeNode.createBinaryTreeByInteger(3,9,20,null,null,15,7);
        System.out.println(isBalanced(root));
    }

    public static boolean isBalanced(TreeNode root) {
        return helper(root) != -1;
    }

    private static int helper(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int left = helper(root.left);
        int right = helper(root.right);
        if(left == -1 || right == -1 || Math.abs(left - right) > 1) {
            return -1;
        }
        return 1 + Math.max(left, right);
    }
}
