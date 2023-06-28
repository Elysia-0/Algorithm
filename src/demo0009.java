import java.util.Scanner;

/**
 * @author Elysia-0
 * date 2023-03-06
 */

/*
回文数
给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

例如，121 是回文，而 123 不是。
示例 1：
输入：x = 121
输出：true

示例2：
输入：x = -121
输出：false
解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。

示例 3：
输入：x = 10
输出：false
解释：从右向左读, 为 01 。因此它不是一个回文数。
*/

public class demo0009 {

    public static boolean isPalindrome(int x) {
        String number = x + "";
        char[] array = number.toCharArray();
        boolean flag = true;
        int j = number.length() - 1;
        for (int i = 0; i < array.length; i++) {
            if (i > j) {
                break;
            }
            if (array[i] == array[j]) {
                j--;
            }else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.next());
        boolean palindrome = isPalindrome(number);
        System.out.println(palindrome);
    }
}
