package com.ninojay.leetcode.m树;

import com.ninojay.leetcode.struct.TreeNode;

/**
 * @author zengzhongjie
 * @date 2023/2/25
 */
public class OneZeroOne101 {
    public static void main(String[] args) {
        TreeNode root = TreeNode.createBinaryTreeByInteger(1,2,2,3,4,4,3);
        System.out.println(isSymmetric(root));
    }

    public static boolean isSymmetric(TreeNode root) {
        return root != null ? isSymmetric(root.left, root.right) : true;
    }

    private static boolean isSymmetric(TreeNode left, TreeNode right) {
        if(left == null && right == null) {
            return true;
        }
        if((left != null && right == null) || (left == null && right != null)) {
            return false;
        }
        if(left.val != right.val) {
            return false;
        }
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }

}
