package com.ninojay.leetcode.l链表10.a链表的基本操作3;

import com.ninojay.leetcode.struct.ListNode;

/**
 * @author zengzhongjie
 * @date 2023/2/26
 */
public class TwoZeroSix206 {
    public static void main(String[] args) {
        ListNode head = ListNode.createSinglyLinkedList(1, 2, 3, 4, 5);
        ListNode.printNonCycleSinglyLinkedList(reverseList(head));
    }

    public static ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode newHead = head;

        while(newHead.next != null) {
            newHead = newHead.next;
        }
        doReverse(head);
        return newHead;

    }

    private static ListNode doReverse(ListNode head) {
        if(head.next == null) return head;
        ListNode tempNode = doReverse(head.next);
        head.next = null;
        tempNode.next = head;
        return head;
    }
}
