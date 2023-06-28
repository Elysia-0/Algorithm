/**
 * @author Elysia-0
 * date 2023-03-16
 */

/*
给你一个非负整数 x ，计算并返回x的 算术平方根 。
由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。
注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。

示例 1：
输入：x = 4
输出：2

示例 2：
输入：x = 8
输出：2
解释：8 的算术平方根是 2.82842..., 由于返回类型是整数，小数部分将被舍去。

提示：
0 <= x <= 231 - 1
 */
public class demo0069 {
    public static int mySqrt(int x) {

        if (x ==0){
            return 0;
        }

        int length = (x + "").length();
        if (length % 2 == 1) {
            length = length / 2 + 1;
        } else {
            length = length / 2;
        }

        String start = "1";
        String end = "9";
        for (int i = 0; i < length - 1; i++) {
            start = start + "0";
            end = end + "9";
        }
        long s = Long.parseLong(start);
        long e = Long.parseLong(end);

        if (e > 50000){
            e = (long) 50000;
        }
        long mid;

        while (s < e) {
            if (s + 1 >= e && s * s < x && e * e > x){
                break;
            }
            mid = ( s + e ) / 2;
            if (mid * mid > x){
                e = mid;
            }else if (mid * mid < x){
                s = mid;
            }else {
                return (int)mid;
            }
        }

        System.out.println(s);
        System.out.println(e);

        return (int)s;
    }

    public static void main(String[] args) {
        int a = 2147395599;
        int i = mySqrt2(a);
        System.out.println(i);
    }


    public static int mySqrt2(int x) {

        if (x ==0){
            return 0;
        }


        long s = (long) 1;
        long e = (long) 50000;
        long mid;

        while (s < e) {
            if (s + 1 >= e && s * s < x && e * e > x){
                break;
            }
            mid = ( s + e ) / 2;
            if (mid * mid > x){
                e = mid;
            }else if (mid * mid < x){
                s = mid;
            }else {
                return (int)mid;
            }
        }

        return (int)s;
    }

}
