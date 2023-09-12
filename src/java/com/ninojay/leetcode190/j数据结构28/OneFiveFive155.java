package com.ninojay.leetcode190.j数据结构28;

import java.util.LinkedList;

/**
 * @author zengzhongjie
 * @date 2023/2/27
 */
public class OneFiveFive155 {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());


    }

    static class MinStack {
        LinkedList<Integer> stack = null;
        LinkedList<Integer> minStack = null;
        int min = Integer.MAX_VALUE;

        public MinStack() {
            stack = new LinkedList<>();
            minStack = new LinkedList<>();
        }

        public void push(int val) {
            stack.push(val);
            if(minStack.size() == 0 || minStack.peek() > val) {
                min = val;
            }
            minStack.push(min);
        }

        public void pop() {

            minStack.pop();
            stack.pop();
            min = minStack.isEmpty() ? Integer.MAX_VALUE : minStack.peek();

        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }


}
