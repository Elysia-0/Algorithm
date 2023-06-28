/**
 * @author Elysia-0
 * date 2023-03-16
 */

/*
给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
你可以假设除了整数 0 之外，这个整数不会以零开头。

示例1：
输入：digits = [1,2,3]
输出：[1,2,4]
解释：输入数组表示数字 123。

示例2：
输入：digits = [4,3,2,1]
输出：[4,3,2,2]
解释：输入数组表示数字 4321。

示例 3：
输入：digits = [0]
输出：[1]


提示：
1 <= digits.length <= 100
0 <= digits[i] <= 9
 */
public class demo0066 {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 > 9){
                digits[i] = (digits[i] + 1) % 10;
            }else {
                digits[i] = digits[i]  + 1;
                break;
            }
        }
        if (digits[0] == 0){
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {9,9,9};
        int[] ints = plusOne(digits);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
