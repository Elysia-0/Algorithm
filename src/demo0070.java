/**
 * @author Elysia-0
 * date 2023-06-28
 */

/*
假设你正在爬楼梯。需要n阶你才能到达楼顶。
每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

示例 1：
输入：n = 2
输出：2
解释：有两种方法可以爬到楼顶。
1. 1 阶 + 1 阶
2. 2 阶

示例 2：
输入：n = 3
输出：3
解释：有三种方法可以爬到楼顶。
1. 1 阶 + 1 阶 + 1 阶
2. 1 阶 + 2 阶
3. 2 阶 + 1 阶

提示：
1 <= n <= 45
 */
public class demo0070 {
    public static int climbStairs(int n) {
        //f(x)=f(x−1)+f(x−2)
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];//dp方程
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 45;
        int i = climbStairs(n);
        System.out.println(i);
    }
}
