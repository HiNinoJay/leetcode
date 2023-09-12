package com.ninojay.leetcode190.struct;

/**
 * @author zengzhongjie
 * @date 2023/2/13
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) {
        val = x;
        next = null;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", nextVal=" + next.val +
                '}';
    }

    public static ListNode createSinglyLinkedList(Integer... nums) {
        ListNode head = new ListNode(nums[0]);
        ListNode p = head;
        for(int i = 1; i < nums.length; i++) {
            ListNode temp = new ListNode(nums[i]);
            p.next = temp;
            p = temp;
        }
        return head;
    }

    /**
     * 可变参数是一个语法糖，本质上为数组
     * 可变参数必须放在最后一个
     * @param pos
     * @param nums
     * @return
     */
    public static ListNode createCycleSinglyLinkedList(int pos, Integer... nums) {
        ListNode head = new ListNode(nums[0]);
        ListNode p = head;
        ListNode posListNode = head;
        for(int i = 1; i < nums.length; i++) {
            ListNode temp = new ListNode(nums[i]);
            p.next = temp;
            p = temp;
            if(i == pos) {
                posListNode = p;
            }
        }
        p.next = posListNode;
        return head;
    }


    /**
     * 打印非循环单链表
     * @param listNode
     */
    public static void printNonCycleSinglyLinkedList(ListNode listNode) {
        System.out.println("该链表：");
        ListNode copy_listNode = listNode;
        while(copy_listNode != null) {
            System.out.print(copy_listNode.val+ " ");
            copy_listNode = copy_listNode.next;
        }
    }

}
