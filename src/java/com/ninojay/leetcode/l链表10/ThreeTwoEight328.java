package com.ninojay.leetcode.l链表10;

import com.ninojay.leetcode.struct.ListNode;

/**
 * @author zengzhongjie
 * @date 2023/2/27
 */
public class ThreeTwoEight328 {

    public static void main(String[] args) {
        ListNode head = ListNode.createSinglyLinkedList(1, 2, 3, 4, 5);
        ListNode.printNonCycleSinglyLinkedList(oddEvenList(head));
    }

    public static ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return head;

        ListNode secondHead = null;
        ListNode secondTail = null;
        ListNode firstHead = null ;
        ListNode firstTail = null;
        ListNode temphead = head;

        int count = 1;
        while(temphead != null) {
            ListNode temp = temphead;
            temphead = temphead.next;
            temp.next = null;
            if(count % 2 != 0) {
                if(firstHead == null) {
                    firstHead = temp;
                    firstTail = temp;
                }
                else {
                    firstTail.next = temp;
                    firstTail = temp;
                }
            } else {
                if(secondHead == null) {
                    secondHead = temp;
                    secondTail = temp;
                }
                else {
                    secondTail.next = temp;
                    secondTail = temp;
                }
            }
            count++;
        }
        firstTail.next = secondHead;
        return firstHead;
    }
}
