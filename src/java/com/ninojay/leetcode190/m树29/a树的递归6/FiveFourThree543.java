package com.ninojay.leetcode190.m树29.a树的递归6;

import com.ninojay.leetcode190.struct.TreeNode;

/**
 * @author zengzhongjie
 * @date 2023/2/25
 */
public class FiveFourThree543 {
    private static int length = 0;
    public static void main(String[] args) {
        TreeNode root = TreeNode.createBinaryTreeByInteger(1, 2, 3, 4, 5, null, null);
        System.out.println(diameterOfBinaryTree(root));
    }

    public static int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return length;
    }

    private static int helper(TreeNode root) {
        if(root == null) {
            return 0;
        }
        // 先不断探底
        int left = helper(root.left);
        int right = helper(root.right);

        // 记录当前最长
        length = Math.max(left + right, length);

        // 返回的是左右中，最长的一端
        return Math.max(right, left) + 1;
    }


}
