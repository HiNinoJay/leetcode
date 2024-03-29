package com.ninojay.leetcode.l链表10.b其他链表操作2;

import com.ninojay.leetcode.struct.ListNode;
import com.ninojay.leetcode.util.NinoPrintUtil;

import java.util.LinkedList;

/**
 * @author zengzhongjie
 * @date 2023/2/26
 */
public class TwoThreeFour234 {

    public static void main(String[] args) {
        ListNode head = ListNode.createSinglyLinkedList(1, 2, 2, 1);
        ListNode head1 = ListNode.createSinglyLinkedList(1, 2);
        NinoPrintUtil.printAllType(isPalindrome(head1));
    }

    public static boolean isPalindrome(ListNode head) {
        if(head == null) return false;
        LinkedList<Integer> stack = new LinkedList<>();
        LinkedList<Integer> queue = new LinkedList<>();

        ListNode tempHead = head;
        while(tempHead != null) {
            queue.addLast(tempHead.val);
            stack.push(tempHead.val);
            tempHead = tempHead.next;
        }

        while(!stack.isEmpty()) {
            if(stack.pop() != queue.pollFirst()) {
                return false;
            }
        }
        return true;
    }
}
