package com.ninojay.leetcode.p玩;

import com.ninojay.leetcode.util.NinoCreationUtil;
import com.ninojay.leetcode.util.NinoPrintUtil;

import java.util.*;

/**
 * @author : nino
 * @date : 2024/10/13 11:00
 */
public class Play04 {

    public long[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        long[] result = new long[n - k + 1];

        HashMap<Integer, Node> hashMap = new HashMap<>();
        TreeSet<Node> treeSet = new TreeSet<>();

        for(int i = 0; i < k; i++) {
            Node node = hashMap.getOrDefault(nums[i], new Node(nums[i], 0));
            node.count++;
            if(!hashMap.containsKey(nums[i])) {
                treeSet.add(node);
            } else {
                treeSet.remove(node);
                treeSet.add(node);
            }
            hashMap.put(nums[i], node);
        }

        result[0] = get(x, treeSet);

        for(int i = 1; i <= n - k; i++) {
            Node node = hashMap.getOrDefault(nums[i + k - 1], new Node(nums[i + k - 1], 0));
            node.count++;
            hashMap.put(node.num, node);
            if(!treeSet.contains(node)) treeSet.add(node);
            Node preNode = hashMap.get(nums[i-1]);
            preNode.count--;
            if(preNode.count == 0) {
                hashMap.remove(preNode.num);
                treeSet.remove(preNode);
            }
            result[i] = get(x, treeSet);
        }
        return result;

    }

    private long get(int x, TreeSet<Node> treeSet) {
        long tempResult = 0;
        int count = 0;
        for (Node node : treeSet) {
            if (count >= x) break;
            tempResult += (1L * node.num * node.count);
            count++;
        }
        return tempResult;
    }

    class Node implements Comparable<Node> {
        int num;
        int count;

        public Node(int num, int count) {
            this.num = num;
            this.count = count;
        }

        @Override
        public int compareTo(Node other) {
            // 频率降序
            if (this.count != other.count) {
                return other.count - this.count;
            }
            // 数值降序
            return other.num - this.num;
        }


    }

    public static void main(String[] args) {
        int[] nums = NinoCreationUtil.createOneDimensionArray(1,1,2,2,3,4,2,3);
        int k = 6;
        int x = 2;
        NinoPrintUtil.printAllType(new Play04().findXSum(nums, k, x));

    }
}
