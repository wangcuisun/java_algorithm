package com.wang.insertion;

/**
 * 插入排序
 */
public class Insertion {
    /**
     * 对数组a中的元素进行排序
     *
     * @param a
     */
    public static void sort(Comparable[] a) {
        //默认第一个元素是排好序的，所以从第二个元素开始遍历
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                //比较索引j和索引j-1处的值，如果索引j-1处的值比索引j处的大，则交换位置；
                //如果不大，则说明找到合适位置了，退出循环
                if (greater(a[j - 1], a[j])) {
                    exchange(a, j - 1, j);
                } else {
                    break;
                }
            }
        }
    }

    /**
     * 比较v元素是否大于w元素
     *
     * @param v
     * @param w
     * @return
     */
    private static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }

    /**
     * 交换数组i位置和j位置处的元素
     *
     * @param a
     * @param i
     * @param j
     */
    private static void exchange(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
