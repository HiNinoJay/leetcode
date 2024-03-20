package com.ninojay.leetcode190.e搜索;

import com.ninojay.leetcode190.struct.TreeNode;
import com.ninojay.leetcode190.util.NinoPrintUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zengzhongjie
 * @date 2023/2/20
 */
public class TwoFiveSeven257 {

    public static void main(String[] args) {

        TreeNode root = TreeNode.createBinaryTreeByInteger(1,2,3,null,5);
        TreeNode root1 = TreeNode.createBinaryTreeByInteger(1);

        NinoPrintUtil.printAllType(new TwoFiveSeven257().binaryTreePaths(root1));
    }

    private List<String> result = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {

        List<String> result = new ArrayList<>();

        if(root == null) {
            return result;
        }
        String startNode = "" + root.val;
        dfs(root, startNode);
        return  result;
    }

    private void dfs(TreeNode root, String startNode) {
        if(root.left == null && root.right == null) {
            // 说明找到 子节点了
            result.add(startNode);
            return;
        }
        if(root.left != null) {
            dfs(root.left, startNode + "->" + root.left.val);
        }
        if(root.right != null) {
            dfs(root.right, startNode + "->" + root.right.val);
        }
    }
}
