package com.ninojay.leetcode190.m树29;

import com.ninojay.leetcode190.struct.TreeNode;

/**
 * @author zengzhongjie
 * @date 2023/2/25
 */
public class TwoTwoSix226 {

    public static void main(String[] args) {
        TreeNode root = TreeNode.createBinaryTreeByInteger(4,2,7,1,3,6,9);
        TreeNode.printTreeNode(invertTree(root));
    }

    public static TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
