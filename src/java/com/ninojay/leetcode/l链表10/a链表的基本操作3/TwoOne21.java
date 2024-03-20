package com.ninojay.leetcode.l链表10.a链表的基本操作3;

import com.ninojay.leetcode.struct.ListNode;

/**
 * @author : zengzhongjie
 * @date : 2023/9/13 00:24
 */
public class TwoOne21 {
    public static void main(String[] args) {
        ListNode list1 = ListNode.createSinglyLinkedList(1, 2, 3);
        ListNode list2 = ListNode.createSinglyLinkedList(1, 1, 2);
        ListNode result = new TwoOne21().mergeTwoLists(list1, list2);
        ListNode.printNonCycleSinglyLinkedList(result);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // 这里的写法太简洁了，值得学习
        // 虚拟头节点
        ListNode tempHead = new ListNode(-1);
        ListNode cur = tempHead;

        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        cur.next = list1 != null ? list1 : list2;
        return tempHead.next;
    }
}
