package com.ninojay.leetcode.j数据结构;

import java.util.LinkedList;

/**
 * @author zengzhongjie
 * @date 2023/2/27
 */
public class TwoTwoFive225 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.top()); // 返回 2
        System.out.println(myStack.pop()); // 返回 2
        System.out.println(myStack.empty()); // 返回 False

    }
    static class MyStack {

        LinkedList<Integer> queue1 = null;
        LinkedList<Integer> queue2 = null;

        public MyStack() {
            queue1 = new LinkedList<>();
            queue2 = new LinkedList<>();
        }

        public void push(int x) {
            queue2.addLast(x);
            while(!queue1.isEmpty()) {
                queue2.addLast(queue1.pollFirst());
            }
            LinkedList temp = queue1;
            queue1 = queue2;
            queue2 = temp;
        }

        public int pop() {
            if(empty()) return -1;
            return queue1.pollFirst();

        }

        public int top() {
            if(empty()) return -1;
            return queue1.peekFirst();
        }

        public boolean empty() {
            return queue1.isEmpty() ? true : false;
        }
    }


}
