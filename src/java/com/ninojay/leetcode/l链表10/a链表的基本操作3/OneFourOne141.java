package com.ninojay.leetcode.l链表10.a链表的基本操作3;

import com.ninojay.leetcode.struct.ListNode;
import com.ninojay.leetcode.util.NinoPrintUtil;

/**
 * @author : zengzhongjie
 * @date : 2024/1/7 16:53
 */
public class OneFourOne141 {
    public static void main(String[] args) {
        ListNode list = ListNode.createCycleSinglyLinkedList(1, 3, 2, 0, -4);
        NinoPrintUtil.printAllType(new OneFourOne141().hasCycle(list));
    }

    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) {
            return false;
        }
        ListNode fast = head.next.next;
        ListNode slow = head.next;
        while(fast != slow) {
            fast = fast.next;
            if(fast == null) {
                return false;
            }
            fast = fast.next;
            if(fast == null) {
                return false;
            }
            slow = slow.next;
        }
        return true;

    }
}
