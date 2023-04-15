package com.ninojay.leetcode.m树;

import com.ninojay.leetcode.struct.TreeNode;

import java.util.HashMap;

/**
 * todo
 * @author zengzhongjie
 * @date 2023/2/26
 */
public class EightEightNine889 {
    public static void main(String[] args) {
        int[] preorder = {1,2,4,5,3,6,7};
        int[] postorder = {4,5,2,6,7,3,1};
        TreeNode.printTreeNode(constructFromPrePost(preorder, postorder));
    }
    public static TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        TreeNode root = new TreeNode(preorder[0]);
        HashMap<Integer, Integer> postorderMap = new HashMap<>();
        for(int i = 0; i < postorder.length; i++) {
            postorderMap.put(postorder[i], i);
        }

        constructFromPrePost(root, preorder, 0, 0, postorder.length - 2, postorderMap);
        return root;
    }

    private static TreeNode constructFromPrePost(TreeNode root, int[] preorder, int preOrderIndex, int postOrderStartIndex, int postOrderEndIndex, HashMap<Integer, Integer> postorderMap) {

        return null;
    }
}
