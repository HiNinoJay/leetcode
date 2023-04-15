package com.ninojay.leetcode.m树;

import com.ninojay.leetcode.struct.TreeNode;

import java.util.HashMap;

/**
 * @author zengzhongjie
 * @date 2023/2/25
 */
public class OneZeroFive105 {
    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        TreeNode.printTreeNode(buildTree(preorder, inorder));
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> inOrderMap = new HashMap<>();
        for(int i = 0; i < inorder.length; i++) {
            inOrderMap.put(inorder[i], i);
        }
        return buildTree(preorder, 0, 0,  inorder.length - 1,  inorder, inOrderMap);
    }

    private static TreeNode buildTree(int[] preorder, int rootIndex, int inOrderStartIndex, int inOrderEndIndex, int[] inorder , HashMap<Integer, Integer> inOrderMap) {

        if(rootIndex < 0 || rootIndex > preorder.length - 1 || inOrderStartIndex >= inorder.length || inOrderEndIndex < 0 || inOrderStartIndex > inOrderEndIndex) {
            return null;
        }
        int rootVal = preorder[rootIndex];
        int inOrderIndex = inOrderMap.get(rootVal);
        int leftLength = inOrderIndex - inOrderStartIndex;

        TreeNode root = new TreeNode(rootVal);
        root.left = buildTree(preorder, rootIndex + 1, inOrderStartIndex, inOrderIndex - 1, inorder, inOrderMap);
        root.right = buildTree(preorder, rootIndex + leftLength + 1, inOrderIndex + 1, inOrderEndIndex, inorder, inOrderMap);
        return root;
    }
}
