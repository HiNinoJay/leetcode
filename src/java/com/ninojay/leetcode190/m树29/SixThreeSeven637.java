package com.ninojay.leetcode190.m树29;

import com.ninojay.leetcode190.struct.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zengzhongjie
 * @date 2023/2/25
 */
public class SixThreeSeven637 {

    static List<Double> result = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode root = TreeNode.createBinaryTreeByInteger(3,9,20,null,null,15,7);
        for(Double num : averageOfLevels(root)) {
            System.out.print(num + " ");
        }
    }

    public static List<Double> averageOfLevels(TreeNode root) {
        if(root == null) return result;

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);

        while(!queue.isEmpty()) {
            int count = queue.size();
            Double average = 0d;
            LinkedList<TreeNode> temp_queue = new LinkedList<>(queue);
            queue.clear();

            while(!temp_queue.isEmpty()) {
                TreeNode temp = temp_queue.pollFirst();
                average += temp.val;
                if(temp.left != null) queue.addLast(temp.left);
                if(temp.right != null) queue.addLast(temp.right);
            }
            average = average / count;
            result.add(average);
        }
        return result;
    }
}
