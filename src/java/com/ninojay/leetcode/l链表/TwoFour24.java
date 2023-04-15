package com.ninojay.leetcode.l链表;

import com.ninojay.leetcode.struct.ListNode;

/**
 * @author zengzhongjie
 * @date 2023/2/26
 */
public class TwoFour24 {
    public static void main(String[] args) {
        ListNode head = ListNode.createSinglyLinkedList(1, 2, 3, 4);
        ListNode head1 = ListNode.createSinglyLinkedList(1);
        ListNode head2 = null;
        ListNode.printNonCycleSinglyLinkedList(swapPairs(head2));
    }

    public static ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode left = head.next.next;
        head.next.next = null;
        ListNode first = head.next;
        head.next = null;
        ListNode second = head;
        first.next = second;
        second.next = swapPairs(left);
        return first;
    }
}
