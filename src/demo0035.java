/**
 * @author Elysia-0
 * date 2023-03-15
 */

/*
给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
请必须使用时间复杂度为 O(log n) 的算法。



示例 1:
输入: nums = [1,3,5,6], target = 5
输出: 2

示例2:
输入: nums = [1,3,5,6], target = 2
输出: 1

示例 3:
输入: nums = [1,3,5,6], target = 7
输出: 4


提示:
1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums 为无重复元素的升序排列数组
-104 <= target <= 104

 */
public class demo0035 {
    public static int searchInsert(int[] nums, int target) {
        if (nums.length==1){
            if (nums[0]<target){
                return 1;
            }else {
                return 0;
            }
        }
        int result = -1;
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]){
                result = i;
                break;
            }
        }
        return result == -1 ? nums.length : result;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int i = searchInsert(nums, 0);
        System.out.println(i);
    }
}
