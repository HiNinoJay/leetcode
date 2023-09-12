package com.ninojay.leetcode190.m树29;

import com.ninojay.leetcode190.struct.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author zengzhongjie
 * @date 2023/2/26
 */
public class SixFiveThree653 {

    public static void main(String[] args) {
        TreeNode root = TreeNode.createBinarySearchTreeByInteger(5,3,6,2,4,null,7);
        TreeNode root1 = TreeNode.createBinarySearchTreeByInteger(2, 1, 3);
        TreeNode root2 = TreeNode.createBinarySearchTreeByInteger(1);
        TreeNode root3 = TreeNode.createBinarySearchTreeByInteger(2,1,3);
        int k = 28;
        System.out.println(findTarget(root3, 4));
    }
    public static boolean findTarget(TreeNode root, int k) {
        if(root == null) return false;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        ArrayList<Integer> nums = new ArrayList<>();

        helper(root, nums, hashMap);
        for(int i = 0; i <nums.size(); i++) {
            hashMap.put(nums.get(i), hashMap.get(nums.get(i))-1);
            int second = k - nums.get(i);
            if(hashMap.containsKey(second) && hashMap.get(second) > 0) {
                return true;
            }
        }
        return false;
    }

    private static void helper(TreeNode root, ArrayList<Integer> nums, HashMap<Integer, Integer> hashMap) {
        if(root == null) return;

        helper(root.left, nums, hashMap);
        nums.add(root.val);
        if(!hashMap.containsKey(root.val)) {
            hashMap.put(root.val, 1);
        } else {
            hashMap.put(root.val, hashMap.get(root.val) + 1);
        }
        helper(root.right, nums, hashMap);
    }


}
