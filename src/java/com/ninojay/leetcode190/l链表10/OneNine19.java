package com.ninojay.leetcode190.l链表10;

import com.ninojay.leetcode190.struct.ListNode;

/**
 * @author zengzhongjie
 * @date 2023/2/27
 */
public class OneNine19 {
    public static void main(String[] args) {
        ListNode head = ListNode.createSinglyLinkedList(1, 2, 3, 4, 5);
        ListNode head1 = ListNode.createSinglyLinkedList(1,2);

        int n = 5;
        int n1 = 2;

        ListNode.printNonCycleSinglyLinkedList(removeNthFromEnd(head, n));
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || (head.next == null && n >= 1)) return null;

        ListNode fast = head;
        ListNode slow = head;
        while(n > 0) {
            fast = fast.next;
            n--;
        }
        if(fast == null) {
            return  head.next;
        }

        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp.next = null;
        return head;

    }
}
