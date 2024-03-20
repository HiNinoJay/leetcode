package com.ninojay.leetcode.j数据结构28.d优先队列2;

import com.ninojay.leetcode.util.NinoCreationUtil;
import com.ninojay.leetcode.util.NinoPrintUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author : zengzhongjie
 * @date : 2023/9/13 00:16
 */
public class TwoOneEight218 {
    public static void main(String[] args) {
        int[][] buildings = NinoCreationUtil.createTwoDimensionArray("[[2,9,10],[3,7,15],[5,12,12],[15,20,10],[19,24,8]]");
        NinoPrintUtil.printAllType(new TwoOneEight218().getSkyline(buildings));
    }


    public List<List<Integer>> getSkyline(int[][] buildings) {

        List<List<Integer>> ans = new ArrayList<>();

        // 划分 为一个个小的四边形，根据横坐标排序
        List<int[]> pointList = new ArrayList<>();

        for(int[] building : buildings) {
            int left = building[0];
            int right = building[1];
            int height = building[2];
            // 左端点，置为负号，之后可以 判断 出来是 左端点
            pointList.add(new int[]{left, -height});
            pointList.add(new int[]{right, height});
        }

        // 横坐标相同则按照 高度排序
        Collections.sort(pointList, (a, b) -> a[0] != b[0] ? a[0]-b[0] : a[1]-b[1]);

        // 大根堆
        PriorityQueue<Integer> bigRoot = new PriorityQueue<>((a, b) -> b-a);

        // 因为题目要求 右下角  的点也取到，所以需要 先添加一个 0
        int prevTopHeight = 0;
        bigRoot.add(prevTopHeight);

        for(int[] point : pointList) {
            int pointX = point[0];
            int pointHeight = point[1];

            if(pointHeight < 0) {
                // 说明是左端点，说明存在一条往右延伸的可记录的边，将高度存入优先队列
                bigRoot.add(-pointHeight);
            } else {
                // 说明是右端点，说明这条边结束了，将当前高度从 队列 中移除
                bigRoot.remove(pointHeight);
            }

            // 取出最高高度，如果当前不与前一矩形“上边”延展而来的那些边重合，则可以被记录
            // 这里就算遇到更低的，也只是先保存更低的高度
            // 直到把当前最高的弄出去，才会 记录下一最高高度
            if(bigRoot.peek() != prevTopHeight) {
                List<Integer> tempAnsList = new ArrayList<>();
                tempAnsList.add(pointX);
                tempAnsList.add(bigRoot.peek());
                ans.add(tempAnsList);
                prevTopHeight = bigRoot.peek();
            }
        }
        return ans;
    }
}
