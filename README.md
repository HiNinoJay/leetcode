主要记录自己使用Java语言系统性刷过的算法题。分模块刷题的收获更深刻。

> 源于这份[pdf](https://github.com/HiNinoJay/leetcode/blob/main/LeetCode%20101%20-%20A%20LeetCode%20Grinding%20Guide%20(C%2B%2B%20Version).pdf)：该书采用c++语言



#### 排序算法

| Title                                                        | 平均时间复杂度 | 空间复杂度 |
| :----------------------------------------------------------- | -------------- | ---------- |
| [BubbleSort](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/%E5%AE%9E%E7%8E%B0%E6%8E%92%E5%BA%8F%E7%AE%97%E6%B3%95/BubbleSort.java) | O(n^2)         | O(1)       |
| [InsertionSort](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/%E5%AE%9E%E7%8E%B0%E6%8E%92%E5%BA%8F%E7%AE%97%E6%B3%95/InsertionSort.java) | O(n^2)         | O(1)       |
| [SelectionSort](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/%E5%AE%9E%E7%8E%B0%E6%8E%92%E5%BA%8F%E7%AE%97%E6%B3%95/SelectionSort.java) | O(n^2)         | O(1)       |
| [MergeSort](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/%E5%AE%9E%E7%8E%B0%E6%8E%92%E5%BA%8F%E7%AE%97%E6%B3%95/MergeSort.java) | O(nlogn)       | O(n)       |
| [QuickSort](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/%E5%AE%9E%E7%8E%B0%E6%8E%92%E5%BA%8F%E7%AE%97%E6%B3%95/QuickSort.java) | O(nlogn)       | O(nlogn)   |



#### 贪心

| Title                                                        | Solution                                                     | Difficulty | flag |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ---------- | ---- |
| [455. 分发饼干](https://leetcode.cn/problems/assign-cookies/) | [FourFiveFive455.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/a贪心/FourFiveFive455.java) | 简单       |      |
| [606. 根据二叉树创建字符串](https://leetcode.cn/problems/construct-string-from-binary-tree/) | [SixZeroSix606.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/a贪心/SixZeroSix606.java) | 简单       |      |
| [452. 用最少数量的箭引爆气球](https://leetcode.cn/problems/minimum-number-of-arrows-to-burst-balloons/) | [FourFiveTwo452.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/a贪心/FourFiveTwo452.java) | 中等       |      |
| [436. 寻找右区间](https://leetcode.cn/problems/find-right-interval/) | [FourThreeSix436.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/a贪心/FourThreeSix436.java) | 中等       | ❎    |
| [406. 根据身高重建队列](https://leetcode.cn/problems/queue-reconstruction-by-height/) | [FourZeroSix406.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/a贪心/FourZeroSix406.java) | 中等       |      |
| [122. 买卖股票的最佳时机 II](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii/) | [OneTwoTwo122.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/a贪心/OneTwoTwo122.java) | 中等       |      |
| [763. 划分字母区间](https://leetcode.cn/problems/partition-labels/) | [SevenSixThree763.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/a贪心/SevenSixThree763.java) | 中等       |      |
| [665. 非递减数列](https://leetcode.cn/problems/non-decreasing-array/) | [SixSixFive665.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/a贪心/SixSixFive665.java) | 中等       |      |
| [135. 分发糖果](https://leetcode.cn/problems/candy/)         | [OneThreeFive135.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/a贪心/OneThreeFive135.java) | 困难       |      |



#### 双指针

| Title                                                        | Solution                                                     | Difficulty | flag |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ---------- | ---- |
| [88. 合并两个有序数组](https://leetcode.cn/problems/merge-sorted-array/) | [EightEight88.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/b双指针/EightEight88.java) | 简单       |      |
| [680. 验证回文串 II](https://leetcode.cn/problems/valid-palindrome-ii/) | [SixEightZero680.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/b双指针/SixEightZero680.java) | 简单       |      |
| [524. 通过删除字母匹配到字典里最](https://leetcode.cn/problems/longest-word-in-dictionary-through-deleting/) | [FiveTwoFour524.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/b双指针/FiveTwoFour524.java) | 中等       |      |
| [142. 环形链表 II](https://leetcode.cn/problems/linked-list-cycle-ii/) | [OneFourTwo142.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/b双指针/OneFourTwo142.java) | 中等       |      |
| [167. 两数之和 II - 输入有序数组](https://leetcode.cn/problems/two-sum-ii-input-array-is-sorted/) | [OneSisSeven167.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/b双指针/OneSisSeven167.java) | 中等       |      |
| [633. 平方数之和](https://leetcode.cn/problems/sum-of-square-numbers/) | [SixThreeThree633.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/b双指针/SixThreeThree633.java) | 中等       |      |
| [76. 最小覆盖子串](https://leetcode.cn/problems/minimum-window-substring/) | [SevenSix76.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/b双指针/SevenSix76.java) | 困难       |      |



#### 二分查找

| Title                                                        | Solution                                                     | Difficulty | flag |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ---------- | ---- |
| [69. x 的平方根](https://leetcode.cn/problems/sqrtx/)        | [SixNine69.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/c二分查找/SixNine69.java) | 简单       |      |
| [81. 搜索旋转排序数组 II](https://leetcode.cn/problems/search-in-rotated-sorted-array-ii/) | [EightOne81.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/c二分查找/EightOne81.java) | 中等       |      |
| [540. 有序数组中的单一元](https://leetcode.cn/problems/single-element-in-a-sorted-array/) | [FiveFourZero540.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/c二分查找/FiveFourZero540.java) | 中等       |      |
| [34. 在排序数组中查找元素的第一个和最后一个位置](https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/) | [ThreeFour34.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/c二分查找/ThreeFour34.java) | 中等       |      |
| [154. 寻找旋转排序数组中的最小值 II](https://leetcode.cn/problems/find-minimum-in-rotated-sorted-array-ii/) | [OneFiveFoue154.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/c二分查找/OneFiveFoue154.java) | 困难       |      |
| [4.寻找两个正序数组的中位数](https://leetcode.cn/problems/median-of-two-sorted-arrays/) | [Four4.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/c二分查找/Four4.java) | 困难       | ❎    |



#### 排序
| Title                                                        | Solution                                                     | Difficulty | flag |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ---------- | ---- |
| [451. 根据字符出现频率排](https://leetcode.cn/problems/sort-characters-by-frequency/) | [FoutFiveOne451.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/d排序/FoutFiveOne451.java) | 中等       |      |
| [75. 颜色分类](https://leetcode.cn/problems/sort-colors/)    | [SevenFive75.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/d排序/SevenFive75.java) | 中等       |      |
| [347. 前 K 个高频元素](https://leetcode.cn/problems/top-k-frequent-elements/) | [ThreeFourSeven347.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/d排序/ThreeFourSeven347.java) | 中等       |      |
| [215. 数组中的第K个最大元](https://leetcode.cn/problems/kth-largest-element-in-an-array/) | [TwoOneFIve215.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/d排序/TwoOneFIve215.java) | 中等       |      |


#### 搜索
| Title                                                        | Solution                                                     | Difficulty | flag |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ---------- | ---- |
| [547. 省份数量](https://leetcode.cn/problems/number-of-provinces/) | [FiveFourSeven547.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/e搜索/FiveFourSeven547.java) | 中等       |      |
| [417. 太平洋大西洋水流](https://leetcode.cn/problems/pacific-atlantic-water-flow/) | [FourOneSeven417.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/e搜索/FourOneSeven417.java) | 中等       |      |
| [47. 全排列 II](https://leetcode.cn/problems/permutations-ii/) | [FourSeven47.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/e搜索/FourSeven47.java) | 中等       |      |
| [46. 全排列](https://leetcode.cn/problems/permutations/)     | [FourSix46.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/e搜索/FourSix46.java) | 中等       |      |
| [40. 组合总和 II](https://leetcode.cn/problems/combination-sum-ii/) | [FourZero40.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/e搜索/FourZero40.java) | 中等       |      |
| [934. 最短的桥](https://leetcode.cn/problems/shortest-bridge/) | [MyNineThreeFour934.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/e搜索/MyNineThreeFour934.java) | 中等       |      |
| [934. 最短的桥](https://leetcode.cn/problems/shortest-bridge/) | [NineThreeFour934.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/e搜索/NineThreeFour934.java) | 中等       | ❎    |
| [130. 被围绕的区域](https://leetcode.cn/problems/surrounded-regions/) | [OneThreeZero130.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/e搜索/OneThreeZero130.java) | 中等       |      |
| [79. 单词搜索](https://leetcode.cn/problems/word-search/)    | [SevenNine79.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/e搜索/SevenNine79.java) | 中等       |      |
| [77. 组合](https://leetcode.cn/problems/combinations/)       | [SevenSeven77.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/e搜索/SevenSeven77.java) | 中等       |      |
| [695. 岛屿的最大面积](https://leetcode.cn/problems/max-area-of-island/) | [SixNineFive695ByRecursion.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/e搜索/SixNineFive695ByRecursion.java) | 中等       |      |
| [695. 岛屿的最大面积](https://leetcode.cn/problems/max-area-of-island/) | [SixNineFive695ByStack.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/e搜索/SixNineFive695ByStack.java) | 中等       |      |
| [257. 二叉树的所有路径](https://leetcode.cn/problems/binary-tree-paths/) | [TwoFiveSeven257.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/e搜索/TwoFiveSeven257.java) | 简单       |      |


#### 动态规划
| Title                                                        | Solution                                                     | Difficulty | flag |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ---------- | ---- |
| [542. 01 矩阵](https://leetcode.cn/problems/01-matrix/)      | [FiveFourTwo542.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/f动态规划/FiveFourTwo542.java) | 中等       |      |
| [413. 等差数列划分](https://leetcode.cn/problems/arithmetic-slices/) | [FourOneThreee413.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/f动态规划/FourOneThreee413.java) | 中等       |      |
| [91. 解码方法](https://leetcode.cn/problems/decode-ways/)    | [NineOne91.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/f动态规划/NineOne91.java) | 中等       |      |
| [198. 打家劫舍](https://leetcode.cn/problems/house-robber/)  | [OneNineEight198.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/f动态规划/OneNineEight198.java) | 中等       |      |
| [70. 爬楼梯](https://leetcode.cn/problems/climbing-stairs/)  | [SevenZero70.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/f动态规划/SevenZero70.java) | 简单       |      |
| [64. 最小路径和](https://leetcode.cn/problems/minimum-path-sum/) | [SixFour64.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/f动态规划/SixFour64.java) | 中等       |      |
| [279. 完全平方数](https://leetcode.cn/problems/perfect-squares/) | [TwoSevenNine279.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/f动态规划/TwoSevenNine279.java) | 中等       |      |
| [221. 最大正方形](https://leetcode.cn/problems/maximal-square/) | [TwoTwoOne221.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/f动态规划/TwoTwoOne221.java) | 中等       |      |


#### 数学问题
| Title                                                        | Solution                                                     | Difficulty | flag |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ---------- | ---- |
| [9. 回文数](https://leetcode.cn/problems/palindrome-number/) | [Nine9.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/h数学问题/Nine9.java) | 简单       |      |
| [326. 3 的幂](https://leetcode.cn/problems/power-of-three/)  | [ThreeTwoSix326.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/h数学问题/ThreeTwoSix326.java) | 简单       |      |
| [27. 移除元素](https://leetcode.cn/problems/remove-element/) | [TwoSeven27.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/h数学问题/TwoSeven27.java) | 简单       |      |


#### 位运算
| Title                                                        | Solution                                                     | Difficulty | flag |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ---------- | ---- |
| [461. 汉明距离](https://leetcode.cn/problems/hamming-distance/) | [FourSixOne461.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/i位运算/FourSixOne461.java) | 简单       |      |
| [190. 颠倒二进制位](https://leetcode.cn/problems/reverse-bits/) | [OneNineZero190.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/i位运算/OneNineZero190.java) | 简单       |      |
| [136. 只出现一次的数字](https://leetcode.cn/problems/single-number/) | [OneThreeSix136.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/i位运算/OneThreeSix136.java) | 简单       |      |
| [342. 4的幂](https://leetcode.cn/problems/power-of-four/)    | [TheeFourTwo342.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/i位运算/TheeFourTwo342.java) | 简单       |      |
| [268. 丢失的数字](https://leetcode.cn/problems/missing-number/) | [TwoSixEight268.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/i位运算/TwoSixEight268.java) | 简单       |      |


#### 数据结构
| Title                                                        | Solution                                                     | Difficulty | flag |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ---------- | ---- |
| [448. 找到所有数组中消失](https://leetcode.cn/problems/find-all-numbers-disappeared-in-an-array/) | [FourFourEight448.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/j数据结构/FourFourEight448.java) | 简单       |      |
| [1. 两数之和](https://leetcode.cn/problems/two-sum/)         | [One1.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/j数据结构/One1.java) | 简单       |      |
| [155. 最小栈](https://leetcode.cn/problems/min-stack/)       | [OneFiveFive155.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/j数据结构/OneFiveFive155.java) | 中等       |      |
| [217. 存在重复元素](https://leetcode.cn/problems/contains-duplicate/) | [TwoOneSeven217.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/j数据结构/TwoOneSeven217.java) | 简单       |      |
| [232. 用栈实现队列](https://leetcode.cn/problems/implement-queue-using-stacks/) | [TwoThreeTwo232.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/j数据结构/TwoThreeTwo232.java) | 简单       |      |
| [225. 用队列实现栈](https://leetcode.cn/problems/implement-stack-using-queues/) | [TwoTwoFive225.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/j数据结构/TwoTwoFive225.java) | 简单       |      |
| [20. 有效的括号](https://leetcode.cn/problems/valid-parentheses/) | [TwoZero20.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/j数据结构/TwoZero20.java) | 简单       |      |


#### 字符串
| Title                                                        | Solution                                                     | Difficulty | flag |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ---------- | ---- |
| [242. 有效的字母异位词](https://leetcode.cn/problems/valid-anagram/) | [TwoFourTwo242.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/k字符串/TwoFourTwo242.java) | 简单       |      |


#### 链表
| Title                                                        | Solution                                                     | Difficulty | flag |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ---------- | ---- |
| [83. 删除排序链表中的重复](https://leetcode.cn/problems/remove-duplicates-from-sorted-list/) | [EightThree83.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/l链表/EightThree83.java) | 简单       |      |
| [148. 排序链表](https://leetcode.cn/problems/sort-list/)     | [OneFourEight148.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/l链表/OneFourEight148.java) | 中等       |      |
| [19. 删除链表的倒数第 N 个](https://leetcode.cn/problems/remove-nth-node-from-end-of-list/) | [OneNine19.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/l链表/OneNine19.java) | 中等       |      |
| [160. 相交链表](https://leetcode.cn/problems/intersection-of-two-linked-lists/) | [OneSixZero160.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/l链表/OneSixZero160.java) | 简单       |      |
| [328. 奇偶链表](https://leetcode.cn/problems/odd-even-linked-list/) | [ThreeTwoEight328.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/l链表/ThreeTwoEight328.java) | 中等       |      |
| [2. 两数相加](https://leetcode.cn/problems/add-two-numbers/) | [Two2.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/l链表/Two2.java) | 中等       |      |
| [24. 两两交换链表中的节点](https://leetcode.cn/problems/swap-nodes-in-pairs/) | [TwoFour24.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/l链表/TwoFour24.java) | 中等       |      |
| [234. 回文链表](https://leetcode.cn/problems/palindrome-linked-list/) | [TwoThreeFour234.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/l链表/TwoThreeFour234.java) | 简单       |      |
| [206. 反转链表](https://leetcode.cn/problems/reverse-linked-list/) | [TwoZeroSix206.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/l链表/TwoZeroSix206.java) | 简单       |      |


#### 树
| Title                                                        | Solution                                                     | Difficulty | flag |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ---------- | ---- |
| [889. 根据前序和后序遍历构造二叉树](https://leetcode.cn/problems/construct-binary-tree-from-preorder-and-postorder-traversal/) | [EightEightNine889.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/m树/EightEightNine889.java) | 中等       |      |
| [897. 递增顺序搜索树](https://leetcode.cn/problems/increasing-order-search-tree/) | [EightNineSeven897.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/m树/EightNineSeven897.java) | 简单       |      |
| [543. 二叉树的直径](https://leetcode.cn/problems/diameter-of-binary-tree/) | [FiveFourThree543.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/m树/FiveFourThree543.java) | 简单       |      |
| [513. 找树左下角的值](https://leetcode.cn/problems/find-bottom-left-tree-value/) | [FiveOneThree513.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/m树/FiveOneThree513.java) | 中等       |      |
| [572. 另一棵树的子树](https://leetcode.cn/problems/subtree-of-another-tree/) | [FiveSevenTwo572.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/m树/FiveSevenTwo572.java) | 简单       |      |
| [538. 把二叉搜索树转换为](https://leetcode.cn/problems/convert-bst-to-greater-tree/) | [FiveThreeEight538.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/m树/FiveThreeEight538.java) | 中等       |      |
| [530. 二叉搜索树的最小绝对](https://leetcode.cn/problems/minimum-absolute-difference-in-bst/) | [FiveThreeZero530.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/m树/FiveThreeZero530.java) | 简单       |      |
| [450. 删除二叉搜索树中的](https://leetcode.cn/problems/delete-node-in-a-bst/) | [FourFiveZero450.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/m树/FourFiveZero450.java) | 中等       |      |
| [437. 路径总和 III](https://leetcode.cn/problems/path-sum-iii/) | [FourThreeSeven437.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/m树/FourThreeSeven437.java) | 中等       |      |
| [404. 左叶子之和](https://leetcode.cn/problems/sum-of-left-leaves/) | [FourZeroFour404.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/m树/FourZeroFour404.java) | 简单       |      |
| [94. 二叉树的中序遍历](https://leetcode.cn/problems/binary-tree-inorder-traversal/) | [NineFour94.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/m树/NineFour94.java) | 简单       |      |
| [144. 二叉树的前序遍历](https://leetcode.cn/problems/binary-tree-preorder-traversal/) | [OneFourFour144.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/m树/OneFourFour144.java) | 简单       |      |
| [1110. 删点成林](https://leetcode.cn/problems/delete-nodes-and-return-forest/) | [OneOneOneZero1110.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/m树/OneOneOneZero1110.java) | 中等       |      |
| [110. 平衡二叉树](https://leetcode.cn/problems/balanced-binary-tree/) | [OneOneZero110.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/m树/OneOneZero110.java) | 简单       |      |
| [105. 从前序与中序遍历序](https://leetcode.cn/problems/construct-binary-tree-from-preorder-and-inorder-traversal/) | [OneZeroFive105.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/m树/OneZeroFive105.java) | 中等       |      |
| [104. 二叉树的最大深度](https://leetcode.cn/problems/maximum-depth-of-binary-tree/) | [OneZeroFour104.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/m树/OneZeroFour104.java) | 简单       |      |
| [101. 对称二叉树](https://leetcode.cn/problems/symmetric-tree/) | [OneZeroOne101.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/m树/OneZeroOne101.java) | 简单       |      |
| [106. 从中序与后序遍历序](https://leetcode.cn/problems/construct-binary-tree-from-inorder-and-postorder-traversal/) | [OneZeroSix106.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/m树/OneZeroSix106.java) | 中等       |      |
| [653. 两数之和 IV - 输入二](https://leetcode.cn/problems/two-sum-iv-input-is-a-bst/) | [SixFiveThree653.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/m树/SixFiveThree653.java) | 简单       |      |
| [617. 合并二叉树](https://leetcode.cn/problems/merge-two-binary-trees/) | [SixOneSeven617.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/m树/SixOneSeven617.java) | 简单       |      |
| [669. 修剪二叉搜索树](https://leetcode.cn/problems/trim-a-binary-search-tree/) | [SixSixNine669.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/m树/SixSixNine669.java) | 中等       |      |
| [637. 二叉树的层平均值](https://leetcode.cn/problems/average-of-levels-in-binary-tree/) | [SixThreeSeven637.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/m树/SixThreeSeven637.java) | 简单       |      |
| [235. 二叉搜索树的最近公共](https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-search-tree/) | [TwoThreeFive235.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/m树/TwoThreeFive235.java) | 中等       |      |
| [226. 翻转二叉树](https://leetcode.cn/problems/invert-binary-tree/) | [TwoTwoSix226.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/m树/TwoTwoSix226.java) | 简单       |      |
| [208. 实现 Trie (前缀树)](https://leetcode.cn/problems/implement-trie-prefix-tree/) | [TwoZeroEight208.java](https://github.com/HiNinoJay/leetcode/blob/main/src/java/com/ninojay/leetcode/m树/TwoZeroEight208.java) | 中等       |      |
