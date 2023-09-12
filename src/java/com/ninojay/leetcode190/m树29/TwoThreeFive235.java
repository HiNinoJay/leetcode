package com.ninojay.leetcode190.m树29;

import com.ninojay.leetcode190.struct.TreeNode;

/**
 * @author zengzhongjie
 * @date 2023/2/26
 */
public class TwoThreeFive235 {
    public static void main(String[] args) {
        TreeNode root = TreeNode.createBinarySearchTreeByInteger(6,2,8,0,4,7,9,null,null,3,5);
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(8);
        TreeNode result = lowestCommonAncestor(root, p, q);
        result.left = null;
        result.right = null;
        System.out.println(result);
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val == p.val) return root;
        if(root.val == q.val) return root;
        if(root.val < q.val && root.val < p.val) return lowestCommonAncestor(root.right, p, q);
        else if(root.val > q.val && root.val > p.val) return lowestCommonAncestor(root.left, p, q);
        else return root;
    }
}
