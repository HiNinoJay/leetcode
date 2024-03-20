package com.ninojay.leetcode.m树29.a树的递归6;

import com.ninojay.leetcode.struct.TreeNode;
import com.ninojay.leetcode.util.NinoPrintUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/25
 */
public class FourThreeSeven437 {
    public static void main(String[] args) {
        TreeNode root = TreeNode.createBinaryTreeByInteger(10,5,-3,3,2,null,11,3,-2,null,1);
        TreeNode root1 = TreeNode.createBinaryTreeByInteger(1,null,2,null,3,null,4,null,5);
        int targetSum = 8;
        int targetSum1 = 3;
        TreeNode.printTreeNode(root1);
        NinoPrintUtil.printAllType(pathSum(root1, targetSum1));
    }

    public static int pathSum(TreeNode root, int targetSum) {
        return root != null ? pathSumStartWithRoot(root, targetSum)
                + pathSum(root.left, targetSum)
                + pathSum(root.right, targetSum) : 0;

    }

    private static int pathSumStartWithRoot(TreeNode root, long targetSum) {
        if(root == null) return 0;
        long val = root.val;
        int count  = val == targetSum ? 1 : 0;
        count += pathSumStartWithRoot(root.left, targetSum - val);
        count += pathSumStartWithRoot(root.right, targetSum - val);
        return count;
    }
}
