package com.ninojay.leetcode190.m树29;

import com.ninojay.leetcode190.struct.TreeNode;

import java.util.ArrayList;

/**
 * @author zengzhongjie
 * @date 2023/2/26
 */
public class EightNineSeven897 {
    public static void main(String[] args) {
        TreeNode root = TreeNode.createBinarySearchTreeByInteger(5,3,6,2,4,null,8,1,null,null,null,7,9);
        TreeNode.printTreeNode(increasingBST(root));
    }

    public static TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> nums = new ArrayList<>();
        helper(root, nums);
        TreeNode newRoot = new TreeNode(nums.get(0));
        TreeNode temp = newRoot;
        for(int i = 1; i < nums.size(); i++) {
               temp.right = new TreeNode(nums.get(i));
               temp = temp.right;
        }
        return newRoot;
    }

    private static void helper(TreeNode root, ArrayList<Integer> nums) {
        if(root == null) return;
        helper(root.left, nums);
        nums.add(root.val);
        helper(root.right, nums);
    }
}
