package com.ninojay.leetcode190.m树29;

import com.ninojay.leetcode190.struct.TreeNode;
import com.ninojay.leetcode190.util.NinoArrayUtil;

import java.util.HashMap;

/**
 * @author zengzhongjie
 * @date 2023/2/28
 */
public class OneZeroSix106 {

    public static void main(String[] args) {
        int[] inorder = NinoArrayUtil.createOneDimensionArray(9,3,15,20,7);
        int[] inorder1 = NinoArrayUtil.createOneDimensionArray(-1);

        int[] postorder = NinoArrayUtil.createOneDimensionArray(9,15,7,20,3);
        int[] postorder1 = NinoArrayUtil.createOneDimensionArray(-1);
        TreeNode.printTreeNode(buildTree(inorder1, postorder1));
    }

    public static TreeNode buildTree(int[] inorder, int[] postorder) {

        TreeNode root = new TreeNode(postorder[postorder.length - 1]);

        HashMap<Integer, Integer> inOrderMap = new HashMap<>();
        for(int i = 0; i < inorder.length; i++) {
            inOrderMap.put(inorder[i], i);
        }

        buildTree(root, inorder, 0, inorder.length - 1, postorder, postorder.length - 1, inOrderMap);
        return root;
    }

    private static TreeNode buildTree(TreeNode root, int[] inorder, int inOrderStartIndex, int inOrderEndIndex, int[] postorder, int postOrderIndex, HashMap<Integer, Integer> inOrderMap) {
        if(inOrderStartIndex > inOrderEndIndex || postOrderIndex < 0) return null;
        int val = postorder[postOrderIndex];
        if(root == null) {
            root = new TreeNode(val);
        }
        int inOrderIndex = inOrderMap.get(val);;
        int leftLength = inOrderIndex - inOrderStartIndex;
        int rightLength = inOrderEndIndex - inOrderIndex;
        if(leftLength > 0) {
            root.left = buildTree(root.left, inorder, inOrderStartIndex, inOrderIndex - 1, postorder, postOrderIndex - rightLength - 1, inOrderMap);
        }
        if(rightLength > 0) {
            root.right = buildTree(root.right, inorder, inOrderIndex + 1, inOrderEndIndex, postorder, postOrderIndex - 1, inOrderMap);
        }
        return root;
    }
}
