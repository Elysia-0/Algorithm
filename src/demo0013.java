import java.util.Scanner;

/**
 * @author Elysia-0
 * date 2023-03-06
 */
/*

罗马数字转整数
罗马数字包含以下七种字符:I，V，X，L，C，D和M。

字符          数值
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
例如， 罗马数字 2 写做II，即为两个并列的 1 。12 写做XII，即为X+II。 27 写做XXVII, 即为XX+V+II。

通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做IIII，而是IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为IX。这个特殊的规则只适用于以下六种情况：

I可以放在V(5) 和X(10) 的左边，来表示 4 和 9。
X可以放在L(50) 和C(100) 的左边，来表示 40 和90。
C可以放在D(500) 和M(1000) 的左边，来表示400 和900。
给定一个罗马数字，将其转换成整数。

示例1:
输入:s = "III"
输出: 3

示例2:
输入:s = "IV"
输出: 4

示例3:
输入:s = "IX"
输出: 9
示例4:

输入:s = "LVIII"
输出: 58
解释: L = 50, V= 5, III = 3.
示例5:

输入:s = "MCMXCIV"
输出: 1994
解释: M = 1000, CM = 900, XC = 90, IV = 4.


提示：

1 <= s.length <= 15
s 仅含字符 ('I', 'V', 'X', 'L', 'C', 'D', 'M')
题目数据保证 s 是一个有效的罗马数字，且表示整数在范围 [1, 3999] 内
题目所给测试用例皆符合罗马数字书写规则，不会出现跨位等情况。
IL 和 IM 这样的例子并不符合题目要求，49 应该写作 XLIX，999 应该写作 CMXCIX 。

*/
public class demo0013 {

    public static int romanToInt(String s) {
        int result = 0;
        char[] chars = s.toCharArray();
        int[] numberArr = new int[s.length()];

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'I') {
                numberArr[i] = 1;
            } else if (chars[i] == 'V') {
                numberArr[i] = 5;
            } else if (chars[i] == 'X') {
                numberArr[i] = 10;
            } else if (chars[i] == 'L') {
                numberArr[i] = 50;
            } else if (chars[i] == 'C') {
                numberArr[i] = 100;
            } else if (chars[i] == 'D') {
                numberArr[i] = 500;
            } else if (chars[i] == 'M') {
                numberArr[i] = 1000;
            }
        }
        for (int i = 0; i < numberArr.length; i++) {

            if (i<numberArr.length-1){
                if (numberArr[i] < numberArr[i + 1]) {
                    result = result - numberArr[i];
                }else {
                    result = result + numberArr[i];
                }
            }else {
                result = result + numberArr[i];
            }

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        int result = romanToInt(number);
        System.out.println(result);

    }
}
