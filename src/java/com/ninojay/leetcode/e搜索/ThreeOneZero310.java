package com.ninojay.leetcode.e搜索;

import com.ninojay.leetcode.util.NinoCreationUtil;
import com.ninojay.leetcode.util.NinoPrintUtil;

import java.util.*;

/**
 * @author : zengzhongjie
 * @date : 2023/9/12 23:01
 */
public class ThreeOneZero310 {
    public static void main(String[] args) {
        int n = 4;
        int[][] edges = NinoCreationUtil.createTwoDimensionArray("[[1,0],[1,2],[1,3]]");
        NinoPrintUtil.printAllType(new ThreeOneZero310().findMinHeightTrees(n, edges));
    }



    private List<Integer> result = new ArrayList<>();

    // 记录 节点 相连了哪些节点
    private Map<Integer, List<Integer>> edgeMap = new HashMap<>();

    // 记录度数，比如 3,4 代表 3节点的边有4条
    private Map<Integer, Integer> degreeMap = new HashMap<>();

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 1) {
            // 如果只有一个节点，那么范围是 0
            // 第一个节点当然是0
            result.add(0);
            return result;
        }
        // 基本逻辑就是 提前记录 相连了哪些节点，以及 度数
        // 度数 为 2 意思就是这个 节点 有两条边相连
        // 然后 将 求最矮树 问题转换为 一步步去掉度为1的节点，最终的节点就是我们所求
        // 因为 度不为1 的 那么最好放在中间 而不在顶点，这才能使得高度最低


        // 构建相连接的map情况
        for (int i = 0; i < edges.length; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            edgeMap.computeIfAbsent(a, k -> new ArrayList<>());
            if (edgeMap.get(b) == null) {
                edgeMap.put(b, new ArrayList<>());
            }
            if (degreeMap.get(a) == null) {
                degreeMap.put(a, 0);
            }
            if (degreeMap.get(b) == null) {
                degreeMap.put(b, 0);
            }
            edgeMap.get(a).add(b);
            edgeMap.get(b).add(a);
            degreeMap.put(a, degreeMap.get(a) + 1);
            degreeMap.put(b, degreeMap.get(b) + 1);
        }

        LinkedList<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            // 找到度为1的点，也就是只有一边相连的顶点
            if (degreeMap.get(i) == 1) {
                queue.offer(i);
            }
        }

        // 其实原理就是 一批一批地去除 度为1 的边
        // 因为 度不为1 的 那么最好放在中间 而不在顶点，这才能使得高度最低
        while (!queue.isEmpty()) {
            // 每一层到这里都会把 result更新，所以，result最终一定最后一层
            result = new ArrayList<>();
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int cur = queue.poll();
                result.add(cur);
                List<Integer> neighbors = edgeMap.get(cur);

                for (int neighbor : neighbors) {
                    degreeMap.put(neighbor, degreeMap.get(neighbor) - 1);
                    if (degreeMap.get(neighbor) == 1) {
                        queue.offer(neighbor);
                    }
                }
            }
        }
        return result;
    }



//runtime:56 ms
//memory:54 MB

}
