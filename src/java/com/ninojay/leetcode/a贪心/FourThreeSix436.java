package com.ninojay.leetcode.a贪心;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author zengzhongjie
 * @date 2023/1/31
 */
public class FourThreeSix436 {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] interval1, int[] interval2) {
                return interval1[1] - interval2[1];
            }
        });
        int right = intervals[0][1];
        int remove = 0;
        for(int i = 1; i < intervals.length; i++) {
            if(right > intervals[i][0]) {
                remove++;
            } else {
                right = intervals[i][1];
            }
        }
        return remove;
    }

    public static void main(String[] args) {
        int[][] data = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println(new FourThreeSix436().eraseOverlapIntervals(data));
    }
}
