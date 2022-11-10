package com.wang;

import java.util.Arrays;

/**
 * 反转数组里的元素
 */
public class NumberChange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
