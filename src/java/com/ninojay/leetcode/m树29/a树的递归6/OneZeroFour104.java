package com.ninojay.leetcode.m树29.a树的递归6;

import com.ninojay.leetcode.struct.TreeNode;
import com.ninojay.leetcode.util.NinoPrintUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/23
 */
public class OneZeroFour104 {

    public static void main(String[] args) {
        TreeNode root = TreeNode.createBinaryTreeByInteger(3,9,20,null,null,15,7);
        NinoPrintUtil.printAllType(maxDepth(root));
    }

    public static int maxDepth(TreeNode root) {

        if(root == null) return 0;

        if(root.left == null && root.right == null) {
            return 1;
        }
        int left_depth = 0;
        int right_depth = 0;
        if(root.left != null) {
            left_depth =  maxDepth(root.left) + 1;
        }
        if(root.right != null) {
            right_depth = maxDepth(root.right) + 1;
        }

        return left_depth > right_depth ? left_depth : right_depth;
    }
}
