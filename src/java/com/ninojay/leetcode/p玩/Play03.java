package com.ninojay.leetcode.p玩;

import com.ninojay.leetcode.util.NinoCreationUtil;
import com.ninojay.leetcode.util.NinoPrintUtil;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : nino
 * @date : 2024/10/5 03:43
 */
public class Play03 {

    public long minimumTime(int[] time, int totalTrips) {

        long left = 1;
        long right = Long.MAX_VALUE;
        long result = right;

        while(left <= right) {
            long mid = left + (right - left) / 2;
            BigDecimal tempTrips = new BigDecimal(0);
            for(int tempTime : time) {
                tempTrips.add(new BigDecimal(mid).divide(new BigDecimal(tempTime)));
            }
            if(tempTrips.compareTo(new BigDecimal(totalTrips)) >= 0) {
                result = mid;
                right = mid - 1;
            } else  {
                left = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] time = NinoCreationUtil.createOneDimensionArray(39,82,69,37,78,14,93,36,66,61,13,58,57,12,70,14,67,75,91,1,34,68,73,50,13,40,81,21,79,12,35,18,71,43,5,50,37,16,15,6,61,7,87,43,27,62,95,45,82,100,15,74,33,95,38,88,91,47,22,82,51,19,10,24,87,38,5,91,10,36,56,86,48,92,10,26,63,2,50,88,9,83,20,42,59,55,8,15,48,25);
        int totalTrip = 4187;
        NinoPrintUtil.printAllType(new Play03().minimumTime(time, totalTrip));
    }
}
