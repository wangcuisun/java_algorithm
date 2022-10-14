package com.wang;

/**
 * 计算1-100之和，两种算法
 */
public class NumberSum {
    public static void main(String[] args) {
        System.out.println(method1());
        System.out.println(method2());
    }

    public static int method1() {
        int n = 100;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * 公式
     * @return
     */
    public static int method2() {
        int n = 100;
        int sum = 0;
        sum = (n + 1) * n / 2;
        return sum;
    }
}
