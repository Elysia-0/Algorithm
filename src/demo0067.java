/**
 * @author Elysia-0
 * date 2023-03-16
 */

/*
给你两个二进制字符串 a 和 b ，以二进制字符串的形式返回它们的和。

示例1：
输入:a = "11", b = "1"
输出："100"

示例2：
输入：a = "1010", b = "1011"
输出："10101"

提示：
1 <= a.length, b.length <= 104
a 和 b 仅由字符 '0' 或 '1' 组成
字符串如果不是 "0" ，就不含前导零
 */

public class demo0067 {
    public static String addBinary(String a, String b) {

        int aLength = a.length();
        int bLength = b.length();
        char[] chars1 = a.toCharArray();
        char[] chars2 = b.toCharArray();
        int[] tempArr;
        if (aLength >= bLength){
            tempArr = new int[aLength];
            for (int i = tempArr.length - 1; i >= 0; i--) {
                if (bLength > 0){
                    tempArr[i] = chars1[i] + chars2[--bLength] - '0' - '0';
                }else {
                    tempArr[i] = chars1[i] - '0';
                }
            }
        }else {
            tempArr = new int[bLength];
            for (int i = tempArr.length - 1; i >= 0; i--) {
                if (aLength > 0){
                    tempArr[i] = chars2[i] + chars1[--aLength] - '0' - '0';
                }else {
                    tempArr[i] = chars2[i] - '0';
                }
            }
        }
        
        for (int i = tempArr.length - 1; i > 0 ; i--) {
            if (tempArr[i] >= 2){
                tempArr[i - 1] = tempArr[i - 1] + 1;
                tempArr[i] = tempArr[i] % 2;
            }
        }

        String result = "";
        if (tempArr[0] >= 2){
            result = "1";
            tempArr[0] = tempArr[0] % 2;
        }

        for (int i : tempArr) {
            result = result + i;
        }
        return result;
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        String s = addBinary2(a, b);
        System.out.println(s);
    }

    public static String addBinary2(String a, String b) {

        StringBuilder stb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;

        int c = 0;  // 进位
        while(i >= 0 || j >= 0) {
            c += i >= 0 ? a.charAt(i --) - '0' : 0;
            c += j >= 0 ? b.charAt(j --) - '0' : 0;
            stb.append(c % 2);
            c = c/2;
        }

        if (c!=0){
            // 追加方法
            stb.append(c);
        }

        // reverse() 反转stb的值
        return stb.reverse().toString();
    }
}
