package com.ninojay.leetcode.struct;

import java.util.LinkedList;

/**
 * @author zengzhongjie
 * @date 2023/2/20
 */
public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
    public static TreeNode createBinaryTreeByInteger(Integer... nums) {

        TreeNode root = new TreeNode(nums[0]);
        LinkedList<TreeNode> queue = new LinkedList<>();
        LinkedList<Integer> index_queue = new LinkedList<>();

        queue.addLast(root);
        index_queue.addLast(0);

        while(!queue.isEmpty()) {
            TreeNode temp = queue.pollFirst();
            int index = index_queue.pollFirst();

            if(temp != null) {
                int left_index = index * 2 + 1;
                int right_index = index * 2 + 2;

                if(left_index < nums.length) {
                    TreeNode temp_left = null;
                    if(nums[left_index] != null) {
                        temp_left = new TreeNode(nums[left_index]);
                        queue.addLast(temp_left);
                        index_queue.addLast(left_index);
                    }
                    temp.left = temp_left;
                }
                if(right_index < nums.length) {
                    TreeNode temp_right = null;
                    if(nums[right_index] != null) {
                        temp_right = new TreeNode(nums[right_index]);
                        queue.addLast(temp_right);
                        index_queue.addLast(right_index);
                    }
                    temp.right = temp_right;
                }
            }
        }
        return root;
     }

    /**
     * 创建一个BST树
     * @param nums
     * @return
     */
     public static TreeNode createBinarySearchTreeByInteger(Integer... nums) {
        TreeNode root = new TreeNode(nums[0]);
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != null) insertBinarySearchTree(root, nums[i]);
        }
        return root;
     }

    /**
     * 向BST中插入一个元素
     * @param root
     * @param num
     * @return
     */
    private static TreeNode insertBinarySearchTree(TreeNode root, Integer num) {

        if(root == null) {
            root = new TreeNode(num);
        } else if(num < root.val) {
            root.left = insertBinarySearchTree(root.left, num);
        } else if(num > root.val) {
            root.right = insertBinarySearchTree(root.right, num);
        }
        return root;
    }

    /**
     * 寻找BST中最小的元素
     * @param root
     * @return
     */
    public static TreeNode findMinInBinarySearchTree(TreeNode root) {
        if(root == null || root.left == null) return root;
        return findMinInBinarySearchTree(root.left);
    }

    /**
     * 寻找BST中最大的元素
     * @param root
     * @return
     */
    public static TreeNode findMaxInBinarySearchTree(TreeNode root) {
        if(root == null || root.right == null) return root;
        return findMaxInBinarySearchTree(root.right);
    }



    public static void printTreeNode(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);
        System.out.println(root.val);

        while(!queue.isEmpty()) {
            LinkedList<TreeNode> temp_queue = new LinkedList<>(queue);
            queue.clear();
            StringBuilder nextLine = new StringBuilder();
            while(!temp_queue.isEmpty()) {
                TreeNode tempNode = temp_queue.pollFirst();
                if(tempNode.left != null) {
                    queue.add(tempNode.left);
                    nextLine.append(tempNode.left.val + " ");
                } else {
                    nextLine.append("null ");
                }
                if(tempNode.right != null) {
                    queue.add(tempNode.right);
                    nextLine.append(tempNode.right.val + " ");
                } else {
                    nextLine.append("null ");
                }
            }
            System.out.println(nextLine.toString());
        }
     }

    /**
     * 先序便利
     * @param root
     */
    public static void preOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
     }

     public static void inOrder(TreeNode root) {
         if(root == null) {
             return;
         }

         preOrder(root.left);
         System.out.print(root.val + " ");
         preOrder(root.right);
     }

    public static void postOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.val + " ");
    }
}
