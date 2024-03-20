package com.ninojay.leetcode.m树29;

import com.ninojay.leetcode.struct.TreeNode;
import com.ninojay.leetcode.util.NinoPrintUtil;

import java.util.LinkedList;

/**
 * @author zengzhongjie
 * @date 2023/2/26
 */
public class FiveOneThree513 {

    public static void main(String[] args) {
        TreeNode root = TreeNode.createBinaryTreeByInteger(1,2,3,4,null,5,6,null,null,7);
        NinoPrintUtil.printAllType(findBottomLeftValue(root));
    }

    public static int findBottomLeftValue(TreeNode root) {
        if(root == null) return 0;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int result = root.val;
        boolean flag = false;
        while(!queue.isEmpty()) {

            LinkedList<TreeNode> tempQueue = new LinkedList<>(queue);
            result = queue.peekFirst().val;
            if(flag) return result;

            queue.clear();

            while(!tempQueue.isEmpty()) {
                TreeNode temp = tempQueue.pollFirst();
                if(temp.left != null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);
            }
            if(queue.isEmpty()) flag = true;
        }
        return result;
    }
}
