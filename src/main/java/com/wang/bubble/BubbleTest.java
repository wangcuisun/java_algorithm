package com.wang.bubble;

import java.util.Arrays;
import java.util.Random;

public class BubbleTest {
    public static void main(String[] args) {
        Integer[] a = new Integer[6];
        for (int i = 0; i < 6; i++) {
            Random r = new Random();
            a[i] = r.nextInt(100);
        }
        System.out.println("随机获取100以内的整数========排序之前");
        System.out.println(Arrays.toString(a));

        Bubble.sort(a);

        System.out.println("随机获取100以内的整数========排序之后");
        System.out.println(Arrays.toString(a));
    }
}
