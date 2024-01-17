package com.ninojay.leetcode190.util;

import com.ninojay.leetcode190.struct.ListNode;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zengzhongjie
 * @date 2023/2/15
 */
public class NinoCreationUtil {


    public static List<String> createStringArrayList(String... strings) {
        ArrayList<String> result = new ArrayList<String>();
        for(String temp : strings) {
            result.add(temp);
        }
        return result;
    }


    public static int[] createOneDimensionArray(Integer... nums) {
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
        }
        return result;
    }



    public static int[][] createTwoDimensionArray(String s) {

        if(StringUtils.isBlank(s)) {
            return null;
        }
        s = s.replaceAll(" ", "");
        // 因为多了一个最外围的 '['
        int rowCounts = -1;
        // 这里计算列的方法是算','的数量（最后一行少了一个','，所以初值为1），','总数处以行数，即为列数
        int columnCounts = 1;
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '[') {
                rowCounts++;
            }
            if(s.charAt(i) == ',') {
                columnCounts++;
            }
            if(s.charAt(i) != '[' && s.charAt(i) != ']' && s.charAt(i) != ',') {
				int numStartIndex = i;
                int numEndIndex = i+1;
                while(s.charAt(numEndIndex) != '[' && s.charAt(numEndIndex) != ']' && s.charAt(numEndIndex) != ',') {
                    numEndIndex++;
                }
                nums.add(Integer.parseInt(s.substring(numStartIndex, numEndIndex)));
                i = numEndIndex - 1;
            }
        }
        columnCounts = columnCounts / rowCounts;
        int[][] result = new int[rowCounts][columnCounts];
        int index = 0;
        for(int i = 0; i < rowCounts ; i++) {
            for(int j = 0; j < columnCounts ; j++) {
                result[i][j] = nums.get(index++);
            }
        }
        return result;
    }

    public static char[][] createTwoDimensionCharArray(String s) {
        if(StringUtils.isBlank(s)) {
            return null;
        }
        s = s.replaceAll(" ", "");
        // 因为多了一个最外围的 '['
        int rowCounts = -1;
        // 这里计算列的方法是算','的数量（最后一行少了一个','，所以初值为1），','总数处以行数，即为列数
        int columnCounts = 1;
        ArrayList<Character> words = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '[') {
                rowCounts++;
            }
            if(s.charAt(i) == ',') {
                columnCounts++;
            }
            if(s.charAt(i) != '[' && s.charAt(i) != ']' && s.charAt(i) != ',' && s.charAt(i) != '"') {
                words.add(s.charAt(i));
            }
        }
        columnCounts = columnCounts / rowCounts;
        char[][] result = new char[rowCounts][columnCounts];
        int index = 0;
        for(int i = 0; i < rowCounts ; i++) {
            for(int j = 0; j < columnCounts ; j++) {
                result[i][j] = words.get(index++);
            }
        }
        return result;
    }


    public static ListNode createSinglyLinkedList(Integer... nums) {
        ListNode head = new ListNode(nums[0]);
        ListNode p = head;
        for(int i = 1; i < nums.length; i++) {
            ListNode temp = new ListNode(nums[i]);
            p.next = temp;
            p = temp;
        }
        return head;
    }

    /**
     * 可变参数是一个语法糖，本质上为数组
     * 可变参数必须放在最后一个
     * @param pos
     * @param nums
     * @return
     */
    public static ListNode createCycleSinglyLinkedList(int pos, Integer... nums) {
        ListNode head = new ListNode(nums[0]);
        ListNode p = head;
        ListNode posListNode = head;
        for(int i = 1; i < nums.length; i++) {
            ListNode temp = new ListNode(nums[i]);
            p.next = temp;
            p = temp;
            if(i == pos) {
                posListNode = p;
            }
        }
        p.next = posListNode;
        return head;
    }


    /**
     * 打印非循环单链表
     * @param listNode
     */
    public static void printNonCycleSinglyLinkedList(ListNode listNode) {
        System.out.println("该链表：");
        ListNode copy_listNode = listNode;
        while(copy_listNode != null) {
            System.out.print(copy_listNode.val+ " ");
            copy_listNode = copy_listNode.next;
        }
    }

    public static String[] createOneStringDimension(String... numberx) {
        return numberx;
    }
}
