package com.ninojay.leetcode190.a贪心;

import com.ninojay.leetcode190.util.NinoPrintUtil;

import java.util.Arrays;

/**
 * @author zengzhongjie
 * @date 2023/1/31
 */
public class FourThreeSix436 {

    public static void main(String[] args) {
        int[][] data = {{1,2},{2,3},{3,4},{1,3}};
        NinoPrintUtil.printAllType(new FourThreeSix436().eraseOverlapIntervals(data));
    }

    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, (interval1, interval2) -> interval1[1] - interval2[1]);
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
}
