package com.ninojay.leetcode190.m树29.a树的递归6;

import com.ninojay.leetcode190.struct.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author zengzhongjie
 * @date 2023/2/25
 */
public class OneOneOneZero1110 {

    static List<TreeNode> result = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode root = TreeNode.createBinaryTreeByInteger(1, 2, 3, 4, 5, 6, 7);
        TreeNode root1 = TreeNode.createBinaryTreeByInteger(1, 2, null, 4, 3);
        int[] to_delete = {3, 5};
        int[] to_delete1 = {2, 3};
        for(TreeNode node : delNodes(root, to_delete)) {
            System.out.println(node);
        }

    }

    public static List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        if(root == null) {
            return result;
        }
        HashSet<Integer> toDeleteMap = new HashSet<>();
        for(int num : to_delete) {
            toDeleteMap.add(num);
        }
        boolean rootFlag = delNodesByHashMap(root, toDeleteMap);
        if(!rootFlag) {
            result.add(root);
        }
        return result;
    }

    private static boolean delNodesByHashMap(TreeNode root, HashSet<Integer> toDeleteMap) {

        if(root == null) {
            return false;
        }

        boolean leftFlag = delNodesByHashMap(root.left, toDeleteMap);
        boolean rightFlag = delNodesByHashMap(root.right, toDeleteMap);

        if(leftFlag) {
            root.left = null;
        }
        if(rightFlag) {
            root.right = null;
        }

        if(toDeleteMap.contains(root.val)) {
            if(root.left != null) {
                result.add(root.left);
            }
            if(root.right != null) {
                result.add(root.right);
            }
            toDeleteMap.remove(root.val);
            return true;
        }

        return false;
    }
}
