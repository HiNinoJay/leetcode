package com.ninojay.leetcode190.j数据结构28.b栈和队列3;

import java.util.LinkedList;

/**
 * @author zengzhongjie
 * @date 2023/2/27
 */
public class TwoThreeTwo232 {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        System.out.println(myQueue.peek()); // return 1
        System.out.println(myQueue.pop()); // return 1, queue is [2]
        System.out.println(myQueue.empty()); // return false

    }

    static class MyQueue {
        LinkedList<Integer> stack1 = null;
        LinkedList<Integer> stack2 = null;

        public MyQueue() {
            stack1 = new LinkedList<>();
            stack2 = new LinkedList<>();
        }

        public void push(int x) {
            stack2.push(x);
        }

        public int pop() {
            if(stack1.isEmpty()) {
                while(!stack2.isEmpty()) {
                    stack1.push(stack2.pop());
                }
            }
            if(empty()) {
                return -1;
            }
            return stack1.pop();
        }

        public int peek() {
            if(stack1.isEmpty()) {
                while(!stack2.isEmpty()) {
                    stack1.push(stack2.pop());
                }
            }
            if(empty()) {
                return -1;
            }
            return stack1.peek();
        }

        public boolean empty() {
            return stack1.isEmpty() && stack2.isEmpty() ? true : false;
        }
    }
}
