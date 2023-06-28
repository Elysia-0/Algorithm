/**
 * @author Elysia-0
 * date 2023-03-13
 */

/*
给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串 s ，判断字符串是否有效。

有效字符串需满足：

左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
每个右括号都有一个对应的相同类型的左括号。

示例 1：
输入：s = "()"
输出：true

示例2：
输入：s = "()[]{}"
输出：true

示例3：
输入：s = "(]"
输出：false

提示：
1 <= s.length <= 104
s 仅由括号 '()[]{}' 组成
 */
public class demo0020 {

    public static boolean isValid(String s) {
        if (s.length()==0){
            return true;
        }
        int length = s.length();
        int top = -1;
        String[] stack = new String[length];
        for (int i = 0; i < length; i++) {
            String substring = s.substring(i, i+1);
            switch (substring){
                case ")": if (stack[top] != null && stack[top].equals("(")){
                            top--;
                        }else {
                            top++;
                            stack[top] = substring;
                        }
                            break;
                case "]": if (stack[top] != null && stack[top].equals("[")){
                            top--;
                        }else {
                            top++;
                            stack[top] = substring;
                        }
                            break;
                case "}": if (stack[top] != null && stack[top].equals("{")){
                            top--;
                        }else {
                            top++;
                            stack[top] = substring;
                        }
                            break;
                default: top++;stack[top] = substring;break;
            }
        }
        if (stack[top]==null){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        String arr = "(]";
        boolean valid = isValid(arr);
        System.out.println(valid);
    }
}
