package com.wang.shell;

import com.wang.selection.Selection;

import java.util.Arrays;
import java.util.Random;

public class ShellTest {
    public static void main(String[] args) {
        Integer[] a = new Integer[6];
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            a[i] = r.nextInt(100);
        }
        System.out.println("随机获取100以内的整数========排序之前");
        System.out.println(Arrays.toString(a));

        Shell.sort(a);

        System.out.println("随机获取100以内的整数========排序之后");
        System.out.println(Arrays.toString(a));
    }
}
