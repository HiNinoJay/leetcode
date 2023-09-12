package com.ninojay.leetcode190.e搜索17;

import com.ninojay.leetcode190.struct.TreeNode;

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
        for(String s : binaryTreePaths(root1)) {
            System.out.println(s);
        }
    }

    public static List<String> binaryTreePaths(TreeNode root) {
        if(root == null) return new ArrayList<String>();
        ArrayList<String> result = new ArrayList<>();
        StringBuilder tempString = new StringBuilder();
        dfs(root, tempString, result);
        return result;
    }

    private static void dfs(TreeNode root, StringBuilder tempString, ArrayList<String> result) {
        if(root == null) {
            return;
        }
        tempString.append(root.val);
        if(root.left == null && root.right == null) {
            result.add(tempString.toString());
            return;
        }
        tempString.append("->");
        if(root.left != null) {
            dfs(root.left, new StringBuilder(tempString), result);
        }
        if(root.right != null) {
            dfs(root.right, new StringBuilder(tempString), result);
        }
    }
}
