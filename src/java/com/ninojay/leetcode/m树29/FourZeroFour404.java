package com.ninojay.leetcode.m树29;

import com.ninojay.leetcode.struct.TreeNode;
import com.ninojay.leetcode.util.NinoPrintUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/26
 */
public class FourZeroFour404 {

    static int result = 0;
    public static void main(String[] args) {
        TreeNode root = TreeNode.createBinaryTreeByInteger(3,9,20,null,null,15,7);
        TreeNode root1 = TreeNode.createBinaryTreeByInteger(1);
        NinoPrintUtil.printAllType(sumOfLeftLeaves(root1));
    }

    public static int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 0;

        sum(root.left, true);
        sum(root.right, false);
        return result;
    }

    private static void sum(TreeNode root, boolean leftFlag) {
        if(root == null) {
            return;
        }
        if(leftFlag && root.left == null && root.right == null) {
            result += root.val;
            return;
        }
        sum(root.left, true);
        sum(root.right, false);
    }
}
