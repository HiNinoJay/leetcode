package com.ninojay.leetcode190.l链表10;

import com.ninojay.leetcode190.struct.ListNode;

import java.util.LinkedList;

/**
 * @author zengzhongjie
 * @date 2023/2/26
 */
public class OneSixZero160 {
    public static void main(String[] args) {

    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode tempHeadA = headA;
        ListNode tempHeadB = headB;
        LinkedList<ListNode> stackA = new LinkedList<>();
        LinkedList<ListNode> stackB = new LinkedList<>();

        while(tempHeadA != null) {
            stackA.push(tempHeadA);
            tempHeadA = tempHeadA.next;
        }
        while(tempHeadB != null) {
            stackB.push(tempHeadB);
            tempHeadB = tempHeadB.next;
        }
        if(stackA.peek() != stackB.peek()) {
            return null;
        }
        ListNode result = stackA.peek();
        while(!stackA.isEmpty() && !stackB.isEmpty() && stackA.peek() == stackB.peek()) {
            result = stackA.pop();
            stackB.pop();
        }
        return result;
    }
}
