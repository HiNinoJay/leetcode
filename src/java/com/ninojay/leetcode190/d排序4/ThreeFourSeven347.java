package com.ninojay.leetcode190.d排序4;

import com.ninojay.leetcode190.util.NinoCreationUtil;
import com.ninojay.leetcode190.util.NinoPrintUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zengzhongjie
 * @date 2023/2/16
 */
public class ThreeFourSeven347 {

    public static void main(String[] args) {
        NinoPrintUtil ninoPrintUtil = new NinoPrintUtil();
        int[] nums = NinoCreationUtil.createOneDimensionArray(1,1,1,2,2,3);
        int[] nums1 = NinoCreationUtil.createOneDimensionArray(1);
        int[] nums2 = NinoCreationUtil.createOneDimensionArray(1, 2);
        int[] nums3 = NinoCreationUtil.createOneDimensionArray(3, 0 ,1, 0);
        int[] nums4 = NinoCreationUtil.createOneDimensionArray(-1, -1);
        int k = 1;
        NinoPrintUtil.printAllType(topKFrequent(nums4, k));
    }

    /**
     * 桶排序
     * 不要只想着基本数据类型，很多题目的包括了0，那么用基本数据类型去桶排序，对0的判断过于繁琐了
     * 直接集合类的桶排序，天然有null空值
     * @param nums
     * @param k
     * @return
     */
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> nums_hashMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(!nums_hashMap.containsKey(nums[i])) {
                nums_hashMap.put(nums[i], 1);
            } else {
                nums_hashMap.put(nums[i], nums_hashMap.get(nums[i]) + 1);
            }
        }
        ArrayList<Integer>[] buckets = new ArrayList[nums.length+ 1];
        for(Map.Entry entry : nums_hashMap.entrySet()) {
            int index = (Integer) entry.getValue();
            Integer num = (Integer) entry.getKey();
            if(buckets[index] == null) {
                buckets[index] = new ArrayList<>();
            }
            buckets[index].add(num);
        }
        int[] result = new int[k];
        int j = 0;
        for(int i = buckets.length - 1; i >= 0 && j < result.length; i--) {
            if(buckets[i] != null) {
                for(Integer num : buckets[i]) {
                    result[j++] = num;
                    if(j >= result.length) {
                        break;
                    }
                }
            }
        }
        return result;
    }




}
