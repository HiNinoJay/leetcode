package com.ninojay.leetcode190.a贪心;


import com.ninojay.leetcode190.util.NinoPrintUtil;

import java.util.Arrays;

/**
 * @author cengzhongjie
 */
public class FourThreeFive435 {


    public static void main(String[] args) {
        int[][] data = {{1,2},{2,3},{3,4},{1,3}};
        NinoPrintUtil.printAllType(new FourThreeFive435().eraseOverlapIntervals(data));
    }

    public int eraseOverlapIntervals(int[][] intervals) {

        // 这里的贪心有意思在于，是先右区间排序
        Arrays.sort(intervals, (a, b) -> {
            return a[1]-b[1];
        });
        int arrayLength = intervals.length;
        int right = intervals[0][1];
        int count = 0;
        // 通过 当前区间的右边界 比 下一个区间的左边界 大 来判断是否有交集
        for(int i = 1; i < arrayLength; i++) {
            if(right > intervals[i][0]) {
                count++;
            } else {
                right = intervals[i][1];
            }
        }
        return count;
    }

}
