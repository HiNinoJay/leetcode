package com.ninojay.leetcode190.m树29;

import com.ninojay.leetcode190.struct.TreeNode;

/**
 * @author zengzhongjie
 * @date 2023/2/25
 */
public class SixSixNine669 {
    public static void main(String[] args) {
        TreeNode root = TreeNode.createBinarySearchTreeByInteger(1, 0, 2);
        int low = 1;
        int high = 2;
        TreeNode.printTreeNode(trimBST(root, low, high));

    }

    public static TreeNode trimBST(TreeNode root, int low, int high) {
        if(root == null) return null;
        if(root.val < low) {
            return trimBST(root.right, low, high);
        }
        if(root.val > high) {
            return trimBST(root.left, low, high);
        }

        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);

        return root;
    }
}
