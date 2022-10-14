package com.wang;

/**
 * 计算阶乘，两种方法
 */
public class NumberFactorial {
    public static void main(String[] args) {
        System.out.println(method1(10));
        System.out.println(method2(10));
    }

    public static int method1(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * 递归
     * @param n
     * @return
     */
    public static int method2(int n) {
        if (n == 1) {
            return n;
        }
        return n * method2(n - 1);
    }
}
