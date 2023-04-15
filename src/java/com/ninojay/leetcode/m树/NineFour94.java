package com.ninojay.leetcode.m树;

import com.ninojay.leetcode.struct.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zengzhongjie
 * @date 2023/2/28
 */
public class NineFour94 {

    static ArrayList<Integer> result = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode root = TreeNode.createBinaryTreeByInteger(1, null, 2, 3);
        for(Integer num : inorderTraversal(root)) {
            System.out.print(num + " ");
        }
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        helper(root);
        return result;
    }

    private static void helper(TreeNode root) {
        if(root == null)  return ;
        inorderTraversal(root.left);
        result.add(root.val);
        inorderTraversal(root.right);
    }

}
