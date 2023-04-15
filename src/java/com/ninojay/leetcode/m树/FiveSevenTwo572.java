package com.ninojay.leetcode.m树;

import com.ninojay.leetcode.struct.TreeNode;

/**
 * @author zengzhongjie
 * @date 2023/2/25
 */
public class FiveSevenTwo572 {

    public static void main(String[] args) {
        TreeNode root = TreeNode.createBinaryTreeByInteger(3, 4 ,5, 1, 2);
        TreeNode subRoot = TreeNode.createBinaryTreeByInteger(4, 1, 2);
        System.out.println(isSubtree(root, subRoot));
    }

    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) {
            return false;
        }
        return isSameTree(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }


    private static boolean isSameTree(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null) {
            return true;
        }
        if((root == null && subRoot != null) || (root != null && subRoot == null)) {
            // root有后续也不行，必须和subRoor完全一致
            return false;
        }

        if(root.val != subRoot.val) {
            return false;
        }

        return isSameTree(root.left, subRoot.left) && isSameTree(root.right, subRoot.right);
    }
}
