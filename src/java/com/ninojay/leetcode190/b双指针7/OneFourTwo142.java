package com.ninojay.leetcode190.b双指针7;

import com.ninojay.leetcode190.struct.ListNode;
import com.ninojay.leetcode190.util.NinoPrintUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/13
 */
public class OneFourTwo142 {

    public static void main(String[] args) {
        ListNode head = ListNode.createCycleSinglyLinkedList(1, 3, 2, 0, -4);
        NinoPrintUtil.printAllType(detectCycle(head));
    }

    public static ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        // floyd判圈算法，快慢指针第一次相遇
        do{
            if(fast == null || fast.next == null) {
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
        } while(fast != slow);

        fast = head;
        while(fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

}
