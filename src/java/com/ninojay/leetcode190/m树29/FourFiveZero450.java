package com.ninojay.leetcode190.m树29;

import com.ninojay.leetcode190.struct.TreeNode;

/**
 * todo
 * @author zengzhongjie
 * @date 2023/3/1
 */
public class FourFiveZero450 {


    public static void main(String[] args) {
        TreeNode root = TreeNode.createBinarySearchTreeByInteger(5,3,6,2,4,null,7);
        TreeNode root1 = TreeNode.createBinarySearchTreeByInteger(5, 3);
        int key = 6;
        int key1 = 5;
        TreeNode.printTreeNode(deleteNode(root1, key1));
    }


    public static TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if(root.val == key) {
            TreeNode rightRoot = root.right;
            TreeNode leftRoot = root.left;
            // 说明是根结点
            if(rightRoot == null && leftRoot == null) return null;
            TreeNode findLeftNode = findLeftAndBreakLinks(rightRoot);
            root.right = null;
            root.left = null;
            if(findLeftNode != null && findLeftNode == rightRoot) {
                findLeftNode.left = leftRoot;
                return findLeftNode;
            }
            if(findLeftNode != null && findLeftNode != rightRoot) {
                findLeftNode.right = rightRoot;
                findLeftNode.left = leftRoot;
                return findLeftNode;
            }
            return leftRoot;
        }
        root.left = deleteNode(root.left, key);
        root.right = deleteNode(root.right, key);
        return root;

    }

    private static TreeNode findLeftAndBreakLinks(TreeNode rightRoot) {

        if(rightRoot == null ||rightRoot.left == null) {
            return rightRoot;
        }
        TreeNode temp = rightRoot.left;
        if(temp.left == null) {
            // 说明到达了最底部的左端
            rightRoot.left = null;
        }
        return findLeftAndBreakLinks(temp);
    }
}
