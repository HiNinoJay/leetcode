package com.ninojay.leetcode190.m树29;

import com.ninojay.leetcode190.struct.TreeNode;

/**
 * @author zengzhongjie
 * @date 2023/2/25
 */
public class SixOneSeven617 {
    public static void main(String[] args) {
        TreeNode root1 = TreeNode.createBinaryTreeByInteger(1,3,2,5);
        TreeNode root2 = TreeNode.createBinaryTreeByInteger(2,1,3,null,4,null,7);
        TreeNode.printTreeNode(mergeTrees(root1, root2));

    }
    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null) {
            return root2;
        }
        if(root2 == null) {
            return root1;
        }

        root1.val = root1.val + root2.val;
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);
        return root1;
    }
}
