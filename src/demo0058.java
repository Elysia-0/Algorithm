/**
 * @author Elysia-0
 * date 2023-03-15
 */

/*
给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。
单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。

示例 1：
输入：s = "Hello World"
输出：5
解释：最后一个单词是“World”，长度为5。

示例 2：
输入：s = "   fly me   to   the moon  "
输出：4
解释：最后一个单词是“moon”，长度为4。

示例 3：
输入：s = "luffy is still joyboy"
输出：6
解释：最后一个单词是长度为6的“joyboy”。

提示：
1 <= s.length <= 104
s 仅有英文字母和空格 ' ' 组成
s 中至少存在一个单词
 */
public class demo0058 {
    public static int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int result = 0;
        int flag = 0;
        for (int i = chars.length -1; i >= 0; i--) {
            if (chars[i] == ' ' && flag == 1){
                flag = 2;
                break;
            }
            if (chars[i] != ' ' && flag != 2){
                flag  = 1;
                result ++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "joyboy";
        int i = lengthOfLastWord(s);
        System.out.println(i);
    }
}
