package com.ninojay.leetcode.b双指针;

import com.ninojay.leetcode.util.NinoCreationUtil;
import com.ninojay.leetcode.util.NinoPrintUtil;

/**
 * @author : nino
 * @date : 2024/9/15 15:45
 */
public class ElevenEleven11 {
    public int maxArea(int[] height) {

        int result = 0;

        int left = 0;
        int right = height.length - 1;
        while(left < right) {
            int curWidth = right - left;
            int curHeight = Math.min(height[left], height[right]);
            result = Math.max(result, curWidth * curHeight);
            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] height = NinoCreationUtil.createOneDimensionArray(1,8,6,2,5,4,8,3,7);
        NinoPrintUtil.printAllType(new ElevenEleven11().maxArea(height));
    }
}
