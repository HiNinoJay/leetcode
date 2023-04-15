package com.ninojay.leetcode.l链表;

import com.ninojay.leetcode.struct.ListNode;

/**
 * @author zengzhongjie
 * @date 2023/2/27
 */
public class Two2 {
    public static void main(String[] args) {
        ListNode l1 = ListNode.createSinglyLinkedList(9,9,9,9,9,9,9);
        ListNode l2 = ListNode.createSinglyLinkedList(9,9,9,9);
        ListNode.printNonCycleSinglyLinkedList(addTwoNumbers(l1, l2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) {
            // 处理末尾进位
            ListNode templ1 = l1;
            while (l1.val >= 10) {
                if(l1.next == null) {
                    l1.next = new ListNode(1);
                } else {
                    l1.next.val++;
                }
                l1.val -= 10;
                l1 = l1.next;
            }
            return templ1;
        }



        l1.val = l1.val + l2.val;
        if(l1.val >= 10)  {
            if(l1.next == null) {
                l1.next = new ListNode(1);
            } else {
                l1.next.val++;
            }
            l1.val -= 10;
        }
        l1.next = addTwoNumbers(l1.next, l2.next);
        return l1;
    }
}
