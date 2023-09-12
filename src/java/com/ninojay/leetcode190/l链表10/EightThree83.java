package com.ninojay.leetcode190.l链表10;

import com.ninojay.leetcode190.struct.ListNode;

/**
 * @author zengzhongjie
 * @date 2023/2/26
 */
public class EightThree83 {
    public static void main(String[] args) {
        ListNode head = ListNode.createSinglyLinkedList(1, 1, 2, 3, 3);
        ListNode.printNonCycleSinglyLinkedList(deleteDuplicates(head));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode tempHead = head;
        int currentIndex = head.val;
        while(tempHead.next != null ) {

            if(tempHead.next.val == currentIndex) {
                tempHead.next = tempHead.next.next;
                continue;
            } else {
                currentIndex = tempHead.next.val;
                tempHead = tempHead.next;


            }
        }
        return head;
    }
}
