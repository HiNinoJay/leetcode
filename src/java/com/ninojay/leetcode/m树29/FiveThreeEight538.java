package com.ninojay.leetcode.m树29;

import com.ninojay.leetcode.struct.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author zengzhongjie
 * @date 2023/2/26
 */
public class FiveThreeEight538 {
    public static void main(String[] args) {
        TreeNode root = TreeNode.createBinarySearchTreeByInteger(4,1,6,0,2,5,7,null,null,null,3,null,null,null,8);
        TreeNode.printTreeNode(convertBST(root));
    }
    public static TreeNode convertBST(TreeNode root) {
        if(root == null) return null;

        ArrayList<Integer> nums = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        helper(root, nums);
        int tempSum = 0;
        for(int i = nums.size() - 1; i >= 0; i--) {
            tempSum += nums.get(i);
            hashMap.put(nums.get(i), tempSum);
        }

        helper2(root, hashMap);

        return root;
    }

    private static void helper2(TreeNode root, HashMap<Integer, Integer> hashMap) {
        if(root == null) return;
        root.val = hashMap.get(root.val);
        helper2(root.left, hashMap);
        helper2(root.right, hashMap);
    }

    private static void helper(TreeNode root, ArrayList<Integer> nums) {
        if (root == null) {
            return;
        }
        helper(root.left, nums);
        nums.add(root.val);
        helper(root.right, nums);
    }

}
