package com.ninojay.leetcode190.m树29;

import com.ninojay.leetcode190.struct.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 不实用递归实现 先序遍历
 * @author zengzhongjie
 * @date 2023/2/25
 */
public class OneFourFour144 {
    static List<Integer> result = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode root = TreeNode.createBinaryTreeByInteger(1, 2, 3, 4);
        TreeNode.printTreeNode(root);
        for(Integer num : preorderTraversal(root)) {
            System.out.print(num + " ");
        }
    }
    public static List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) return result;
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            result.add(temp.val);
            // 这里很有意思，是先压 右 后 压左， 这样就可以保证左子树先遍历，
            if(temp.right != null) {
                stack.push(temp.right);
            }
            if(temp.left != null) {
                stack.push(temp.left);
            }
        }
        return result;
    }


}
